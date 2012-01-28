package com.fos.common.security.dto;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
* Data transfer object for ApplicationsDTO.
*/
public class ApplicationsDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String applicationCode;
    private String applicationName;
    private String applicationDesc;
    private boolean applicationStatus;
    private List<ModulesDTO> modules = new ArrayList<ModulesDTO>();

    public ApplicationsDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    @XmlElement()
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @XmlElement()
    public String getApplicationDesc() {
        return applicationDesc;
    }

    public void setApplicationDesc(String applicationDesc) {
        this.applicationDesc = applicationDesc;
    }

    @XmlElement()
    public boolean isApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(boolean applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    @XmlElementWrapper(name = "modules")
    @XmlElement(name = "module")
    public List<ModulesDTO> getModules() {
        return modules;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getModules}.
     */
    public void addModule(ModulesDTO moduleElement) {
        getModules().add(moduleElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getModules}.
     */
    public void removeModule(ModulesDTO moduleElement) {
        getModules().remove(moduleElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getModules}.
     */
    public void removeAllModules() {
        getModules().clear();
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
