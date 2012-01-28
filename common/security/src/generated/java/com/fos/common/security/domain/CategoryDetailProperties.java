package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.CategoryDetailsPermissionProperties.CategoryDetailsPermissionProperty;
import com.fos.common.security.domain.CategoryProperties.CategoryProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.CategoryDetail}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class CategoryDetailProperties {
    private static final CategoryDetailPropertiesImpl<CategoryDetail> sharedInstance =
        new CategoryDetailPropertiesImpl<CategoryDetail>(CategoryDetail.class);

    private CategoryDetailProperties() {
    }

    public static Property<CategoryDetail> id() {
        return sharedInstance.id();
    }

    public static Property<CategoryDetail> name() {
        return sharedInstance.name();
    }

    public static Property<CategoryDetail> desc() {
        return sharedInstance.desc();
    }

    public static Property<CategoryDetail> status() {
        return sharedInstance.status();
    }

    public static Property<CategoryDetail> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<CategoryDetail> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<CategoryDetail> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<CategoryDetail> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<CategoryDetail> version() {
        return sharedInstance.version();
    }

    public static CategoryProperty<CategoryDetail> category() {
        return sharedInstance.category();
    }

    public static CategoryDetailsPermissionProperty<CategoryDetail> categoryDetailPermissions() {
        return sharedInstance.categoryDetailPermissions();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.CategoryDetail},
     * i.e. nested property.
     */
    public static class CategoryDetailProperty<T>
        extends CategoryDetailPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public CategoryDetailProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class CategoryDetailPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        CategoryDetailPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        CategoryDetailPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> name() {
            return new LeafProperty<T>(getParentPath(), "name", false,
                owningClass);
        }

        public Property<T> desc() {
            return new LeafProperty<T>(getParentPath(), "desc", false,
                owningClass);
        }

        public Property<T> status() {
            return new LeafProperty<T>(getParentPath(), "status", false,
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

        public CategoryProperty<T> category() {
            return new CategoryProperty<T>(getParentPath(), "category",
                owningClass);
        }

        public CategoryDetailsPermissionProperty<T> categoryDetailPermissions() {
            return new CategoryDetailsPermissionProperty<T>(getParentPath(),
                "categoryDetailPermissions", owningClass);
        }
    }
}
