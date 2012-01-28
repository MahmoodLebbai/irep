package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.UserDTOProperties.UserDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.UserPhoneDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserPhoneDTOProperties {
    private static final UserPhoneDTOPropertiesImpl<UserPhoneDTO> sharedInstance =
        new UserPhoneDTOPropertiesImpl<UserPhoneDTO>(UserPhoneDTO.class);

    private UserPhoneDTOProperties() {
    }

    public static Property<UserPhoneDTO> id() {
        return sharedInstance.id();
    }

    public static Property<UserPhoneDTO> phoneType() {
        return sharedInstance.phoneType();
    }

    public static Property<UserPhoneDTO> phoneNumber() {
        return sharedInstance.phoneNumber();
    }

    public static UserDTOProperty<UserPhoneDTO> user() {
        return sharedInstance.user();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.UserPhoneDTO},
     * i.e. nested property.
     */
    public static class UserPhoneDTOProperty<T>
        extends UserPhoneDTOPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserPhoneDTOProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserPhoneDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserPhoneDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserPhoneDTOPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> phoneType() {
            return new LeafProperty<T>(getParentPath(), "phoneType", false,
                owningClass);
        }

        public Property<T> phoneNumber() {
            return new LeafProperty<T>(getParentPath(), "phoneNumber", false,
                owningClass);
        }

        public UserDTOProperty<T> user() {
            return new UserDTOProperty<T>(getParentPath(), "user", owningClass);
        }
    }
}
