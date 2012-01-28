package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.security.dto.CategoryDTO;
import com.fos.common.security.dto.CategoryDetailDTO;

/**
  * Builder for CategoryDTO class.
  */
public class CategoryDTOBuilder {
    private String categoryID;
    private String categoryName;
    private String categoryDesc;
    private boolean categoryStatus;
    private List<CategoryDetailDTO> categoryDetails =
        new ArrayList<CategoryDetailDTO>();

    public CategoryDTOBuilder() {
    }

    /**
     * Static factor method for CategoryDTOBuilder
     */
    public static CategoryDTOBuilder categoryDTO() {
        return new CategoryDTOBuilder();
    }

    public CategoryDTOBuilder categoryID(String val) {
        this.categoryID = val;
        return this;
    }

    public CategoryDTOBuilder categoryName(String val) {
        this.categoryName = val;
        return this;
    }

    public CategoryDTOBuilder categoryDesc(String val) {
        this.categoryDesc = val;
        return this;
    }

    public CategoryDTOBuilder categoryStatus(boolean val) {
        this.categoryStatus = val;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getCategoryDetails}.
     */
    public CategoryDTOBuilder addCategoryDetail(
        CategoryDetailDTO categoryDetailElement) {
        getCategoryDetails().add(categoryDetailElement);
        return this;
    }

    @XmlElement()
    public String getCategoryID() {
        return categoryID;
    }

    @XmlElement()
    public String getCategoryName() {
        return categoryName;
    }

    @XmlElement()
    public String getCategoryDesc() {
        return categoryDesc;
    }

    @XmlElement()
    public boolean isCategoryStatus() {
        return categoryStatus;
    }

    public List<CategoryDetailDTO> getCategoryDetails() {
        return categoryDetails;
    }

    /**
     * @return new CategoryDTO instance constructed based on the values that have been set into this builder
     */
    public CategoryDTO build() {
        CategoryDTO obj = new CategoryDTO();

        obj.setCategoryID(categoryID);

        obj.setCategoryName(categoryName);

        obj.setCategoryDesc(categoryDesc);

        obj.setCategoryStatus(categoryStatus);

        obj.getCategoryDetails().addAll(categoryDetails);

        return obj;
    }
}
