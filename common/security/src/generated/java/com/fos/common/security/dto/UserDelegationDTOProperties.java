package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.UserDTOProperties.UserDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.UserDelegationDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserDelegationDTOProperties {
    private static final UserDelegationDTOPropertiesImpl<UserDelegationDTO> sharedInstance =
        new UserDelegationDTOPropertiesImpl<UserDelegationDTO>(UserDelegationDTO.class);

    private UserDelegationDTOProperties() {
    }

    public static Property<UserDelegationDTO> id() {
        return sharedInstance.id();
    }

    public static Property<UserDelegationDTO> delegationStatus() {
        return sharedInstance.delegationStatus();
    }

    public static Property<UserDelegationDTO> startDate() {
        return sharedInstance.startDate();
    }

    public static Property<UserDelegationDTO> endDate() {
        return sharedInstance.endDate();
    }

    public static UserDTOProperty<UserDelegationDTO> user() {
        return sharedInstance.user();
    }

    public static UserDTOProperty<UserDelegationDTO> delegatedUser() {
        return sharedInstance.delegatedUser();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.UserDelegationDTO},
     * i.e. nested property.
     */
    public static class UserDelegationDTOProperty<T>
        extends UserDelegationDTOPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserDelegationDTOProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserDelegationDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserDelegationDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserDelegationDTOPropertiesImpl(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> delegationStatus() {
            return new LeafProperty<T>(getParentPath(), "delegationStatus",
                false, owningClass);
        }

        public Property<T> startDate() {
            return new LeafProperty<T>(getParentPath(), "startDate", false,
                owningClass);
        }

        public Property<T> endDate() {
            return new LeafProperty<T>(getParentPath(), "endDate", false,
                owningClass);
        }

        public UserDTOProperty<T> user() {
            return new UserDTOProperty<T>(getParentPath(), "user", owningClass);
        }

        public UserDTOProperty<T> delegatedUser() {
            return new UserDTOProperty<T>(getParentPath(), "delegatedUser",
                owningClass);
        }
    }
}
