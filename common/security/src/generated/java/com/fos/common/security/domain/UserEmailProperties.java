package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.UserProperties.UserProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.UserEmail}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserEmailProperties {
    private static final UserEmailPropertiesImpl<UserEmail> sharedInstance =
        new UserEmailPropertiesImpl<UserEmail>(UserEmail.class);

    private UserEmailProperties() {
    }

    public static Property<UserEmail> id() {
        return sharedInstance.id();
    }

    public static Property<UserEmail> emailType() {
        return sharedInstance.emailType();
    }

    public static Property<UserEmail> emailId() {
        return sharedInstance.emailId();
    }

    public static Property<UserEmail> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<UserEmail> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<UserEmail> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<UserEmail> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<UserEmail> version() {
        return sharedInstance.version();
    }

    public static UserProperty<UserEmail> user() {
        return sharedInstance.user();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.UserEmail},
     * i.e. nested property.
     */
    public static class UserEmailProperty<T> extends UserEmailPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserEmailProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserEmailPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserEmailPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserEmailPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> emailType() {
            return new LeafProperty<T>(getParentPath(), "emailType", false,
                owningClass);
        }

        public Property<T> emailId() {
            return new LeafProperty<T>(getParentPath(), "emailId", false,
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

        public UserProperty<T> user() {
            return new UserProperty<T>(getParentPath(), "user", owningClass);
        }
    }
}
