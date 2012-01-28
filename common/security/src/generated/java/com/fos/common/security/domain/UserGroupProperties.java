package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.UserGroupCategoryPermissionProperties.UserGroupCategoryPermissionProperty;
import com.fos.common.security.domain.UserGroupRoleProperties.UserGroupRoleProperty;
import com.fos.common.security.domain.UserProperties.UserProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.UserGroup}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserGroupProperties {
    private static final UserGroupPropertiesImpl<UserGroup> sharedInstance =
        new UserGroupPropertiesImpl<UserGroup>(UserGroup.class);

    private UserGroupProperties() {
    }

    public static Property<UserGroup> id() {
        return sharedInstance.id();
    }

    public static Property<UserGroup> userGroupCode() {
        return sharedInstance.userGroupCode();
    }

    public static Property<UserGroup> userGroupName() {
        return sharedInstance.userGroupName();
    }

    public static Property<UserGroup> userGroupDesc() {
        return sharedInstance.userGroupDesc();
    }

    public static Property<UserGroup> userGroupStatus() {
        return sharedInstance.userGroupStatus();
    }

    public static Property<UserGroup> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<UserGroup> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<UserGroup> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<UserGroup> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<UserGroup> version() {
        return sharedInstance.version();
    }

    public static UserProperty<UserGroup> users() {
        return sharedInstance.users();
    }

    public static UserGroupRoleProperty<UserGroup> userGroupRoles() {
        return sharedInstance.userGroupRoles();
    }

    public static UserGroupCategoryPermissionProperty<UserGroup> userGroupCategoryPermissions() {
        return sharedInstance.userGroupCategoryPermissions();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.UserGroup},
     * i.e. nested property.
     */
    public static class UserGroupProperty<T> extends UserGroupPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserGroupProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserGroupPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserGroupPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserGroupPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> userGroupCode() {
            return new LeafProperty<T>(getParentPath(), "userGroupCode", false,
                owningClass);
        }

        public Property<T> userGroupName() {
            return new LeafProperty<T>(getParentPath(), "userGroupName", false,
                owningClass);
        }

        public Property<T> userGroupDesc() {
            return new LeafProperty<T>(getParentPath(), "userGroupDesc", false,
                owningClass);
        }

        public Property<T> userGroupStatus() {
            return new LeafProperty<T>(getParentPath(), "userGroupStatus",
                false, owningClass);
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

        public UserProperty<T> users() {
            return new UserProperty<T>(getParentPath(), "users", owningClass);
        }

        public UserGroupRoleProperty<T> userGroupRoles() {
            return new UserGroupRoleProperty<T>(getParentPath(),
                "userGroupRoles", owningClass);
        }

        public UserGroupCategoryPermissionProperty<T> userGroupCategoryPermissions() {
            return new UserGroupCategoryPermissionProperty<T>(getParentPath(),
                "userGroupCategoryPermissions", owningClass);
        }
    }
}
