package com.fos.common.emailtemplate.repositoryimpl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.fos.common.emailtemplate.constants.NamedQueries;
import com.fos.common.emailtemplate.domain.EmailTemplate;

/**
 * Repository implementation for EmailTemplate
 */
@Repository("emailTemplateRepository")
@javax.persistence.NamedQuery(name="ET.LIST_EMAILTEMPLATE_BY_COUNTRY_LANG_TEMPLATE" , query=NamedQueries.LIST_EMAILTEMPLATE_BY_COUNTRY_LANG_TEMPLATE)

public class EmailTemplateRepositoryImpl extends EmailTemplateRepositoryBase {
	
    public EmailTemplateRepositoryImpl() {
    }
    

    @SuppressWarnings("unchecked")
	public List<EmailTemplate> getEmailTemplate(String countryCode,
        String languageCode, String templateId) {
    	Query emailTempalteListQuery = this.getEntityManager().createNamedQuery("ET.LIST_EMAILTEMPLATE_BY_COUNTRY_LANG_TEMPLATE");
    	emailTempalteListQuery.setParameter("countryCode", countryCode);
    	emailTempalteListQuery.setParameter("langCode", languageCode);
    	emailTempalteListQuery.setParameter("templateId", templateId);
		return (List<EmailTemplate>)emailTempalteListQuery.getResultList();

    }
}
