package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.PermissionProperties.PermissionProperty;
import com.fos.common.security.domain.RoleProperties.RoleProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.RolePermission}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class RolePermissionProperties {
    private static final RolePermissionPropertiesImpl<RolePermission> sharedInstance =
        new RolePermissionPropertiesImpl<RolePermission>(RolePermission.class);

    private RolePermissionProperties() {
    }

    public static Property<RolePermission> id() {
        return sharedInstance.id();
    }

    public static Property<RolePermission> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<RolePermission> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<RolePermission> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<RolePermission> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<RolePermission> version() {
        return sharedInstance.version();
    }

    public static RoleProperty<RolePermission> role() {
        return sharedInstance.role();
    }

    public static PermissionProperty<RolePermission> permission() {
        return sharedInstance.permission();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.RolePermission},
     * i.e. nested property.
     */
    public static class RolePermissionProperty<T>
        extends RolePermissionPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public RolePermissionProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class RolePermissionPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        RolePermissionPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        RolePermissionPropertiesImpl(String parentPath, String additionalPath,
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

        public PermissionProperty<T> permission() {
            return new PermissionProperty<T>(getParentPath(), "permission",
                owningClass);
        }
    }
}
