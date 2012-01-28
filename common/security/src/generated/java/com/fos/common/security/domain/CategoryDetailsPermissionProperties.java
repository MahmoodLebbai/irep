package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.CategoryDetailProperties.CategoryDetailProperty;
import com.fos.common.security.domain.UserCategoryPermissionProperties.UserCategoryPermissionProperty;
import com.fos.common.security.domain.UserGroupCategoryPermissionProperties.UserGroupCategoryPermissionProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.CategoryDetailsPermission}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class CategoryDetailsPermissionProperties {
    private static final CategoryDetailsPermissionPropertiesImpl<CategoryDetailsPermission> sharedInstance =
        new CategoryDetailsPermissionPropertiesImpl<CategoryDetailsPermission>(CategoryDetailsPermission.class);

    private CategoryDetailsPermissionProperties() {
    }

    public static Property<CategoryDetailsPermission> id() {
        return sharedInstance.id();
    }

    public static Property<CategoryDetailsPermission> categoryPermissionCode() {
        return sharedInstance.categoryPermissionCode();
    }

    public static Property<CategoryDetailsPermission> createFlag() {
        return sharedInstance.createFlag();
    }

    public static Property<CategoryDetailsPermission> modifyFlag() {
        return sharedInstance.modifyFlag();
    }

    public static Property<CategoryDetailsPermission> deleteFlag() {
        return sharedInstance.deleteFlag();
    }

    public static Property<CategoryDetailsPermission> viewFlag() {
        return sharedInstance.viewFlag();
    }

    public static Property<CategoryDetailsPermission> uuid() {
        return sharedInstance.uuid();
    }

    public static Property<CategoryDetailsPermission> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<CategoryDetailsPermission> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<CategoryDetailsPermission> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<CategoryDetailsPermission> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<CategoryDetailsPermission> version() {
        return sharedInstance.version();
    }

    public static CategoryDetailProperty<CategoryDetailsPermission> categoryDetail() {
        return sharedInstance.categoryDetail();
    }

    public static UserCategoryPermissionProperty<CategoryDetailsPermission> userCategoryDetailPermissions() {
        return sharedInstance.userCategoryDetailPermissions();
    }

    public static UserGroupCategoryPermissionProperty<CategoryDetailsPermission> userGroupCategoryDetailPermissions() {
        return sharedInstance.userGroupCategoryDetailPermissions();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.CategoryDetailsPermission},
     * i.e. nested property.
     */
    public static class CategoryDetailsPermissionProperty<T>
        extends CategoryDetailsPermissionPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public CategoryDetailsPermissionProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class CategoryDetailsPermissionPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        CategoryDetailsPermissionPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        CategoryDetailsPermissionPropertiesImpl(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> categoryPermissionCode() {
            return new LeafProperty<T>(getParentPath(),
                "categoryPermissionCode", false, owningClass);
        }

        public Property<T> createFlag() {
            return new LeafProperty<T>(getParentPath(), "createFlag", false,
                owningClass);
        }

        public Property<T> modifyFlag() {
            return new LeafProperty<T>(getParentPath(), "modifyFlag", false,
                owningClass);
        }

        public Property<T> deleteFlag() {
            return new LeafProperty<T>(getParentPath(), "deleteFlag", false,
                owningClass);
        }

        public Property<T> viewFlag() {
            return new LeafProperty<T>(getParentPath(), "viewFlag", false,
                owningClass);
        }

        public Property<T> uuid() {
            return new LeafProperty<T>(getParentPath(), "uuid", false,
                owningClass);
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

        public CategoryDetailProperty<T> categoryDetail() {
            return new CategoryDetailProperty<T>(getParentPath(),
                "categoryDetail", owningClass);
        }

        public UserCategoryPermissionProperty<T> userCategoryDetailPermissions() {
            return new UserCategoryPermissionProperty<T>(getParentPath(),
                "userCategoryDetailPermissions", owningClass);
        }

        public UserGroupCategoryPermissionProperty<T> userGroupCategoryDetailPermissions() {
            return new UserGroupCategoryPermissionProperty<T>(getParentPath(),
                "userGroupCategoryDetailPermissions", owningClass);
        }
    }
}
