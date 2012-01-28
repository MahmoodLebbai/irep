package com.fos.common.security.dto;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import com.fos.common.security.dto.CategoryDetailDTOProperties.CategoryDetailDTOProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.fos.common.security.dto.CategoryDetailsPermissionDTO}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class CategoryDetailsPermissionDTOProperties {
    private static final CategoryDetailsPermissionDTOPropertiesImpl<CategoryDetailsPermissionDTO> sharedInstance =
        new CategoryDetailsPermissionDTOPropertiesImpl<CategoryDetailsPermissionDTO>(CategoryDetailsPermissionDTO.class);

    private CategoryDetailsPermissionDTOProperties() {
    }

    public static Property<CategoryDetailsPermissionDTO> id() {
        return sharedInstance.id();
    }

    public static Property<CategoryDetailsPermissionDTO> categoryPermissionCode() {
        return sharedInstance.categoryPermissionCode();
    }

    public static Property<CategoryDetailsPermissionDTO> createFlag() {
        return sharedInstance.createFlag();
    }

    public static Property<CategoryDetailsPermissionDTO> modifyFlag() {
        return sharedInstance.modifyFlag();
    }

    public static Property<CategoryDetailsPermissionDTO> deleteFlag() {
        return sharedInstance.deleteFlag();
    }

    public static Property<CategoryDetailsPermissionDTO> viewFlag() {
        return sharedInstance.viewFlag();
    }

    public static CategoryDetailDTOProperty<CategoryDetailsPermissionDTO> categoryDetail() {
        return sharedInstance.categoryDetail();
    }

    /**
     * This class is used for references to {@link com.fos.common.security.dto.CategoryDetailsPermissionDTO},
     * i.e. nested property.
     */
    public static class CategoryDetailsPermissionDTOProperty<T>
        extends CategoryDetailsPermissionDTOPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public CategoryDetailsPermissionDTOProperty(String parentPath,
            String additionalPath, Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class CategoryDetailsPermissionDTOPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        CategoryDetailsPermissionDTOPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        CategoryDetailsPermissionDTOPropertiesImpl(String parentPath,
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

        public CategoryDetailDTOProperty<T> categoryDetail() {
            return new CategoryDetailDTOProperty<T>(getParentPath(),
                "categoryDetail", owningClass);
        }
    }
}
