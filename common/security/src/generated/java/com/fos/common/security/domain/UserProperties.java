package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.DepartmentProperties.DepartmentProperty;
import com.fos.common.security.domain.UserCategoryPermissionProperties.UserCategoryPermissionProperty;
import com.fos.common.security.domain.UserDelegationProperties.UserDelegationProperty;
import com.fos.common.security.domain.UserEmailProperties.UserEmailProperty;
import com.fos.common.security.domain.UserGroupProperties.UserGroupProperty;
import com.fos.common.security.domain.UserPhoneProperties.UserPhoneProperty;
import com.fos.common.security.domain.UserProperties.UserProperty;
import com.fos.common.security.domain.UserRoleProperties.UserRoleProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.User}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserProperties {
    private static final UserPropertiesImpl<User> sharedInstance =
        new UserPropertiesImpl<User>(User.class);

    private UserProperties() {
    }

    public static Property<User> id() {
        return sharedInstance.id();
    }

    public static Property<User> userId() {
        return sharedInstance.userId();
    }

    public static Property<User> firstName() {
        return sharedInstance.firstName();
    }

    public static Property<User> middleName() {
        return sharedInstance.middleName();
    }

    public static Property<User> lastName() {
        return sharedInstance.lastName();
    }

    public static Property<User> password() {
        return sharedInstance.password();
    }

    public static Property<User> passwordExpiryDate() {
        return sharedInstance.passwordExpiryDate();
    }

    public static Property<User> dateOfBirth() {
        return sharedInstance.dateOfBirth();
    }

    public static Property<User> userStatus() {
        return sharedInstance.userStatus();
    }

    public static Property<User> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<User> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<User> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<User> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<User> version() {
        return sharedInstance.version();
    }

    public static DepartmentProperty<User> department() {
        return sharedInstance.department();
    }

    public static UserProperty<User> reportingUser() {
        return sharedInstance.reportingUser();
    }

    public static UserGroupProperty<User> userGroup() {
        return sharedInstance.userGroup();
    }

    public static UserCategoryPermissionProperty<User> userCategoryPermissions() {
        return sharedInstance.userCategoryPermissions();
    }

    public static UserEmailProperty<User> emails() {
        return sharedInstance.emails();
    }

    public static UserPhoneProperty<User> phones() {
        return sharedInstance.phones();
    }

    public static UserRoleProperty<User> userRoles() {
        return sharedInstance.userRoles();
    }

    public static UserDelegationProperty<User> userDelegations() {
        return sharedInstance.userDelegations();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.User},
     * i.e. nested property.
     */
    public static class UserProperty<T> extends UserPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserPropertiesImpl<T> extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> userId() {
            return new LeafProperty<T>(getParentPath(), "userId", false,
                owningClass);
        }

        public Property<T> firstName() {
            return new LeafProperty<T>(getParentPath(), "firstName", false,
                owningClass);
        }

        public Property<T> middleName() {
            return new LeafProperty<T>(getParentPath(), "middleName", false,
                owningClass);
        }

        public Property<T> lastName() {
            return new LeafProperty<T>(getParentPath(), "lastName", false,
                owningClass);
        }

        public Property<T> password() {
            return new LeafProperty<T>(getParentPath(), "password", false,
                owningClass);
        }

        public Property<T> passwordExpiryDate() {
            return new LeafProperty<T>(getParentPath(), "passwordExpiryDate",
                false, owningClass);
        }

        public Property<T> dateOfBirth() {
            return new LeafProperty<T>(getParentPath(), "dateOfBirth", false,
                owningClass);
        }

        public Property<T> userStatus() {
            return new LeafProperty<T>(getParentPath(), "userStatus", false,
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

        public DepartmentProperty<T> department() {
            return new DepartmentProperty<T>(getParentPath(), "department",
                owningClass);
        }

        public UserProperty<T> reportingUser() {
            return new UserProperty<T>(getParentPath(), "reportingUser",
                owningClass);
        }

        public UserGroupProperty<T> userGroup() {
            return new UserGroupProperty<T>(getParentPath(), "userGroup",
                owningClass);
        }

        public UserCategoryPermissionProperty<T> userCategoryPermissions() {
            return new UserCategoryPermissionProperty<T>(getParentPath(),
                "userCategoryPermissions", owningClass);
        }

        public UserEmailProperty<T> emails() {
            return new UserEmailProperty<T>(getParentPath(), "emails",
                owningClass);
        }

        public UserPhoneProperty<T> phones() {
            return new UserPhoneProperty<T>(getParentPath(), "phones",
                owningClass);
        }

        public UserRoleProperty<T> userRoles() {
            return new UserRoleProperty<T>(getParentPath(), "userRoles",
                owningClass);
        }

        public UserDelegationProperty<T> userDelegations() {
            return new UserDelegationProperty<T>(getParentPath(),
                "userDelegations", owningClass);
        }
    }
}
