package com.fos.common.emailtemplate.repository;

import java.util.List;

import com.fos.common.emailtemplate.domain.EmailTemplate;

/**
 * Generated interface for Repository for EmailTemplate
 */
public interface EmailTemplateRepository {
    public static final String BEAN_ID = "emailTemplateRepository";

    public List<EmailTemplate> getEmailTemplate(String countryCode,
        String languageCode, String templateId)
        throws com.fos.common.emailtemplate.exception.EmailTemplateNotFoundException;

    public EmailTemplate findById(Long id);

    public List<EmailTemplate> findAll();

    public EmailTemplate save(EmailTemplate entity);

    public void delete(EmailTemplate entity);
}
