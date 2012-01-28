package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.security.dto.ApplicationsDTO;
import com.fos.common.security.dto.ModulesDTO;

/**
  * Builder for ApplicationsDTO class.
  */
public class ApplicationsDTOBuilder {
    private String applicationCode;
    private String applicationName;
    private String applicationDesc;
    private boolean applicationStatus;
    private List<ModulesDTO> modules = new ArrayList<ModulesDTO>();

    public ApplicationsDTOBuilder() {
    }

    /**
     * Static factor method for ApplicationsDTOBuilder
     */
    public static ApplicationsDTOBuilder applicationsDTO() {
        return new ApplicationsDTOBuilder();
    }

    public ApplicationsDTOBuilder applicationCode(String val) {
        this.applicationCode = val;
        return this;
    }

    public ApplicationsDTOBuilder applicationName(String val) {
        this.applicationName = val;
        return this;
    }

    public ApplicationsDTOBuilder applicationDesc(String val) {
        this.applicationDesc = val;
        return this;
    }

    public ApplicationsDTOBuilder applicationStatus(boolean val) {
        this.applicationStatus = val;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getModules}.
     */
    public ApplicationsDTOBuilder addModule(ModulesDTO moduleElement) {
        getModules().add(moduleElement);
        return this;
    }

    @XmlElement()
    public String getApplicationCode() {
        return applicationCode;
    }

    @XmlElement()
    public String getApplicationName() {
        return applicationName;
    }

    @XmlElement()
    public String getApplicationDesc() {
        return applicationDesc;
    }

    @XmlElement()
    public boolean isApplicationStatus() {
        return applicationStatus;
    }

    public List<ModulesDTO> getModules() {
        return modules;
    }

    /**
     * @return new ApplicationsDTO instance constructed based on the values that have been set into this builder
     */
    public ApplicationsDTO build() {
        ApplicationsDTO obj = new ApplicationsDTO();

        obj.setApplicationCode(applicationCode);

        obj.setApplicationName(applicationName);

        obj.setApplicationDesc(applicationDesc);

        obj.setApplicationStatus(applicationStatus);

        obj.getModules().addAll(modules);

        return obj;
    }
}
