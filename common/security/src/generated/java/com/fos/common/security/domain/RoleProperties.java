package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.RolePermissionProperties.RolePermissionProperty;
import com.fos.common.security.domain.UserGroupRoleProperties.UserGroupRoleProperty;
import com.fos.common.security.domain.UserRoleProperties.UserRoleProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.Role}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class RoleProperties {
    private static final RolePropertiesImpl<Role> sharedInstance =
        new RolePropertiesImpl<Role>(Role.class);

    private RoleProperties() {
    }

    public static Property<Role> id() {
        return sharedInstance.id();
    }

    public static Property<Role> roleCode() {
        return sharedInstance.roleCode();
    }

    public static Property<Role> roleName() {
        return sharedInstance.roleName();
    }

    public static Property<Role> roleDesc() {
        return sharedInstance.roleDesc();
    }

    public static Property<Role> roleStatus() {
        return sharedInstance.roleStatus();
    }

    public static Property<Role> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<Role> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<Role> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<Role> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<Role> version() {
        return sharedInstance.version();
    }

    public static RolePermissionProperty<Role> rolePermissions() {
        return sharedInstance.rolePermissions();
    }

    public static UserRoleProperty<Role> userRoles() {
        return sharedInstance.userRoles();
    }

    public static UserGroupRoleProperty<Role> userGroupRoles() {
        return sharedInstance.userGroupRoles();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.Role},
     * i.e. nested property.
     */
    public static class RoleProperty<T> extends RolePropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public RoleProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class RolePropertiesImpl<T> extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        RolePropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        RolePropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> roleCode() {
            return new LeafProperty<T>(getParentPath(), "roleCode", false,
                owningClass);
        }

        public Property<T> roleName() {
            return new LeafProperty<T>(getParentPath(), "roleName", false,
                owningClass);
        }

        public Property<T> roleDesc() {
            return new LeafProperty<T>(getParentPath(), "roleDesc", false,
                owningClass);
        }

        public Property<T> roleStatus() {
            return new LeafProperty<T>(getParentPath(), "roleStatus", false,
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

        public RolePermissionProperty<T> rolePermissions() {
            return new RolePermissionProperty<T>(getParentPath(),
                "rolePermissions", owningClass);
        }

        public UserRoleProperty<T> userRoles() {
            return new UserRoleProperty<T>(getParentPath(), "userRoles",
                owningClass);
        }

        public UserGroupRoleProperty<T> userGroupRoles() {
            return new UserGroupRoleProperty<T>(getParentPath(),
                "userGroupRoles", owningClass);
        }
    }
}
