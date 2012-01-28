package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.UserProperties.UserProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.UserDelegation}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserDelegationProperties {
    private static final UserDelegationPropertiesImpl<UserDelegation> sharedInstance =
        new UserDelegationPropertiesImpl<UserDelegation>(UserDelegation.class);

    private UserDelegationProperties() {
    }

    public static Property<UserDelegation> id() {
        return sharedInstance.id();
    }

    public static Property<UserDelegation> delegationStatus() {
        return sharedInstance.delegationStatus();
    }

    public static Property<UserDelegation> startDate() {
        return sharedInstance.startDate();
    }

    public static Property<UserDelegation> endDate() {
        return sharedInstance.endDate();
    }

    public static Property<UserDelegation> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<UserDelegation> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<UserDelegation> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<UserDelegation> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<UserDelegation> version() {
        return sharedInstance.version();
    }

    public static UserProperty<UserDelegation> user() {
        return sharedInstance.user();
    }

    public static UserProperty<UserDelegation> delegatedUser() {
        return sharedInstance.delegatedUser();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.UserDelegation},
     * i.e. nested property.
     */
    public static class UserDelegationProperty<T>
        extends UserDelegationPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserDelegationProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserDelegationPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserDelegationPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserDelegationPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> delegationStatus() {
            return new LeafProperty<T>(getParentPath(), "delegationStatus",
                false, owningClass);
        }

        public Property<T> startDate() {
            return new LeafProperty<T>(getParentPath(), "startDate", false,
                owningClass);
        }

        public Property<T> endDate() {
            return new LeafProperty<T>(getParentPath(), "endDate", false,
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

        public UserProperty<T> delegatedUser() {
            return new UserProperty<T>(getParentPath(), "delegatedUser",
                owningClass);
        }
    }
}
