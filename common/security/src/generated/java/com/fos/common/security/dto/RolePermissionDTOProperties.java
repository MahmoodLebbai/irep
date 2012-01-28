package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.PermissionDTOProperties.PermissionDTOProperty;
import com.fos.common.security.dto.RoleDTOProperties.RoleDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.RolePermissionDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class RolePermissionDTOProperties {
    private static final RolePermissionDTOPropertiesImpl<RolePermissionDTO> sharedInstance =
        new RolePermissionDTOPropertiesImpl<RolePermissionDTO>(RolePermissionDTO.class);

    private RolePermissionDTOProperties() {
    }

    public static Property<RolePermissionDTO> id() {
        return sharedInstance.id();
    }

    public static RoleDTOProperty<RolePermissionDTO> role() {
        return sharedInstance.role();
    }

    public static PermissionDTOProperty<RolePermissionDTO> permission() {
        return sharedInstance.permission();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.RolePermissionDTO},
     * i.e. nested property.
     */
    public static class RolePermissionDTOProperty<T>
        extends RolePermissionDTOPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public RolePermissionDTOProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class RolePermissionDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        RolePermissionDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        RolePermissionDTOPropertiesImpl(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public RoleDTOProperty<T> role() {
            return new RoleDTOProperty<T>(getParentPath(), "role", owningClass);
        }

        public PermissionDTOProperty<T> permission() {
            return new PermissionDTOProperty<T>(getParentPath(), "permission",
                owningClass);
        }
    }
}
