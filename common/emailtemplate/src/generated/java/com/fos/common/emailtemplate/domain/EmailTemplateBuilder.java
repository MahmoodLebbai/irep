package com.fos.common.emailtemplate.domain;

import java.util.Date;

/**
  * Builder for EmailTemplate class.
  */
public class EmailTemplateBuilder {
    private String ftlFilePath;
    private Boolean status;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private EmailTemplateKey emailTemplateKey;

    public EmailTemplateBuilder() {
    }

    public EmailTemplateBuilder(EmailTemplateKey emailTemplateKey) {
        this.emailTemplateKey = emailTemplateKey;

    }

    /**
     * Static factor method for EmailTemplateBuilder
     */
    public static EmailTemplateBuilder emailTemplate() {
        return new EmailTemplateBuilder();
    }

    public EmailTemplateBuilder ftlFilePath(String val) {
        this.ftlFilePath = val;
        return this;
    }

    public EmailTemplateBuilder status(Boolean val) {
        this.status = val;
        return this;
    }

    public EmailTemplateBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public EmailTemplateBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public EmailTemplateBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public EmailTemplateBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public EmailTemplateBuilder emailTemplateKey(
        EmailTemplateKey emailTemplateKey) {
        this.emailTemplateKey = emailTemplateKey;
        return this;
    }

    public String getFtlFilePath() {
        return ftlFilePath;
    }

    public Boolean getStatus() {
        return status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public EmailTemplateKey getEmailTemplateKey() {
        return emailTemplateKey;
    }

    /**
     * @return new EmailTemplate instance constructed based on the values that have been set into this builder
     */
    public EmailTemplate build() {
        EmailTemplate obj = new EmailTemplate(getEmailTemplateKey());

        obj.setFtlFilePath(ftlFilePath);

        obj.setStatus(status);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        return obj;
    }
}
