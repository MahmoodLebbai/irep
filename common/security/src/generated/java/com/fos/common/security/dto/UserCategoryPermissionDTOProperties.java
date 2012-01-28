package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.CategoryDetailsPermissionDTOProperties.CategoryDetailsPermissionDTOProperty;
import com.fos.common.security.dto.UserDTOProperties.UserDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.UserCategoryPermissionDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserCategoryPermissionDTOProperties {
    private static final UserCategoryPermissionDTOPropertiesImpl<UserCategoryPermissionDTO> sharedInstance =
        new UserCategoryPermissionDTOPropertiesImpl<UserCategoryPermissionDTO>(UserCategoryPermissionDTO.class);

    private UserCategoryPermissionDTOProperties() {
    }

    public static Property<UserCategoryPermissionDTO> id() {
        return sharedInstance.id();
    }

    public static UserDTOProperty<UserCategoryPermissionDTO> user() {
        return sharedInstance.user();
    }

    public static CategoryDetailsPermissionDTOProperty<UserCategoryPermissionDTO> userCategoryDetailPermission() {
        return sharedInstance.userCategoryDetailPermission();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.UserCategoryPermissionDTO},
     * i.e. nested property.
     */
    public static class UserCategoryPermissionDTOProperty<T>
        extends UserCategoryPermissionDTOPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserCategoryPermissionDTOProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserCategoryPermissionDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserCategoryPermissionDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserCategoryPermissionDTOPropertiesImpl(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public UserDTOProperty<T> user() {
            return new UserDTOProperty<T>(getParentPath(), "user", owningClass);
        }

        public CategoryDetailsPermissionDTOProperty<T> userCategoryDetailPermission() {
            return new CategoryDetailsPermissionDTOProperty<T>(getParentPath(),
                "userCategoryDetailPermission", owningClass);
        }
    }
}
