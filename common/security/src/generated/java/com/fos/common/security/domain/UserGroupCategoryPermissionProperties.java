package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.CategoryDetailsPermissionProperties.CategoryDetailsPermissionProperty;
import com.fos.common.security.domain.UserGroupProperties.UserGroupProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.UserGroupCategoryPermission}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserGroupCategoryPermissionProperties {
    private static final UserGroupCategoryPermissionPropertiesImpl<UserGroupCategoryPermission> sharedInstance =
        new UserGroupCategoryPermissionPropertiesImpl<UserGroupCategoryPermission>(UserGroupCategoryPermission.class);

    private UserGroupCategoryPermissionProperties() {
    }

    public static Property<UserGroupCategoryPermission> id() {
        return sharedInstance.id();
    }

    public static Property<UserGroupCategoryPermission> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<UserGroupCategoryPermission> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<UserGroupCategoryPermission> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<UserGroupCategoryPermission> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<UserGroupCategoryPermission> version() {
        return sharedInstance.version();
    }

    public static UserGroupProperty<UserGroupCategoryPermission> userGroup() {
        return sharedInstance.userGroup();
    }

    public static CategoryDetailsPermissionProperty<UserGroupCategoryPermission> categoryDetailPermissions() {
        return sharedInstance.categoryDetailPermissions();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.UserGroupCategoryPermission},
     * i.e. nested property.
     */
    public static class UserGroupCategoryPermissionProperty<T>
        extends UserGroupCategoryPermissionPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserGroupCategoryPermissionProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserGroupCategoryPermissionPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserGroupCategoryPermissionPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserGroupCategoryPermissionPropertiesImpl(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> createdDate() {
            return new LeafProperty<T>(getParentPath(), "createdDate", false,
                owningClass);
        }

        public Property<T> createdBy() {
            return new LeafProperty<T>(getParentPath(), "createdBy", false,
                owningClass);
        }

        public Property<T> lastUpdated() {
            return new LeafProperty<T>(getParentPath(), "lastUpdated", false,
                owningClass);
        }

        public Property<T> lastUpdatedBy() {
            return new LeafProperty<T>(getParentPath(), "lastUpdatedBy", false,
                owningClass);
        }

        public Property<T> version() {
            return new LeafProperty<T>(getParentPath(), "version", false,
                owningClass);
        }

        public UserGroupProperty<T> userGroup() {
            return new UserGroupProperty<T>(getParentPath(), "userGroup",
                owningClass);
        }

        public CategoryDetailsPermissionProperty<T> categoryDetailPermissions() {
            return new CategoryDetailsPermissionProperty<T>(getParentPath(),
                "categoryDetailPermissions", owningClass);
        }
    }
}
