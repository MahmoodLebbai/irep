package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.RolePermissionDTOProperties.RolePermissionDTOProperty;
import com.fos.common.security.dto.UserGroupRoleDTOProperties.UserGroupRoleDTOProperty;
import com.fos.common.security.dto.UserRoleDTOProperties.UserRoleDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.RoleDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class RoleDTOProperties {
    private static final RoleDTOPropertiesImpl<RoleDTO> sharedInstance =
        new RoleDTOPropertiesImpl<RoleDTO>(RoleDTO.class);

    private RoleDTOProperties() {
    }

    public static Property<RoleDTO> id() {
        return sharedInstance.id();
    }

    public static Property<RoleDTO> roleCode() {
        return sharedInstance.roleCode();
    }

    public static Property<RoleDTO> roleName() {
        return sharedInstance.roleName();
    }

    public static Property<RoleDTO> roleDesc() {
        return sharedInstance.roleDesc();
    }

    public static Property<RoleDTO> roleStatus() {
        return sharedInstance.roleStatus();
    }

    public static RolePermissionDTOProperty<RoleDTO> rolePermissions() {
        return sharedInstance.rolePermissions();
    }

    public static UserRoleDTOProperty<RoleDTO> userRoles() {
        return sharedInstance.userRoles();
    }

    public static UserGroupRoleDTOProperty<RoleDTO> userGroupRoles() {
        return sharedInstance.userGroupRoles();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.RoleDTO},
     * i.e. nested property.
     */
    public static class RoleDTOProperty<T> extends RoleDTOPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public RoleDTOProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class RoleDTOPropertiesImpl<T> extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        RoleDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        RoleDTOPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> roleCode() {
            return new LeafProperty<T>(getParentPath(), "roleCode", false,
                owningClass);
        }

        public Property<T> roleName() {
            return new LeafProperty<T>(getParentPath(), "roleName", false,
                owningClass);
        }

        public Property<T> roleDesc() {
            return new LeafProperty<T>(getParentPath(), "roleDesc", false,
                owningClass);
        }

        public Property<T> roleStatus() {
            return new LeafProperty<T>(getParentPath(), "roleStatus", false,
                owningClass);
        }

        public RolePermissionDTOProperty<T> rolePermissions() {
            return new RolePermissionDTOProperty<T>(getParentPath(),
                "rolePermissions", owningClass);
        }

        public UserRoleDTOProperty<T> userRoles() {
            return new UserRoleDTOProperty<T>(getParentPath(), "userRoles",
                owningClass);
        }

        public UserGroupRoleDTOProperty<T> userGroupRoles() {
            return new UserGroupRoleDTOProperty<T>(getParentPath(),
                "userGroupRoles", owningClass);
        }
    }
}
