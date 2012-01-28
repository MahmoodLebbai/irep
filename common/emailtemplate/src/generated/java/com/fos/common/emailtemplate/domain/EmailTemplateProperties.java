package com.fos.common.emailtemplate.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.emailtemplate.domain.EmailTemplateKeyProperties.EmailTemplateKeyProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.emailtemplate.domain.EmailTemplate}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class EmailTemplateProperties {
    private static final EmailTemplatePropertiesImpl<EmailTemplate> sharedInstance =
        new EmailTemplatePropertiesImpl<EmailTemplate>(EmailTemplate.class);

    private EmailTemplateProperties() {
    }

    public static Property<EmailTemplate> id() {
        return sharedInstance.id();
    }

    public static Property<EmailTemplate> ftlFilePath() {
        return sharedInstance.ftlFilePath();
    }

    public static Property<EmailTemplate> status() {
        return sharedInstance.status();
    }

    public static Property<EmailTemplate> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<EmailTemplate> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<EmailTemplate> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<EmailTemplate> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<EmailTemplate> version() {
        return sharedInstance.version();
    }

    public static EmailTemplateKeyProperty<EmailTemplate> emailTemplateKey() {
        return sharedInstance.emailTemplateKey();
    }

    /**
     * This class is used for references to {@link com.fos.common.emailtemplate.domain.EmailTemplate},
     * i.e. nested property.
     */
    public static class EmailTemplateProperty<T>
        extends EmailTemplatePropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public EmailTemplateProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class EmailTemplatePropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        EmailTemplatePropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        EmailTemplatePropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> ftlFilePath() {
            return new LeafProperty<T>(getParentPath(), "ftlFilePath", false,
                owningClass);
        }

        public Property<T> status() {
            return new LeafProperty<T>(getParentPath(), "status", false,
                owningClass);
        }

        public Property<T> createdDate() {
            return new LeafProperty<T>(getParentPath(), "createdDate", false,
                owningClass);
        }

        public Property<T> createdBy() {
            return new LeafProperty<T>(getParentPath(), "createdBy", false,
                owningClass);
        }

        public Property<T> lastUpdated() {
            return new LeafProperty<T>(getParentPath(), "lastUpdated", false,
                owningClass);
        }

        public Property<T> lastUpdatedBy() {
            return new LeafProperty<T>(getParentPath(), "lastUpdatedBy", false,
                owningClass);
        }

        public Property<T> version() {
            return new LeafProperty<T>(getParentPath(), "version", false,
                owningClass);
        }

        public EmailTemplateKeyProperty<T> emailTemplateKey() {
            return new EmailTemplateKeyProperty<T>(getParentPath(),
                "emailTemplateKey", owningClass);
        }
    }
}
