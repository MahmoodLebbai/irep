package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.domain.CategoryDetailProperties.CategoryDetailProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.domain.Category}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class CategoryProperties {
    private static final CategoryPropertiesImpl<Category> sharedInstance =
        new CategoryPropertiesImpl<Category>(Category.class);

    private CategoryProperties() {
    }

    public static Property<Category> id() {
        return sharedInstance.id();
    }

    public static Property<Category> categoryID() {
        return sharedInstance.categoryID();
    }

    public static Property<Category> categoryName() {
        return sharedInstance.categoryName();
    }

    public static Property<Category> categoryDesc() {
        return sharedInstance.categoryDesc();
    }

    public static Property<Category> categoryStatus() {
        return sharedInstance.categoryStatus();
    }

    public static Property<Category> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<Category> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<Category> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<Category> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<Category> version() {
        return sharedInstance.version();
    }

    public static CategoryDetailProperty<Category> categoryDetails() {
        return sharedInstance.categoryDetails();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.domain.Category},
     * i.e. nested property.
     */
    public static class CategoryProperty<T> extends CategoryPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public CategoryProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class CategoryPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        CategoryPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        CategoryPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> categoryID() {
            return new LeafProperty<T>(getParentPath(), "categoryID", false,
                owningClass);
        }

        public Property<T> categoryName() {
            return new LeafProperty<T>(getParentPath(), "categoryName", false,
                owningClass);
        }

        public Property<T> categoryDesc() {
            return new LeafProperty<T>(getParentPath(), "categoryDesc", false,
                owningClass);
        }

        public Property<T> categoryStatus() {
            return new LeafProperty<T>(getParentPath(), "categoryStatus",
                false, owningClass);
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

        public CategoryDetailProperty<T> categoryDetails() {
            return new CategoryDetailProperty<T>(getParentPath(),
                "categoryDetails", owningClass);
        }
    }
}
