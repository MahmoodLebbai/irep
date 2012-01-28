package com.fos.common.security.domain;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.security.dto.CategoryDetailDTO;
import com.fos.common.security.dto.CategoryDetailsPermissionDTO;

/**
  * Builder for CategoryDetailsPermissionDTO class.
  */
public class CategoryDetailsPermissionDTOBuilder {
    private String categoryPermissionCode;
    private boolean createFlag;
    private boolean modifyFlag;
    private boolean deleteFlag;
    private boolean viewFlag;
    private CategoryDetailDTO categoryDetail;

    public CategoryDetailsPermissionDTOBuilder() {
    }

    /**
     * Static factor method for CategoryDetailsPermissionDTOBuilder
     */
    public static CategoryDetailsPermissionDTOBuilder categoryDetailsPermissionDTO() {
        return new CategoryDetailsPermissionDTOBuilder();
    }

    public CategoryDetailsPermissionDTOBuilder categoryPermissionCode(
        String val) {
        this.categoryPermissionCode = val;
        return this;
    }

    public CategoryDetailsPermissionDTOBuilder createFlag(boolean val) {
        this.createFlag = val;
        return this;
    }

    public CategoryDetailsPermissionDTOBuilder modifyFlag(boolean val) {
        this.modifyFlag = val;
        return this;
    }

    public CategoryDetailsPermissionDTOBuilder deleteFlag(boolean val) {
        this.deleteFlag = val;
        return this;
    }

    public CategoryDetailsPermissionDTOBuilder viewFlag(boolean val) {
        this.viewFlag = val;
        return this;
    }

    public CategoryDetailsPermissionDTOBuilder categoryDetail(
        CategoryDetailDTO categoryDetail) {
        this.categoryDetail = categoryDetail;
        return this;
    }

    @XmlElement()
    public String getCategoryPermissionCode() {
        return categoryPermissionCode;
    }

    @XmlElement()
    public boolean isCreateFlag() {
        return createFlag;
    }

    @XmlElement()
    public boolean isModifyFlag() {
        return modifyFlag;
    }

    @XmlElement()
    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    @XmlElement()
    public boolean isViewFlag() {
        return viewFlag;
    }

    public CategoryDetailDTO getCategoryDetail() {
        return categoryDetail;
    }

    /**
     * @return new CategoryDetailsPermissionDTO instance constructed based on the values that have been set into this builder
     */
    public CategoryDetailsPermissionDTO build() {
        CategoryDetailsPermissionDTO obj = new CategoryDetailsPermissionDTO();

        obj.setCategoryPermissionCode(categoryPermissionCode);

        obj.setCreateFlag(createFlag);

        obj.setModifyFlag(modifyFlag);

        obj.setDeleteFlag(deleteFlag);

        obj.setViewFlag(viewFlag);

        obj.setCategoryDetail(categoryDetail);

        return obj;
    }
}
