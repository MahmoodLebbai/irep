package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * Builder for Modules class.
  */
public class ModulesBuilder {
    private String moduleCode;
    private String moduleName;
    private String moduleDesc;
    private boolean moduleStatus;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Applications application;
    private List<Operation> operations = new ArrayList<Operation>();

    public ModulesBuilder() {
    }

    public ModulesBuilder(String moduleCode) {
        this.moduleCode = moduleCode;

    }

    /**
     * Static factor method for ModulesBuilder
     */
    public static ModulesBuilder modules() {
        return new ModulesBuilder();
    }

    public ModulesBuilder moduleCode(String val) {
        this.moduleCode = val;
        return this;
    }

    public ModulesBuilder moduleName(String val) {
        this.moduleName = val;
        return this;
    }

    public ModulesBuilder moduleDesc(String val) {
        this.moduleDesc = val;
        return this;
    }

    public ModulesBuilder moduleStatus(boolean val) {
        this.moduleStatus = val;
        return this;
    }

    public ModulesBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public ModulesBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public ModulesBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public ModulesBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public ModulesBuilder application(Applications application) {
        this.application = application;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getOperations}.
     */
    public ModulesBuilder addOperation(Operation operationElement) {
        getOperations().add(operationElement);
        return this;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getModuleDesc() {
        return moduleDesc;
    }

    public boolean isModuleStatus() {
        return moduleStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public Applications getApplication() {
        return application;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    /**
     * @return new Modules instance constructed based on the values that have been set into this builder
     */
    public Modules build() {
        Modules obj = new Modules(getModuleCode());

        obj.setModuleName(moduleName);

        obj.setModuleDesc(moduleDesc);

        obj.setModuleStatus(moduleStatus);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.setApplication(application);

        obj.getOperations().addAll(operations);

        return obj;
    }
}
