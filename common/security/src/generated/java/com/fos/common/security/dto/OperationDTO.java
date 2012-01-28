package com.fos.common.security.dto;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
* Data transfer object for OperationDTO.
*/
public class OperationDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String functionCode;
    private String functionName;
    private String functionDesc;
    private boolean functionStatus;
    private ModulesDTO module;
    private List<PermissionDTO> permissions = new ArrayList<PermissionDTO>();

    public OperationDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    @XmlElement()
    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    @XmlElement()
    public String getFunctionDesc() {
        return functionDesc;
    }

    public void setFunctionDesc(String functionDesc) {
        this.functionDesc = functionDesc;
    }

    @XmlElement()
    public boolean isFunctionStatus() {
        return functionStatus;
    }

    public void setFunctionStatus(boolean functionStatus) {
        this.functionStatus = functionStatus;
    }

    @XmlElement()
    public ModulesDTO getModule() {
        return module;
    }

    public void setModule(ModulesDTO module) {
        this.module = module;
    }

    @XmlElementWrapper(name = "permissions")
    @XmlElement(name = "permission")
    public List<PermissionDTO> getPermissions() {
        return permissions;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getPermissions}.
     */
    public void addPermission(PermissionDTO permissionElement) {
        getPermissions().add(permissionElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getPermissions}.
     */
    public void removePermission(PermissionDTO permissionElement) {
        getPermissions().remove(permissionElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getPermissions}.
     */
    public void removeAllPermissions() {
        getPermissions().clear();
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
