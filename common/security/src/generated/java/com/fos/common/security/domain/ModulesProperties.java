package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.ApplicationsProperties.ApplicationsProperty;
import com.fos.common.security.domain.OperationProperties.OperationProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.Modules}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class ModulesProperties {
    private static final ModulesPropertiesImpl<Modules> sharedInstance =
        new ModulesPropertiesImpl<Modules>(Modules.class);

    private ModulesProperties() {
    }

    public static Property<Modules> id() {
        return sharedInstance.id();
    }

    public static Property<Modules> moduleCode() {
        return sharedInstance.moduleCode();
    }

    public static Property<Modules> moduleName() {
        return sharedInstance.moduleName();
    }

    public static Property<Modules> moduleDesc() {
        return sharedInstance.moduleDesc();
    }

    public static Property<Modules> moduleStatus() {
        return sharedInstance.moduleStatus();
    }

    public static Property<Modules> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<Modules> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<Modules> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<Modules> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<Modules> version() {
        return sharedInstance.version();
    }

    public static ApplicationsProperty<Modules> application() {
        return sharedInstance.application();
    }

    public static OperationProperty<Modules> operations() {
        return sharedInstance.operations();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.Modules},
     * i.e. nested property.
     */
    public static class ModulesProperty<T> extends ModulesPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public ModulesProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class ModulesPropertiesImpl<T> extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        ModulesPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        ModulesPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> moduleCode() {
            return new LeafProperty<T>(getParentPath(), "moduleCode", false,
                owningClass);
        }

        public Property<T> moduleName() {
            return new LeafProperty<T>(getParentPath(), "moduleName", false,
                owningClass);
        }

        public Property<T> moduleDesc() {
            return new LeafProperty<T>(getParentPath(), "moduleDesc", false,
                owningClass);
        }

        public Property<T> moduleStatus() {
            return new LeafProperty<T>(getParentPath(), "moduleStatus", false,
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

        public ApplicationsProperty<T> application() {
            return new ApplicationsProperty<T>(getParentPath(), "application",
                owningClass);
        }

        public OperationProperty<T> operations() {
            return new OperationProperty<T>(getParentPath(), "operations",
                owningClass);
        }
    }
}
