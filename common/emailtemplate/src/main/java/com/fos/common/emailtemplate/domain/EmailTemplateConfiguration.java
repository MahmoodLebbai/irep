/**
 * 
 */
package com.fos.common.emailtemplate.domain;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;

/**
 * @author mahmoodlebbai
 *
 */
@org.springframework.stereotype.Component("emailTemplateConfiguration")
public class EmailTemplateConfiguration implements Serializable {
	
	/**
	 * serialVersionUID as long
	 */
	private static final long serialVersionUID = 8473599869789867246L;
	
	/* TemplateFileDirectory */
	String templateFileDirectory;
	
	
	Configuration ftlConfiguration;

	/**
	 * @return the templateFileDirectory
	 */
	public String getTemplateFileDirectory() {
		return templateFileDirectory;
	}

	/**
	 * @param templateFileDirectory the templateFileDirectory to set
	 */
	public void setTemplateFileDirectory(String templateFileDirectory) {
		this.templateFileDirectory = templateFileDirectory;
	}

	/**
	 * @return the ftlConfiguration
	 */
	public Configuration getFtlConfiguration() {
		return ftlConfiguration;
	}

	/**
	 * @param ftlConfiguration the ftlConfiguration to set
	 */
	public void setFtlConfiguration(Configuration ftlConfiguration) {
		this.ftlConfiguration = ftlConfiguration;
	}
	
	
	/** 
	 * Load FTL Configuration
	 * @throws IOException 
	 */
	public void loadFTLConfiguration() throws IOException
	{
		ftlConfiguration = new Configuration();
		ftlConfiguration.setDirectoryForTemplateLoading(new File(templateFileDirectory));
		ftlConfiguration.setObjectWrapper(new DefaultObjectWrapper());
	}
	
	
	
	
	
	
	
	

}
