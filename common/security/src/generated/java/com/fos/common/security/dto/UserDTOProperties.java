package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.DepartmentDTOProperties.DepartmentDTOProperty;
import com.fos.common.security.dto.UserCategoryPermissionDTOProperties.UserCategoryPermissionDTOProperty;
import com.fos.common.security.dto.UserDTOProperties.UserDTOProperty;
import com.fos.common.security.dto.UserDelegationDTOProperties.UserDelegationDTOProperty;
import com.fos.common.security.dto.UserEmailDTOProperties.UserEmailDTOProperty;
import com.fos.common.security.dto.UserGroupDTOProperties.UserGroupDTOProperty;
import com.fos.common.security.dto.UserPhoneDTOProperties.UserPhoneDTOProperty;
import com.fos.common.security.dto.UserRoleDTOProperties.UserRoleDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.UserDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserDTOProperties {
    private static final UserDTOPropertiesImpl<UserDTO> sharedInstance =
        new UserDTOPropertiesImpl<UserDTO>(UserDTO.class);

    private UserDTOProperties() {
    }

    public static Property<UserDTO> id() {
        return sharedInstance.id();
    }

    public static Property<UserDTO> userId() {
        return sharedInstance.userId();
    }

    public static Property<UserDTO> firstName() {
        return sharedInstance.firstName();
    }

    public static Property<UserDTO> middleName() {
        return sharedInstance.middleName();
    }

    public static Property<UserDTO> lastName() {
        return sharedInstance.lastName();
    }

    public static Property<UserDTO> password() {
        return sharedInstance.password();
    }

    public static Property<UserDTO> passwordExpiryDate() {
        return sharedInstance.passwordExpiryDate();
    }

    public static Property<UserDTO> dateOfBirth() {
        return sharedInstance.dateOfBirth();
    }

    public static Property<UserDTO> userStatus() {
        return sharedInstance.userStatus();
    }

    public static DepartmentDTOProperty<UserDTO> department() {
        return sharedInstance.department();
    }

    public static UserDTOProperty<UserDTO> reportingUserId() {
        return sharedInstance.reportingUserId();
    }

    public static UserGroupDTOProperty<UserDTO> userGroup() {
        return sharedInstance.userGroup();
    }

    public static UserEmailDTOProperty<UserDTO> emails() {
        return sharedInstance.emails();
    }

    public static UserPhoneDTOProperty<UserDTO> phones() {
        return sharedInstance.phones();
    }

    public static UserRoleDTOProperty<UserDTO> userRoles() {
        return sharedInstance.userRoles();
    }

    public static UserCategoryPermissionDTOProperty<UserDTO> userCategoryPermissions() {
        return sharedInstance.userCategoryPermissions();
    }

    public static UserDelegationDTOProperty<UserDTO> userDelegations() {
        return sharedInstance.userDelegations();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.UserDTO},
     * i.e. nested property.
     */
    public static class UserDTOProperty<T> extends UserDTOPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserDTOProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserDTOPropertiesImpl<T> extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserDTOPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> userId() {
            return new LeafProperty<T>(getParentPath(), "userId", false,
                owningClass);
        }

        public Property<T> firstName() {
            return new LeafProperty<T>(getParentPath(), "firstName", false,
                owningClass);
        }

        public Property<T> middleName() {
            return new LeafProperty<T>(getParentPath(), "middleName", false,
                owningClass);
        }

        public Property<T> lastName() {
            return new LeafProperty<T>(getParentPath(), "lastName", false,
                owningClass);
        }

        public Property<T> password() {
            return new LeafProperty<T>(getParentPath(), "password", false,
                owningClass);
        }

        public Property<T> passwordExpiryDate() {
            return new LeafProperty<T>(getParentPath(), "passwordExpiryDate",
                false, owningClass);
        }

        public Property<T> dateOfBirth() {
            return new LeafProperty<T>(getParentPath(), "dateOfBirth", false,
                owningClass);
        }

        public Property<T> userStatus() {
            return new LeafProperty<T>(getParentPath(), "userStatus", false,
                owningClass);
        }

        public DepartmentDTOProperty<T> department() {
            return new DepartmentDTOProperty<T>(getParentPath(), "department",
                owningClass);
        }

        public UserDTOProperty<T> reportingUserId() {
            return new UserDTOProperty<T>(getParentPath(), "reportingUserId",
                owningClass);
        }

        public UserGroupDTOProperty<T> userGroup() {
            return new UserGroupDTOProperty<T>(getParentPath(), "userGroup",
                owningClass);
        }

        public UserEmailDTOProperty<T> emails() {
            return new UserEmailDTOProperty<T>(getParentPath(), "emails",
                owningClass);
        }

        public UserPhoneDTOProperty<T> phones() {
            return new UserPhoneDTOProperty<T>(getParentPath(), "phones",
                owningClass);
        }

        public UserRoleDTOProperty<T> userRoles() {
            return new UserRoleDTOProperty<T>(getParentPath(), "userRoles",
                owningClass);
        }

        public UserCategoryPermissionDTOProperty<T> userCategoryPermissions() {
            return new UserCategoryPermissionDTOProperty<T>(getParentPath(),
                "userCategoryPermissions", owningClass);
        }

        public UserDelegationDTOProperty<T> userDelegations() {
            return new UserDelegationDTOProperty<T>(getParentPath(),
                "userDelegations", owningClass);
        }
    }
}
