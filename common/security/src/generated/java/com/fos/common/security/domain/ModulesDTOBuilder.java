package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.security.dto.ApplicationsDTO;
import com.fos.common.security.dto.ModulesDTO;
import com.fos.common.security.dto.OperationDTO;

/**
  * Builder for ModulesDTO class.
  */
public class ModulesDTOBuilder {
    private String moduleCode;
    private String moduleName;
    private String moduleDesc;
    private boolean moduleStatus;
    private ApplicationsDTO application;
    private List<OperationDTO> operations = new ArrayList<OperationDTO>();

    public ModulesDTOBuilder() {
    }

    /**
     * Static factor method for ModulesDTOBuilder
     */
    public static ModulesDTOBuilder modulesDTO() {
        return new ModulesDTOBuilder();
    }

    public ModulesDTOBuilder moduleCode(String val) {
        this.moduleCode = val;
        return this;
    }

    public ModulesDTOBuilder moduleName(String val) {
        this.moduleName = val;
        return this;
    }

    public ModulesDTOBuilder moduleDesc(String val) {
        this.moduleDesc = val;
        return this;
    }

    public ModulesDTOBuilder moduleStatus(boolean val) {
        this.moduleStatus = val;
        return this;
    }

    public ModulesDTOBuilder application(ApplicationsDTO application) {
        this.application = application;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getOperations}.
     */
    public ModulesDTOBuilder addOperation(OperationDTO operationElement) {
        getOperations().add(operationElement);
        return this;
    }

    @XmlElement()
    public String getModuleCode() {
        return moduleCode;
    }

    @XmlElement()
    public String getModuleName() {
        return moduleName;
    }

    @XmlElement()
    public String getModuleDesc() {
        return moduleDesc;
    }

    @XmlElement()
    public boolean isModuleStatus() {
        return moduleStatus;
    }

    public ApplicationsDTO getApplication() {
        return application;
    }

    public List<OperationDTO> getOperations() {
        return operations;
    }

    /**
     * @return new ModulesDTO instance constructed based on the values that have been set into this builder
     */
    public ModulesDTO build() {
        ModulesDTO obj = new ModulesDTO();

        obj.setModuleCode(moduleCode);

        obj.setModuleName(moduleName);

        obj.setModuleDesc(moduleDesc);

        obj.setModuleStatus(moduleStatus);

        obj.setApplication(application);

        obj.getOperations().addAll(operations);

        return obj;
    }
}
