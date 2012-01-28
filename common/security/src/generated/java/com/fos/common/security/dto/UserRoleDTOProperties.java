package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.RoleDTOProperties.RoleDTOProperty;
import com.fos.common.security.dto.UserDTOProperties.UserDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.UserRoleDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserRoleDTOProperties {
    private static final UserRoleDTOPropertiesImpl<UserRoleDTO> sharedInstance =
        new UserRoleDTOPropertiesImpl<UserRoleDTO>(UserRoleDTO.class);

    private UserRoleDTOProperties() {
    }

    public static Property<UserRoleDTO> id() {
        return sharedInstance.id();
    }

    public static RoleDTOProperty<UserRoleDTO> role() {
        return sharedInstance.role();
    }

    public static UserDTOProperty<UserRoleDTO> user() {
        return sharedInstance.user();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.UserRoleDTO},
     * i.e. nested property.
     */
    public static class UserRoleDTOProperty<T> extends UserRoleDTOPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserRoleDTOProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserRoleDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserRoleDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserRoleDTOPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public RoleDTOProperty<T> role() {
            return new RoleDTOProperty<T>(getParentPath(), "role", owningClass);
        }

        public UserDTOProperty<T> user() {
            return new UserDTOProperty<T>(getParentPath(), "user", owningClass);
        }
    }
}
