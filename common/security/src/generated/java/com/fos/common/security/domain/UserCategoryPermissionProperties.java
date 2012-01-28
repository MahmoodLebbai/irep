package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.CategoryDetailsPermissionProperties.CategoryDetailsPermissionProperty;
import com.fos.common.security.domain.UserProperties.UserProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.UserCategoryPermission}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserCategoryPermissionProperties {
    private static final UserCategoryPermissionPropertiesImpl<UserCategoryPermission> sharedInstance =
        new UserCategoryPermissionPropertiesImpl<UserCategoryPermission>(UserCategoryPermission.class);

    private UserCategoryPermissionProperties() {
    }

    public static Property<UserCategoryPermission> id() {
        return sharedInstance.id();
    }

    public static Property<UserCategoryPermission> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<UserCategoryPermission> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<UserCategoryPermission> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<UserCategoryPermission> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<UserCategoryPermission> version() {
        return sharedInstance.version();
    }

    public static UserProperty<UserCategoryPermission> user() {
        return sharedInstance.user();
    }

    public static CategoryDetailsPermissionProperty<UserCategoryPermission> categoryDetailPermissions() {
        return sharedInstance.categoryDetailPermissions();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.UserCategoryPermission},
     * i.e. nested property.
     */
    public static class UserCategoryPermissionProperty<T>
        extends UserCategoryPermissionPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public UserCategoryPermissionProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class UserCategoryPermissionPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        UserCategoryPermissionPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        UserCategoryPermissionPropertiesImpl(String parentPath,
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

        public UserProperty<T> user() {
            return new UserProperty<T>(getParentPath(), "user", owningClass);
        }

        public CategoryDetailsPermissionProperty<T> categoryDetailPermissions() {
            return new CategoryDetailsPermissionProperty<T>(getParentPath(),
                "categoryDetailPermissions", owningClass);
        }
    }
}
