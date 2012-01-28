package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.CategoryDetailsPermissionDTOProperties.CategoryDetailsPermissionDTOProperty;
import com.fos.common.security.dto.UserGroupDTOProperties.UserGroupDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.UserGroupCategoryPermissionDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserGroupCategoryPermissionDTOProperties {
    private static final UserGroupCategoryPermissionDTOPropertiesImpl<UserGroupCategoryPermissionDTO> sharedInstance =
        new UserGroupCategoryPermissionDTOPropertiesImpl<UserGroupCategoryPermissionDTO>(UserGroupCategoryPermissionDTO.class);

    private UserGroupCategoryPermissionDTOProperties() {
    }

    public static Property<UserGroupCategoryPermissionDTO> id() {
        return sharedInstance.id();
    }

    public static UserGroupDTOProperty<UserGroupCategoryPermissionDTO> userGroup() {
        return sharedInstance.userGroup();
    }

    public static CategoryDetailsPermissionDTOProperty<UserGroupCategoryPermissionDTO> userCategoryDetailPermission() {
        return sharedInstance.userCategoryDetailPermission();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.UserGroupCategoryPermissionDTO},
     * i.e. nested property.
     */
    public static class UserGroupCategoryPermissionDTOProperty<T>
        extends UserGroupCategoryPermissionDTOPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserGroupCategoryPermissionDTOProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserGroupCategoryPermissionDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserGroupCategoryPermissionDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserGroupCategoryPermissionDTOPropertiesImpl(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public UserGroupDTOProperty<T> userGroup() {
            return new UserGroupDTOProperty<T>(getParentPath(), "userGroup",
                owningClass);
        }

        public CategoryDetailsPermissionDTOProperty<T> userCategoryDetailPermission() {
            return new CategoryDetailsPermissionDTOProperty<T>(getParentPath(),
                "userCategoryDetailPermission", owningClass);
        }
    }
}
