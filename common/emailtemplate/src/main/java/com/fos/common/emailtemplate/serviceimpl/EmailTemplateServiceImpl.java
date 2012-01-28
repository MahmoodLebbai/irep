package com.fos.common.emailtemplate.serviceimpl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fos.common.emailtemplate.domain.EmailTemplate;
import com.fos.common.emailtemplate.domain.EmailTemplateConfiguration;
import com.fos.common.emailtemplate.domain.EmailTemplatesEnum;
import com.fos.common.emailtemplate.exception.EmailTemplateException;
import com.fos.common.emailtemplate.exception.EmailTemplateNotFoundException;

import freemarker.template.SimpleHash;
import freemarker.template.Template;
import freemarker.template.TemplateException;



/**
 * Implementation of EmailTemplateService.
 */
@Service("emailTemplateService")
public class EmailTemplateServiceImpl extends EmailTemplateServiceImplBase {
	
	
	@Autowired
	private EmailTemplateConfiguration emailTemplateConfiguration;
	
	
    public EmailTemplateServiceImpl() {
    }

   

	/**
	 * @return the emailTemplateConfiguration
	 */
	public EmailTemplateConfiguration getEmailTemplateConfiguration() {
		return emailTemplateConfiguration;
	}

	/**
	 * @param emailTemplateConfiguration the emailTemplateConfiguration to set
	 */
	public void setEmailTemplateConfiguration(
			EmailTemplateConfiguration emailTemplateConfiguration) {
		this.emailTemplateConfiguration = emailTemplateConfiguration;
	}
	
	
	/**
	 * getDataModel - Get the dataModel Map necessary for FreeMarker Template to merge data on to FreeMarker Template
	 */
	private SimpleHash getDataModel(Map<String , Object> dataModel , String dataModelKey)
	{
		SimpleHash dataModelHash = new SimpleHash();
		dataModelHash.putAll(dataModel);
		return dataModelHash;
		
	}



	@Override
	public String getEmailContent(String countryCode, String languageCode,
			EmailTemplatesEnum emailTemplateType, Map<String, Object> dataModel)
			throws EmailTemplateException {
		String emailContent = "";
        String templateId = emailTemplateType.name();
        String templateFile = "";
        ByteArrayOutputStream outputStream = null;
        
        try 
        {
        	
			List<EmailTemplate> emailTemplateList = this.getEmailTemplateRepository().getEmailTemplate(countryCode, languageCode, templateId);
			if(emailTemplateList == null || emailTemplateList.size() <= 0 )
				throw new EmailTemplateException("There is no active Email Template in the database for the country code = " + countryCode + ". Language Code = " + languageCode + " Template Code = " + templateId);
		    templateFile = emailTemplateList.get(0).getFtlFilePath();
			Template ftlTemplate = this.getEmailTemplateConfiguration().getFtlConfiguration().getTemplate(templateFile);
			SimpleHash dataModelHash = this.getDataModel(dataModel, templateFile);
		    outputStream = new ByteArrayOutputStream();
			Writer writer = new OutputStreamWriter(outputStream);
			ftlTemplate.process(dataModelHash, writer);
			emailContent =  outputStream.toString();
			
			
				
		} catch (EmailTemplateNotFoundException e) {
			throw new EmailTemplateException("User Registeration Email Template not found in database for the country code = " + countryCode + ". Language Code = " + languageCode + " Template Code = " + templateId + ".Error Message = " + e.getMessage());
		} catch (IOException e) {
			throw new EmailTemplateException("Error in Reteriving the template file for the country code = " + countryCode + ". Language Code = " + languageCode + " Template Code = " + templateId + " and template File name = " + templateFile + ".Error Message = " + e.getMessage());
		} catch (TemplateException e) {
			throw new EmailTemplateException("Error in Processing the template file with the data model for the country code = " + countryCode + ". Language Code = " + languageCode + " Template Code = " + templateId + " and template File name = " + templateFile + ".Error Message = " + e.getMessage());
		}
		finally
		{
			if(outputStream != null)
			{
				try
				{
					outputStream.flush();
					outputStream.close();
				}
				catch(Exception e)
				{
					throw new EmailTemplateException("Error in flusing or closing the output stream for the country code = " + countryCode + ". Language Code = " + languageCode + " Template Code = " + templateId + " and template File name = " + templateFile + ".Error Message = " + e.getMessage());
					
				}
				
			}
				
		}
        return emailContent;
	}




}
