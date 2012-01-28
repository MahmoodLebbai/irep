package com.fos.common.emailtemplate.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.fos.common.emailtemplate.domain.EmailTemplate;
import com.fos.common.emailtemplate.exception.EmailTemplateNotFoundException;
import com.fos.common.emailtemplate.repository.EmailTemplateRepository;
import com.fos.common.emailtemplate.service.EmailTemplateService;

/**
 * Generated base class for implementation of EmailTemplateService.
 * <p>Make sure that subclass defines the following annotations:
 * <pre>

@org.springframework.stereotype.Service("emailTemplateService")

 * </pre>
 *
 */
public abstract class EmailTemplateServiceImplBase
    implements EmailTemplateService {
    @Autowired
    private EmailTemplateRepository emailTemplateRepository;

    public EmailTemplateServiceImplBase() {
    }

    protected EmailTemplateRepository getEmailTemplateRepository() {
        return emailTemplateRepository;
    }

    /**
     * Delegates to {@link com.fos.common.emailtemplate.repository.EmailTemplateRepository#getEmailTemplate}
     */
    public List<EmailTemplate> getEmailTemplate(String countryCode,
        String languageCode, String templateId)
        throws EmailTemplateNotFoundException {
        return emailTemplateRepository.getEmailTemplate(countryCode,
            languageCode, templateId);

    }

    /**
     * Delegates to {@link com.fos.common.emailtemplate.repository.EmailTemplateRepository#findById}
     */
    public EmailTemplate findById(Long id) {
        return emailTemplateRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.emailtemplate.repository.EmailTemplateRepository#findAll}
     */
    public List<EmailTemplate> findAll() {
        return emailTemplateRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.emailtemplate.repository.EmailTemplateRepository#save}
     */
    public EmailTemplate save(EmailTemplate entity) {
        return emailTemplateRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.emailtemplate.repository.EmailTemplateRepository#delete}
     */
    public void delete(EmailTemplate entity) {
        emailTemplateRepository.delete(entity);

    }
}
