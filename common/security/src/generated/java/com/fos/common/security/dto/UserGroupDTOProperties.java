package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.UserDTOProperties.UserDTOProperty;
import com.fos.common.security.dto.UserGroupCategoryPermissionDTOProperties.UserGroupCategoryPermissionDTOProperty;
import com.fos.common.security.dto.UserGroupRoleDTOProperties.UserGroupRoleDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.UserGroupDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserGroupDTOProperties {
    private static final UserGroupDTOPropertiesImpl<UserGroupDTO> sharedInstance =
        new UserGroupDTOPropertiesImpl<UserGroupDTO>(UserGroupDTO.class);

    private UserGroupDTOProperties() {
    }

    public static Property<UserGroupDTO> id() {
        return sharedInstance.id();
    }

    public static Property<UserGroupDTO> userGroupCode() {
        return sharedInstance.userGroupCode();
    }

    public static Property<UserGroupDTO> userGroupName() {
        return sharedInstance.userGroupName();
    }

    public static Property<UserGroupDTO> userGroupDesc() {
        return sharedInstance.userGroupDesc();
    }

    public static Property<UserGroupDTO> userGroupStatus() {
        return sharedInstance.userGroupStatus();
    }

    public static UserDTOProperty<UserGroupDTO> users() {
        return sharedInstance.users();
    }

    public static UserGroupRoleDTOProperty<UserGroupDTO> userGroupRoles() {
        return sharedInstance.userGroupRoles();
    }

    public static UserGroupCategoryPermissionDTOProperty<UserGroupDTO> userGroupCategoryPermissions() {
        return sharedInstance.userGroupCategoryPermissions();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.UserGroupDTO},
     * i.e. nested property.
     */
    public static class UserGroupDTOProperty<T>
        extends UserGroupDTOPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserGroupDTOProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserGroupDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserGroupDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserGroupDTOPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> userGroupCode() {
            return new LeafProperty<T>(getParentPath(), "userGroupCode", false,
                owningClass);
        }

        public Property<T> userGroupName() {
            return new LeafProperty<T>(getParentPath(), "userGroupName", false,
                owningClass);
        }

        public Property<T> userGroupDesc() {
            return new LeafProperty<T>(getParentPath(), "userGroupDesc", false,
                owningClass);
        }

        public Property<T> userGroupStatus() {
            return new LeafProperty<T>(getParentPath(), "userGroupStatus",
                false, owningClass);
        }

        public UserDTOProperty<T> users() {
            return new UserDTOProperty<T>(getParentPath(), "users", owningClass);
        }

        public UserGroupRoleDTOProperty<T> userGroupRoles() {
            return new UserGroupRoleDTOProperty<T>(getParentPath(),
                "userGroupRoles", owningClass);
        }

        public UserGroupCategoryPermissionDTOProperty<T> userGroupCategoryPermissions() {
            return new UserGroupCategoryPermissionDTOProperty<T>(getParentPath(),
                "userGroupCategoryPermissions", owningClass);
        }
    }
}
