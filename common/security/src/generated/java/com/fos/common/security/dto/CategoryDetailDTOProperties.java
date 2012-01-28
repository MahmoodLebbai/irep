package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.CategoryDTOProperties.CategoryDTOProperty;
import com.fos.common.security.dto.CategoryDetailsPermissionDTOProperties.CategoryDetailsPermissionDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.CategoryDetailDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class CategoryDetailDTOProperties {
    private static final CategoryDetailDTOPropertiesImpl<CategoryDetailDTO> sharedInstance =
        new CategoryDetailDTOPropertiesImpl<CategoryDetailDTO>(CategoryDetailDTO.class);

    private CategoryDetailDTOProperties() {
    }

    public static Property<CategoryDetailDTO> id() {
        return sharedInstance.id();
    }

    public static Property<CategoryDetailDTO> name() {
        return sharedInstance.name();
    }

    public static Property<CategoryDetailDTO> desc() {
        return sharedInstance.desc();
    }

    public static Property<CategoryDetailDTO> status() {
        return sharedInstance.status();
    }

    public static CategoryDTOProperty<CategoryDetailDTO> category() {
        return sharedInstance.category();
    }

    public static CategoryDetailsPermissionDTOProperty<CategoryDetailDTO> categoryDetailPermissions() {
        return sharedInstance.categoryDetailPermissions();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.CategoryDetailDTO},
     * i.e. nested property.
     */
    public static class CategoryDetailDTOProperty<T>
        extends CategoryDetailDTOPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public CategoryDetailDTOProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class CategoryDetailDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        CategoryDetailDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        CategoryDetailDTOPropertiesImpl(String parentPath,
            String additionalPath, Class<T> owningClass) {
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

        public CategoryDTOProperty<T> category() {
            return new CategoryDTOProperty<T>(getParentPath(), "category",
                owningClass);
        }

        public CategoryDetailsPermissionDTOProperty<T> categoryDetailPermissions() {
            return new CategoryDetailsPermissionDTOProperty<T>(getParentPath(),
                "categoryDetailPermissions", owningClass);
        }
    }
}
