package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.UserProperties.UserProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.UserPhone}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserPhoneProperties {
    private static final UserPhonePropertiesImpl<UserPhone> sharedInstance =
        new UserPhonePropertiesImpl<UserPhone>(UserPhone.class);

    private UserPhoneProperties() {
    }

    public static Property<UserPhone> id() {
        return sharedInstance.id();
    }

    public static Property<UserPhone> phoneType() {
        return sharedInstance.phoneType();
    }

    public static Property<UserPhone> phoneNumber() {
        return sharedInstance.phoneNumber();
    }

    public static Property<UserPhone> uuid() {
        return sharedInstance.uuid();
    }

    public static Property<UserPhone> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<UserPhone> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<UserPhone> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<UserPhone> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<UserPhone> version() {
        return sharedInstance.version();
    }

    public static UserProperty<UserPhone> user() {
        return sharedInstance.user();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.UserPhone},
     * i.e. nested property.
     */
    public static class UserPhoneProperty<T> extends UserPhonePropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserPhoneProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserPhonePropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserPhonePropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserPhonePropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> phoneType() {
            return new LeafProperty<T>(getParentPath(), "phoneType", false,
                owningClass);
        }

        public Property<T> phoneNumber() {
            return new LeafProperty<T>(getParentPath(), "phoneNumber", false,
                owningClass);
        }

        public Property<T> uuid() {
            return new LeafProperty<T>(getParentPath(), "uuid", false,
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
