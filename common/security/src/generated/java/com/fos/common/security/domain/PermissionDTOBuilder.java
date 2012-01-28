package com.fos.common.security.domain;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.security.dto.OperationDTO;
import com.fos.common.security.dto.PermissionDTO;

/**
  * Builder for PermissionDTO class.
  */
public class PermissionDTOBuilder {
    private String permissionCode;
    private boolean createFlag;
    private boolean modifyFlag;
    private boolean deleteFlag;
    private boolean viewFlag;
    private OperationDTO operation;

    public PermissionDTOBuilder() {
    }

    /**
     * Static factor method for PermissionDTOBuilder
     */
    public static PermissionDTOBuilder permissionDTO() {
        return new PermissionDTOBuilder();
    }

    public PermissionDTOBuilder permissionCode(String val) {
        this.permissionCode = val;
        return this;
    }

    public PermissionDTOBuilder createFlag(boolean val) {
        this.createFlag = val;
        return this;
    }

    public PermissionDTOBuilder modifyFlag(boolean val) {
        this.modifyFlag = val;
        return this;
    }

    public PermissionDTOBuilder deleteFlag(boolean val) {
        this.deleteFlag = val;
        return this;
    }

    public PermissionDTOBuilder viewFlag(boolean val) {
        this.viewFlag = val;
        return this;
    }

    public PermissionDTOBuilder operation(OperationDTO operation) {
        this.operation = operation;
        return this;
    }

    @XmlElement()
    public String getPermissionCode() {
        return permissionCode;
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

    public OperationDTO getOperation() {
        return operation;
    }

    /**
     * @return new PermissionDTO instance constructed based on the values that have been set into this builder
     */
    public PermissionDTO build() {
        PermissionDTO obj = new PermissionDTO();

        obj.setPermissionCode(permissionCode);

        obj.setCreateFlag(createFlag);

        obj.setModifyFlag(modifyFlag);

        obj.setDeleteFlag(deleteFlag);

        obj.setViewFlag(viewFlag);

        obj.setOperation(operation);

        return obj;
    }
}
