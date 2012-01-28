package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.ModulesProperties.ModulesProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.Applications}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class ApplicationsProperties {
    private static final ApplicationsPropertiesImpl<Applications> sharedInstance =
        new ApplicationsPropertiesImpl<Applications>(Applications.class);

    private ApplicationsProperties() {
    }

    public static Property<Applications> id() {
        return sharedInstance.id();
    }

    public static Property<Applications> applicationCode() {
        return sharedInstance.applicationCode();
    }

    public static Property<Applications> applicationName() {
        return sharedInstance.applicationName();
    }

    public static Property<Applications> applicationDesc() {
        return sharedInstance.applicationDesc();
    }

    public static Property<Applications> applicationStatus() {
        return sharedInstance.applicationStatus();
    }

    public static Property<Applications> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<Applications> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<Applications> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<Applications> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<Applications> version() {
        return sharedInstance.version();
    }

    public static ModulesProperty<Applications> modules() {
        return sharedInstance.modules();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.Applications},
     * i.e. nested property.
     */
    public static class ApplicationsProperty<T>
        extends ApplicationsPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public ApplicationsProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class ApplicationsPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        ApplicationsPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        ApplicationsPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> applicationCode() {
            return new LeafProperty<T>(getParentPath(), "applicationCode",
                false, owningClass);
        }

        public Property<T> applicationName() {
            return new LeafProperty<T>(getParentPath(), "applicationName",
                false, owningClass);
        }

        public Property<T> applicationDesc() {
            return new LeafProperty<T>(getParentPath(), "applicationDesc",
                false, owningClass);
        }

        public Property<T> applicationStatus() {
            return new LeafProperty<T>(getParentPath(), "applicationStatus",
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

        public ModulesProperty<T> modules() {
            return new ModulesProperty<T>(getParentPath(), "modules",
                owningClass);
        }
    }
}
