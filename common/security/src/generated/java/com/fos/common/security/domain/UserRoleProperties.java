package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.RoleProperties.RoleProperty;
import com.fos.common.security.domain.UserProperties.UserProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.UserRole}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserRoleProperties {
    private static final UserRolePropertiesImpl<UserRole> sharedInstance =
        new UserRolePropertiesImpl<UserRole>(UserRole.class);

    private UserRoleProperties() {
    }

    public static Property<UserRole> id() {
        return sharedInstance.id();
    }

    public static Property<UserRole> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<UserRole> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<UserRole> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<UserRole> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<UserRole> version() {
        return sharedInstance.version();
    }

    public static RoleProperty<UserRole> role() {
        return sharedInstance.role();
    }

    public static UserProperty<UserRole> user() {
        return sharedInstance.user();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.UserRole},
     * i.e. nested property.
     */
    public static class UserRoleProperty<T> extends UserRolePropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserRoleProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserRolePropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserRolePropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserRolePropertiesImpl(String parentPath, String additionalPath,
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

        public RoleProperty<T> role() {
            return new RoleProperty<T>(getParentPath(), "role", owningClass);
        }

        public UserProperty<T> user() {
            return new UserProperty<T>(getParentPath(), "user", owningClass);
        }
    }
}
