package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.security.dto.CategoryDTO;
import com.fos.common.security.dto.CategoryDetailDTO;
import com.fos.common.security.dto.CategoryDetailsPermissionDTO;

/**
  * Builder for CategoryDetailDTO class.
  */
public class CategoryDetailDTOBuilder {
    private String name;
    private String desc;
    private boolean status;
    private CategoryDTO category;
    private List<CategoryDetailsPermissionDTO> categoryDetailPermissions =
        new ArrayList<CategoryDetailsPermissionDTO>();

    public CategoryDetailDTOBuilder() {
    }

    /**
     * Static factor method for CategoryDetailDTOBuilder
     */
    public static CategoryDetailDTOBuilder categoryDetailDTO() {
        return new CategoryDetailDTOBuilder();
    }

    public CategoryDetailDTOBuilder name(String val) {
        this.name = val;
        return this;
    }

    public CategoryDetailDTOBuilder desc(String val) {
        this.desc = val;
        return this;
    }

    public CategoryDetailDTOBuilder status(boolean val) {
        this.status = val;
        return this;
    }

    public CategoryDetailDTOBuilder category(CategoryDTO category) {
        this.category = category;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getCategoryDetailPermissions}.
     */
    public CategoryDetailDTOBuilder addCategoryDetailPermission(
        CategoryDetailsPermissionDTO categoryDetailPermissionElement) {
        getCategoryDetailPermissions().add(categoryDetailPermissionElement);
        return this;
    }

    @XmlElement()
    public String getName() {
        return name;
    }

    @XmlElement()
    public String getDesc() {
        return desc;
    }

    @XmlElement()
    public boolean isStatus() {
        return status;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public List<CategoryDetailsPermissionDTO> getCategoryDetailPermissions() {
        return categoryDetailPermissions;
    }

    /**
     * @return new CategoryDetailDTO instance constructed based on the values that have been set into this builder
     */
    public CategoryDetailDTO build() {
        CategoryDetailDTO obj = new CategoryDetailDTO();

        obj.setName(name);

        obj.setDesc(desc);

        obj.setStatus(status);

        obj.setCategory(category);

        obj.getCategoryDetailPermissions().addAll(categoryDetailPermissions);

        return obj;
    }
}
