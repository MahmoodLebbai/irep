package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.RoleDTOProperties.RoleDTOProperty;
import com.fos.common.security.dto.UserGroupDTOProperties.UserGroupDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.UserGroupRoleDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserGroupRoleDTOProperties {
    private static final UserGroupRoleDTOPropertiesImpl<UserGroupRoleDTO> sharedInstance =
        new UserGroupRoleDTOPropertiesImpl<UserGroupRoleDTO>(UserGroupRoleDTO.class);

    private UserGroupRoleDTOProperties() {
    }

    public static UserGroupDTOProperty<UserGroupRoleDTO> userGroup() {
        return sharedInstance.userGroup();
    }

    public static RoleDTOProperty<UserGroupRoleDTO> role() {
        return sharedInstance.role();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.UserGroupRoleDTO},
     * i.e. nested property.
     */
    public static class UserGroupRoleDTOProperty<T>
        extends UserGroupRoleDTOPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserGroupRoleDTOProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserGroupRoleDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserGroupRoleDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserGroupRoleDTOPropertiesImpl(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public UserGroupDTOProperty<T> userGroup() {
            return new UserGroupDTOProperty<T>(getParentPath(), "userGroup",
                owningClass);
        }

        public RoleDTOProperty<T> role() {
            return new RoleDTOProperty<T>(getParentPath(), "role", owningClass);
        }
    }
}
