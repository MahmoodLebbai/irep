package com.fos.common.security.dto;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
* Data transfer object for CategoryDTO.
*/
public class CategoryDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String categoryID;
    private String categoryName;
    private String categoryDesc;
    private boolean categoryStatus;
    private List<CategoryDetailDTO> categoryDetails =
        new ArrayList<CategoryDetailDTO>();

    public CategoryDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    @XmlElement()
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @XmlElement()
    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    @XmlElement()
    public boolean isCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    @XmlElementWrapper(name = "categoryDetails")
    @XmlElement(name = "categoryDetail")
    public List<CategoryDetailDTO> getCategoryDetails() {
        return categoryDetails;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getCategoryDetails}.
     */
    public void addCategoryDetail(CategoryDetailDTO categoryDetailElement) {
        getCategoryDetails().add(categoryDetailElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getCategoryDetails}.
     */
    public void removeCategoryDetail(CategoryDetailDTO categoryDetailElement) {
        getCategoryDetails().remove(categoryDetailElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getCategoryDetails}.
     */
    public void removeAllCategoryDetails() {
        getCategoryDetails().clear();
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {

            // this shouldn't happen, since we are Cloneable
            throw new InternalError();
        }
    }
}
