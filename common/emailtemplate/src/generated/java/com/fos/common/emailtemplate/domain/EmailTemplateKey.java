package com.fos.common.emailtemplate.domain;

import org.apache.commons.lang.Validate;

import org.fornax.cartridges.sculptor.framework.domain.AbstractDomainObject;
import org.fornax.cartridges.sculptor.framework.util.EqualsHelper;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import javax.validation.constraints.NotNull;

/**
* BasicType representing EmailTemplateKey.
*/
@Embeddable
public class EmailTemplateKey extends AbstractDomainObject {
    private static final long serialVersionUID = 1L;
    @Column(name = "COUNTRY_CODE", nullable = false, length = 2)
    @NotNull
    @Length(max = 2)
    private String country_code;
    @Column(name = "LANG_CODE", nullable = false, length = 2)
    @NotNull
    @Length(max = 2)
    private String lang_code;
    @Column(name = "TEMPLATE_ID", nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private String template_id;
    @Transient
    private transient EmailTemplateKeyKey cachedEmailTemplateKeyKey;

    protected EmailTemplateKey() {
    }

    public EmailTemplateKey(String country_code, String lang_code,
        String template_id) {
        super();
        Validate.notNull(country_code,
            "EmailTemplateKey.country_code must not be null");
        this.country_code = country_code;
        Validate.notNull(lang_code,
            "EmailTemplateKey.lang_code must not be null");
        this.lang_code = lang_code;
        Validate.notNull(template_id,
            "EmailTemplateKey.template_id must not be null");
        this.template_id = template_id;
    }

    /**
     * Creates a new EmailTemplateKey. Typically used with static import to
     * achieve fluent interface.
     */
    public static EmailTemplateKey emailTemplateKey(String country_code,
        String lang_code, String template_id) {
        return new EmailTemplateKey(country_code, lang_code, template_id);
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
     * Creates a copy of this instance, but with another country_code.
     */
    public EmailTemplateKey withCountry_code(String country_code) {
        if (EqualsHelper.equals(country_code, getCountry_code())) {
            return this;
        }
        return new EmailTemplateKey(country_code, getLang_code(),
            getTemplate_id());
    }

    /**
     * Creates a copy of this instance, but with another lang_code.
     */
    public EmailTemplateKey withLang_code(String lang_code) {
        if (EqualsHelper.equals(lang_code, getLang_code())) {
            return this;
        }
        return new EmailTemplateKey(getCountry_code(), lang_code,
            getTemplate_id());
    }

    /**
     * Creates a copy of this instance, but with another template_id.
     */
    public EmailTemplateKey withTemplate_id(String template_id) {
        if (EqualsHelper.equals(template_id, getTemplate_id())) {
            return this;
        }
        return new EmailTemplateKey(getCountry_code(), getLang_code(),
            template_id);
    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getEmailTemplateKeyKey}
     */
    public Object getKey() {
        return getEmailTemplateKeyKey();
    }

    /**
     * The natural key for the domain object is
     * a composite key consisting of several attributes.
     */
    public EmailTemplateKeyKey getEmailTemplateKeyKey() {
        if (cachedEmailTemplateKeyKey == null) {
            cachedEmailTemplateKeyKey = new EmailTemplateKeyKey(getCountry_code(),
                    getLang_code(), getTemplate_id());
        }
        return cachedEmailTemplateKeyKey;
    }

    /**
     * This is the natural key for the domain object.
     * It is a composite key consisting of several
     * attributes.
     */
    public static class EmailTemplateKeyKey {
        private String country_code;
        private String lang_code;
        private String template_id;

        public EmailTemplateKeyKey(String country_code, String lang_code,
            String template_id) {
            this.country_code = country_code;
            this.lang_code = lang_code;
            this.template_id = template_id;

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

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmailTemplateKeyKey)) {
                return false;
            }

            EmailTemplateKeyKey other = (EmailTemplateKeyKey) obj;

            if (!EqualsHelper.equals(getCountry_code(), other.getCountry_code())) {
                return false;
            }
            if (!EqualsHelper.equals(getLang_code(), other.getLang_code())) {
                return false;
            }
            if (!EqualsHelper.equals(getTemplate_id(), other.getTemplate_id())) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 37 * result +
                EqualsHelper.computeHashCode(getCountry_code());
            result = 37 * result +
                EqualsHelper.computeHashCode(getLang_code());
            result = 37 * result +
                EqualsHelper.computeHashCode(getTemplate_id());
            return result;
        }
    }

    // This comment was generated from SpecialCases.xpt 
}
