package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.OperationProperties.OperationProperty;
import com.fos.common.security.domain.RolePermissionProperties.RolePermissionProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.Permission}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class PermissionProperties {
    private static final PermissionPropertiesImpl<Permission> sharedInstance =
        new PermissionPropertiesImpl<Permission>(Permission.class);

    private PermissionProperties() {
    }

    public static Property<Permission> id() {
        return sharedInstance.id();
    }

    public static Property<Permission> permissionCode() {
        return sharedInstance.permissionCode();
    }

    public static Property<Permission> createFlag() {
        return sharedInstance.createFlag();
    }

    public static Property<Permission> modifyFlag() {
        return sharedInstance.modifyFlag();
    }

    public static Property<Permission> deleteFlag() {
        return sharedInstance.deleteFlag();
    }

    public static Property<Permission> viewFlag() {
        return sharedInstance.viewFlag();
    }

    public static Property<Permission> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<Permission> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<Permission> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<Permission> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<Permission> version() {
        return sharedInstance.version();
    }

    public static OperationProperty<Permission> operation() {
        return sharedInstance.operation();
    }

    public static RolePermissionProperty<Permission> rolePermissions() {
        return sharedInstance.rolePermissions();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.Permission},
     * i.e. nested property.
     */
    public static class PermissionProperty<T> extends PermissionPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public PermissionProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class PermissionPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        PermissionPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        PermissionPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> permissionCode() {
            return new LeafProperty<T>(getParentPath(), "permissionCode",
                false, owningClass);
        }

        public Property<T> createFlag() {
            return new LeafProperty<T>(getParentPath(), "createFlag", false,
                owningClass);
        }

        public Property<T> modifyFlag() {
            return new LeafProperty<T>(getParentPath(), "modifyFlag", false,
                owningClass);
        }

        public Property<T> deleteFlag() {
            return new LeafProperty<T>(getParentPath(), "deleteFlag", false,
                owningClass);
        }

        public Property<T> viewFlag() {
            return new LeafProperty<T>(getParentPath(), "viewFlag", false,
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

        public OperationProperty<T> operation() {
            return new OperationProperty<T>(getParentPath(), "operation",
                owningClass);
        }

        public RolePermissionProperty<T> rolePermissions() {
            return new RolePermissionProperty<T>(getParentPath(),
                "rolePermissions", owningClass);
        }
    }
}
