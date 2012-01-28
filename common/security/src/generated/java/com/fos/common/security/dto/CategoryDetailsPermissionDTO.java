package com.fos.common.security.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
* Data transfer object for CategoryDetailsPermissionDTO.
*/
public class CategoryDetailsPermissionDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String categoryPermissionCode;
    private boolean createFlag;
    private boolean modifyFlag;
    private boolean deleteFlag;
    private boolean viewFlag;
    private CategoryDetailDTO categoryDetail;

    public CategoryDetailsPermissionDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public String getCategoryPermissionCode() {
        return categoryPermissionCode;
    }

    public void setCategoryPermissionCode(String categoryPermissionCode) {
        this.categoryPermissionCode = categoryPermissionCode;
    }

    @XmlElement()
    public boolean isCreateFlag() {
        return createFlag;
    }

    public void setCreateFlag(boolean createFlag) {
        this.createFlag = createFlag;
    }

    @XmlElement()
    public boolean isModifyFlag() {
        return modifyFlag;
    }

    public void setModifyFlag(boolean modifyFlag) {
        this.modifyFlag = modifyFlag;
    }

    @XmlElement()
    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @XmlElement()
    public boolean isViewFlag() {
        return viewFlag;
    }

    public void setViewFlag(boolean viewFlag) {
        this.viewFlag = viewFlag;
    }

    @XmlElement()
    public CategoryDetailDTO getCategoryDetail() {
        return categoryDetail;
    }

    public void setCategoryDetail(CategoryDetailDTO categoryDetail) {
        this.categoryDetail = categoryDetail;
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
