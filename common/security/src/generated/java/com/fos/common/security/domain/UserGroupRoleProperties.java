package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.RoleProperties.RoleProperty;
import com.fos.common.security.domain.UserGroupProperties.UserGroupProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.UserGroupRole}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserGroupRoleProperties {
    private static final UserGroupRolePropertiesImpl<UserGroupRole> sharedInstance =
        new UserGroupRolePropertiesImpl<UserGroupRole>(UserGroupRole.class);

    private UserGroupRoleProperties() {
    }

    public static Property<UserGroupRole> id() {
        return sharedInstance.id();
    }

    public static Property<UserGroupRole> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<UserGroupRole> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<UserGroupRole> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<UserGroupRole> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<UserGroupRole> version() {
        return sharedInstance.version();
    }

    public static UserGroupProperty<UserGroupRole> userGroup() {
        return sharedInstance.userGroup();
    }

    public static RoleProperty<UserGroupRole> role() {
        return sharedInstance.role();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.UserGroupRole},
     * i.e. nested property.
     */
    public static class UserGroupRoleProperty<T>
        extends UserGroupRolePropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserGroupRoleProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserGroupRolePropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserGroupRolePropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserGroupRolePropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
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

        public UserGroupProperty<T> userGroup() {
            return new UserGroupProperty<T>(getParentPath(), "userGroup",
                owningClass);
        }

        public RoleProperty<T> role() {
            return new RoleProperty<T>(getParentPath(), "role", owningClass);
        }
    }
}
