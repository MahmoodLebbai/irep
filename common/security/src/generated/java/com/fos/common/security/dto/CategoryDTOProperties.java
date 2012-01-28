package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.CategoryDetailDTOProperties.CategoryDetailDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.CategoryDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class CategoryDTOProperties {
    private static final CategoryDTOPropertiesImpl<CategoryDTO> sharedInstance =
        new CategoryDTOPropertiesImpl<CategoryDTO>(CategoryDTO.class);

    private CategoryDTOProperties() {
    }

    public static Property<CategoryDTO> id() {
        return sharedInstance.id();
    }

    public static Property<CategoryDTO> categoryID() {
        return sharedInstance.categoryID();
    }

    public static Property<CategoryDTO> categoryName() {
        return sharedInstance.categoryName();
    }

    public static Property<CategoryDTO> categoryDesc() {
        return sharedInstance.categoryDesc();
    }

    public static Property<CategoryDTO> categoryStatus() {
        return sharedInstance.categoryStatus();
    }

    public static CategoryDetailDTOProperty<CategoryDTO> categoryDetails() {
        return sharedInstance.categoryDetails();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.CategoryDTO},
     * i.e. nested property.
     */
    public static class CategoryDTOProperty<T> extends CategoryDTOPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public CategoryDTOProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class CategoryDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        CategoryDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        CategoryDTOPropertiesImpl(String parentPath, String additionalPath,
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

        public CategoryDetailDTOProperty<T> categoryDetails() {
            return new CategoryDetailDTOProperty<T>(getParentPath(),
                "categoryDetails", owningClass);
        }
    }
}
