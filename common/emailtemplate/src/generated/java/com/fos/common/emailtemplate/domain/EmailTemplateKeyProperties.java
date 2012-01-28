package com.fos.common.emailtemplate.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.emailtemplate.domain.EmailTemplateKey}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class EmailTemplateKeyProperties {
    private EmailTemplateKeyProperties() {
    }

    /**
     * This class is used for references to {@link com.fos.common.emailtemplate.domain.EmailTemplateKey},
     * i.e. nested property.
     */
    public static class EmailTemplateKeyProperty<T>
        extends EmailTemplateKeyPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public EmailTemplateKeyProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class EmailTemplateKeyPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        EmailTemplateKeyPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        EmailTemplateKeyPropertiesImpl(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> country_code() {
            return new LeafProperty<T>(getParentPath(), "country_code", true,
                owningClass);
        }

        public Property<T> lang_code() {
            return new LeafProperty<T>(getParentPath(), "lang_code", true,
                owningClass);
        }

        public Property<T> template_id() {
            return new LeafProperty<T>(getParentPath(), "template_id", true,
                owningClass);
        }
    }
}
