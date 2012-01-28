package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.ModulesProperties.ModulesProperty;
import com.fos.common.security.domain.PermissionProperties.PermissionProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.Operation}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class OperationProperties {
    private static final OperationPropertiesImpl<Operation> sharedInstance =
        new OperationPropertiesImpl<Operation>(Operation.class);

    private OperationProperties() {
    }

    public static Property<Operation> id() {
        return sharedInstance.id();
    }

    public static Property<Operation> functionCode() {
        return sharedInstance.functionCode();
    }

    public static Property<Operation> functionName() {
        return sharedInstance.functionName();
    }

    public static Property<Operation> functionDesc() {
        return sharedInstance.functionDesc();
    }

    public static Property<Operation> functionStatus() {
        return sharedInstance.functionStatus();
    }

    public static Property<Operation> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<Operation> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<Operation> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<Operation> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<Operation> version() {
        return sharedInstance.version();
    }

    public static ModulesProperty<Operation> module() {
        return sharedInstance.module();
    }

    public static PermissionProperty<Operation> permissions() {
        return sharedInstance.permissions();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.Operation},
     * i.e. nested property.
     */
    public static class OperationProperty<T> extends OperationPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public OperationProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class OperationPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        OperationPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        OperationPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> functionCode() {
            return new LeafProperty<T>(getParentPath(), "functionCode", false,
                owningClass);
        }

        public Property<T> functionName() {
            return new LeafProperty<T>(getParentPath(), "functionName", false,
                owningClass);
        }

        public Property<T> functionDesc() {
            return new LeafProperty<T>(getParentPath(), "functionDesc", false,
                owningClass);
        }

        public Property<T> functionStatus() {
            return new LeafProperty<T>(getParentPath(), "functionStatus",
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

        public ModulesProperty<T> module() {
            return new ModulesProperty<T>(getParentPath(), "module", owningClass);
        }

        public PermissionProperty<T> permissions() {
            return new PermissionProperty<T>(getParentPath(), "permissions",
                owningClass);
        }
    }
}
