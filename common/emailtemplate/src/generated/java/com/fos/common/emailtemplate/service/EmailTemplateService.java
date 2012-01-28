package com.fos.common.emailtemplate.service;

import java.util.List;
import java.util.Map;

import com.fos.common.emailtemplate.domain.EmailTemplate;
import com.fos.common.emailtemplate.domain.EmailTemplatesEnum;

/**
 * Generated interface for the Service EmailTemplateService.
 */
public interface EmailTemplateService {
    public static final String BEAN_ID = "emailTemplateService";

    public List<EmailTemplate> getEmailTemplate(String countryCode,
        String languageCode, String templateId)
        throws com.fos.common.emailtemplate.exception.EmailTemplateNotFoundException;

    public String getEmailContent(String countryCode, String languageCode,
        EmailTemplatesEnum emailTemplateType, Map<String, Object> dataModel)
        throws com.fos.common.emailtemplate.exception.EmailTemplateException;

    public EmailTemplate findById(Long id);

    public List<EmailTemplate> findAll();

    public EmailTemplate save(EmailTemplate entity);

    public void delete(EmailTemplate entity);
}
