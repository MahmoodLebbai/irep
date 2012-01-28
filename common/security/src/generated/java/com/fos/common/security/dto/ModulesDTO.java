package com.fos.common.security.dto;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
* Data transfer object for ModulesDTO.
*/
public class ModulesDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String moduleCode;
    private String moduleName;
    private String moduleDesc;
    private boolean moduleStatus;
    private ApplicationsDTO application;
    private List<OperationDTO> operations = new ArrayList<OperationDTO>();

    public ModulesDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    @XmlElement()
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @XmlElement()
    public String getModuleDesc() {
        return moduleDesc;
    }

    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc;
    }

    @XmlElement()
    public boolean isModuleStatus() {
        return moduleStatus;
    }

    public void setModuleStatus(boolean moduleStatus) {
        this.moduleStatus = moduleStatus;
    }

    @XmlElement()
    public ApplicationsDTO getApplication() {
        return application;
    }

    public void setApplication(ApplicationsDTO application) {
        this.application = application;
    }

    @XmlElementWrapper(name = "operations")
    @XmlElement(name = "operation")
    public List<OperationDTO> getOperations() {
        return operations;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getOperations}.
     */
    public void addOperation(OperationDTO operationElement) {
        getOperations().add(operationElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getOperations}.
     */
    public void removeOperation(OperationDTO operationElement) {
        getOperations().remove(operationElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getOperations}.
     */
    public void removeAllOperations() {
        getOperations().clear();
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
