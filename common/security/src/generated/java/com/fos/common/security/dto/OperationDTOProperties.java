package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.ModulesDTOProperties.ModulesDTOProperty;
import com.fos.common.security.dto.PermissionDTOProperties.PermissionDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.OperationDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class OperationDTOProperties {
    private static final OperationDTOPropertiesImpl<OperationDTO> sharedInstance =
        new OperationDTOPropertiesImpl<OperationDTO>(OperationDTO.class);

    private OperationDTOProperties() {
    }

    public static Property<OperationDTO> id() {
        return sharedInstance.id();
    }

    public static Property<OperationDTO> functionCode() {
        return sharedInstance.functionCode();
    }

    public static Property<OperationDTO> functionName() {
        return sharedInstance.functionName();
    }

    public static Property<OperationDTO> functionDesc() {
        return sharedInstance.functionDesc();
    }

    public static Property<OperationDTO> functionStatus() {
        return sharedInstance.functionStatus();
    }

    public static ModulesDTOProperty<OperationDTO> module() {
        return sharedInstance.module();
    }

    public static PermissionDTOProperty<OperationDTO> permissions() {
        return sharedInstance.permissions();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.OperationDTO},
     * i.e. nested property.
     */
    public static class OperationDTOProperty<T>
        extends OperationDTOPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public OperationDTOProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class OperationDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        OperationDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        OperationDTOPropertiesImpl(String parentPath, String additionalPath,
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

        public ModulesDTOProperty<T> module() {
            return new ModulesDTOProperty<T>(getParentPath(), "module",
                owningClass);
        }

        public PermissionDTOProperty<T> permissions() {
            return new PermissionDTOProperty<T>(getParentPath(), "permissions",
                owningClass);
        }
    }
}
