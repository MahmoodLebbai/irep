package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.UserDTOProperties.UserDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.DepartmentDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class DepartmentDTOProperties {
    private static final DepartmentDTOPropertiesImpl<DepartmentDTO> sharedInstance =
        new DepartmentDTOPropertiesImpl<DepartmentDTO>(DepartmentDTO.class);

    private DepartmentDTOProperties() {
    }

    public static Property<DepartmentDTO> id() {
        return sharedInstance.id();
    }

    public static Property<DepartmentDTO> departmentCode() {
        return sharedInstance.departmentCode();
    }

    public static Property<DepartmentDTO> departmentName() {
        return sharedInstance.departmentName();
    }

    public static Property<DepartmentDTO> departmentDesc() {
        return sharedInstance.departmentDesc();
    }

    public static UserDTOProperty<DepartmentDTO> users() {
        return sharedInstance.users();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.DepartmentDTO},
     * i.e. nested property.
     */
    public static class DepartmentDTOProperty<T>
        extends DepartmentDTOPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public DepartmentDTOProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class DepartmentDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        DepartmentDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        DepartmentDTOPropertiesImpl(String parentPath, String additionalPath,
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

        public UserDTOProperty<T> users() {
            return new UserDTOProperty<T>(getParentPath(), "users", owningClass);
        }
    }
}
