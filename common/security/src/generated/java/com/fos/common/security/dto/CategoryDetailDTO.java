package com.fos.common.security.dto;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
* Data transfer object for CategoryDetailDTO.
*/
public class CategoryDetailDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String desc;
    private boolean status;
    private CategoryDTO category;
    private List<CategoryDetailsPermissionDTO> categoryDetailPermissions =
        new ArrayList<CategoryDetailsPermissionDTO>();

    public CategoryDetailDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement()
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @XmlElement()
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @XmlElement()
    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    @XmlElementWrapper(name = "categoryDetailPermissions")
    @XmlElement(name = "categoryDetailPermission")
    public List<CategoryDetailsPermissionDTO> getCategoryDetailPermissions() {
        return categoryDetailPermissions;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getCategoryDetailPermissions}.
     */
    public void addCategoryDetailPermission(
        CategoryDetailsPermissionDTO categoryDetailPermissionElement) {
        getCategoryDetailPermissions().add(categoryDetailPermissionElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getCategoryDetailPermissions}.
     */
    public void removeCategoryDetailPermission(
        CategoryDetailsPermissionDTO categoryDetailPermissionElement) {
        getCategoryDetailPermissions().remove(categoryDetailPermissionElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getCategoryDetailPermissions}.
     */
    public void removeAllCategoryDetailPermissions() {
        getCategoryDetailPermissions().clear();
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
