package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.UserDTOProperties.UserDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.UserEmailDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserEmailDTOProperties {
    private static final UserEmailDTOPropertiesImpl<UserEmailDTO> sharedInstance =
        new UserEmailDTOPropertiesImpl<UserEmailDTO>(UserEmailDTO.class);

    private UserEmailDTOProperties() {
    }

    public static Property<UserEmailDTO> id() {
        return sharedInstance.id();
    }

    public static Property<UserEmailDTO> emailType() {
        return sharedInstance.emailType();
    }

    public static Property<UserEmailDTO> emailId() {
        return sharedInstance.emailId();
    }

    public static UserDTOProperty<UserEmailDTO> user() {
        return sharedInstance.user();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.UserEmailDTO},
     * i.e. nested property.
     */
    public static class UserEmailDTOProperty<T>
        extends UserEmailDTOPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserEmailDTOProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserEmailDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserEmailDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserEmailDTOPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> emailType() {
            return new LeafProperty<T>(getParentPath(), "emailType", false,
                owningClass);
        }

        public Property<T> emailId() {
            return new LeafProperty<T>(getParentPath(), "emailId", false,
                owningClass);
        }

        public UserDTOProperty<T> user() {
            return new UserDTOProperty<T>(getParentPath(), "user", owningClass);
        }
    }
}
