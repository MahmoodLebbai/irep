package com.fos.common.emailtemplate.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.emailtemplate.dto.UserRegisteration}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserRegisterationProperties {
    private static final UserRegisterationPropertiesImpl<UserRegisteration> sharedInstance =
        new UserRegisterationPropertiesImpl<UserRegisteration>(UserRegisteration.class);

    private UserRegisterationProperties() {
    }

    public static Property<UserRegisteration> userFirstName() {
        return sharedInstance.userFirstName();
    }

    public static Property<UserRegisteration> userLastName() {
        return sharedInstance.userLastName();
    }

    public static Property<UserRegisteration> emailAddress() {
        return sharedInstance.emailAddress();
    }

    public static Property<UserRegisteration> password() {
        return sharedInstance.password();
    }

    public static Property<UserRegisteration> userId() {
        return sharedInstance.userId();
    }

    public static Property<UserRegisteration> applicationUrl() {
        return sharedInstance.applicationUrl();
    }

    public static Property<UserRegisteration> changePasswordUrlLink() {
        return sharedInstance.changePasswordUrlLink();
    }

    public static Property<UserRegisteration> emailSenderDetail() {
        return sharedInstance.emailSenderDetail();
    }

    public static Property<UserRegisteration> changePasswordLinkExpiry() {
        return sharedInstance.changePasswordLinkExpiry();
    }

    public static Property<UserRegisteration> passwordLinkExpiry() {
        return sharedInstance.passwordLinkExpiry();
    }

    /**
     * This class is used for references to {@link com.fos.common.emailtemplate.dto.UserRegisteration},
     * i.e. nested property.
     */
    public static class UserRegisterationProperty<T>
        extends UserRegisterationPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserRegisterationProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserRegisterationPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserRegisterationPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserRegisterationPropertiesImpl(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> userFirstName() {
            return new LeafProperty<T>(getParentPath(), "userFirstName", false,
                owningClass);
        }

        public Property<T> userLastName() {
            return new LeafProperty<T>(getParentPath(), "userLastName", false,
                owningClass);
        }

        public Property<T> emailAddress() {
            return new LeafProperty<T>(getParentPath(), "emailAddress", false,
                owningClass);
        }

        public Property<T> password() {
            return new LeafProperty<T>(getParentPath(), "password", false,
                owningClass);
        }

        public Property<T> userId() {
            return new LeafProperty<T>(getParentPath(), "userId", false,
                owningClass);
        }

        public Property<T> applicationUrl() {
            return new LeafProperty<T>(getParentPath(), "applicationUrl",
                false, owningClass);
        }

        public Property<T> changePasswordUrlLink() {
            return new LeafProperty<T>(getParentPath(),
                "changePasswordUrlLink", false, owningClass);
        }

        public Property<T> emailSenderDetail() {
            return new LeafProperty<T>(getParentPath(), "emailSenderDetail",
                false, owningClass);
        }

        public Property<T> changePasswordLinkExpiry() {
            return new LeafProperty<T>(getParentPath(),
                "changePasswordLinkExpiry", false, owningClass);
        }

        public Property<T> passwordLinkExpiry() {
            return new LeafProperty<T>(getParentPath(), "passwordLinkExpiry",
                false, owningClass);
        }
    }
}
