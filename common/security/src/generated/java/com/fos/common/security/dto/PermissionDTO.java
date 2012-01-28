package com.fos.common.security.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
* Data transfer object for PermissionDTO.
*/
public class PermissionDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String permissionCode;
    private boolean createFlag;
    private boolean modifyFlag;
    private boolean deleteFlag;
    private boolean viewFlag;
    private OperationDTO operation;

    public PermissionDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
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
    public OperationDTO getOperation() {
        return operation;
    }

    public void setOperation(OperationDTO operation) {
        this.operation = operation;
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
