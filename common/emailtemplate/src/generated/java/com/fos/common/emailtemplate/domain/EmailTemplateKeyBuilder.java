package com.fos.common.emailtemplate.domain;


/**
  * Builder for EmailTemplateKey class.
  */
public class EmailTemplateKeyBuilder {
    private String country_code;
    private String lang_code;
    private String template_id;

    public EmailTemplateKeyBuilder() {
    }

    public EmailTemplateKeyBuilder(String country_code, String lang_code,
        String template_id) {
        this.country_code = country_code;

        this.lang_code = lang_code;

        this.template_id = template_id;

    }

    /**
     * Static factor method for EmailTemplateKeyBuilder
     */
    public static EmailTemplateKeyBuilder emailTemplateKey() {
        return new EmailTemplateKeyBuilder();
    }

    public EmailTemplateKeyBuilder country_code(String val) {
        this.country_code = val;
        return this;
    }

    public EmailTemplateKeyBuilder lang_code(String val) {
        this.lang_code = val;
        return this;
    }

    public EmailTemplateKeyBuilder template_id(String val) {
        this.template_id = val;
        return this;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getLang_code() {
        return lang_code;
    }

    public String getTemplate_id() {
        return template_id;
    }

    /**
     * @return new EmailTemplateKey instance constructed based on the values that have been set into this builder
     */
    public EmailTemplateKey build() {
        EmailTemplateKey obj =
            new EmailTemplateKey(getCountry_code(), getLang_code(),
                getTemplate_id());

        return obj;
    }
}
