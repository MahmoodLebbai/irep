package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.UserProperties.UserProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.Department}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class DepartmentProperties {
    private static final DepartmentPropertiesImpl<Department> sharedInstance =
        new DepartmentPropertiesImpl<Department>(Department.class);

    private DepartmentProperties() {
    }

    public static Property<Department> id() {
        return sharedInstance.id();
    }

    public static Property<Department> departmentCode() {
        return sharedInstance.departmentCode();
    }

    public static Property<Department> departmentName() {
        return sharedInstance.departmentName();
    }

    public static Property<Department> departmentDesc() {
        return sharedInstance.departmentDesc();
    }

    public static Property<Department> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<Department> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<Department> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<Department> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<Department> version() {
        return sharedInstance.version();
    }

    public static UserProperty<Department> users() {
        return sharedInstance.users();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.Department},
     * i.e. nested property.
     */
    public static class DepartmentProperty<T> extends DepartmentPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public DepartmentProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class DepartmentPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        DepartmentPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        DepartmentPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> departmentCode() {
            return new LeafProperty<T>(getParentPath(), "departmentCode",
                false, owningClass);
        }

        public Property<T> departmentName() {
            return new LeafProperty<T>(getParentPath(), "departmentName",
                false, owningClass);
        }

        public Property<T> departmentDesc() {
            return new LeafProperty<T>(getParentPath(), "departmentDesc",
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
    }
}
