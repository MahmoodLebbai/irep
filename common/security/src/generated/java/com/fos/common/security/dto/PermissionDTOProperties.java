package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.OperationDTOProperties.OperationDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.PermissionDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class PermissionDTOProperties {
    private static final PermissionDTOPropertiesImpl<PermissionDTO> sharedInstance =
        new PermissionDTOPropertiesImpl<PermissionDTO>(PermissionDTO.class);

    private PermissionDTOProperties() {
    }

    public static Property<PermissionDTO> id() {
        return sharedInstance.id();
    }

    public static Property<PermissionDTO> permissionCode() {
        return sharedInstance.permissionCode();
    }

    public static Property<PermissionDTO> createFlag() {
        return sharedInstance.createFlag();
    }

    public static Property<PermissionDTO> modifyFlag() {
        return sharedInstance.modifyFlag();
    }

    public static Property<PermissionDTO> deleteFlag() {
        return sharedInstance.deleteFlag();
    }

    public static Property<PermissionDTO> viewFlag() {
        return sharedInstance.viewFlag();
    }

    public static OperationDTOProperty<PermissionDTO> operation() {
        return sharedInstance.operation();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.PermissionDTO},
     * i.e. nested property.
     */
    public static class PermissionDTOProperty<T>
        extends PermissionDTOPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public PermissionDTOProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class PermissionDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        PermissionDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        PermissionDTOPropertiesImpl(String parentPath, String additionalPath,
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

        public OperationDTOProperty<T> operation() {
            return new OperationDTOProperty<T>(getParentPath(), "operation",
                owningClass);
        }
    }
}
