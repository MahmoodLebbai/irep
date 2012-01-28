package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.security.dto.ModulesDTO;
import com.fos.common.security.dto.OperationDTO;
import com.fos.common.security.dto.PermissionDTO;

/**
  * Builder for OperationDTO class.
  */
public class OperationDTOBuilder {
    private String functionCode;
    private String functionName;
    private String functionDesc;
    private boolean functionStatus;
    private ModulesDTO module;
    private List<PermissionDTO> permissions = new ArrayList<PermissionDTO>();

    public OperationDTOBuilder() {
    }

    /**
     * Static factor method for OperationDTOBuilder
     */
    public static OperationDTOBuilder operationDTO() {
        return new OperationDTOBuilder();
    }

    public OperationDTOBuilder functionCode(String val) {
        this.functionCode = val;
        return this;
    }

    public OperationDTOBuilder functionName(String val) {
        this.functionName = val;
        return this;
    }

    public OperationDTOBuilder functionDesc(String val) {
        this.functionDesc = val;
        return this;
    }

    public OperationDTOBuilder functionStatus(boolean val) {
        this.functionStatus = val;
        return this;
    }

    public OperationDTOBuilder module(ModulesDTO module) {
        this.module = module;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getPermissions}.
     */
    public OperationDTOBuilder addPermission(PermissionDTO permissionElement) {
        getPermissions().add(permissionElement);
        return this;
    }

    @XmlElement()
    public String getFunctionCode() {
        return functionCode;
    }

    @XmlElement()
    public String getFunctionName() {
        return functionName;
    }

    @XmlElement()
    public String getFunctionDesc() {
        return functionDesc;
    }

    @XmlElement()
    public boolean isFunctionStatus() {
        return functionStatus;
    }

    public ModulesDTO getModule() {
        return module;
    }

    public List<PermissionDTO> getPermissions() {
        return permissions;
    }

    /**
     * @return new OperationDTO instance constructed based on the values that have been set into this builder
     */
    public OperationDTO build() {
        OperationDTO obj = new OperationDTO();

        obj.setFunctionCode(functionCode);

        obj.setFunctionName(functionName);

        obj.setFunctionDesc(functionDesc);

        obj.setFunctionStatus(functionStatus);

        obj.setModule(module);

        obj.getPermissions().addAll(permissions);

        return obj;
    }
}
