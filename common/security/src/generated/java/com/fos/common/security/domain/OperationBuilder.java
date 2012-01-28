package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * Builder for Operation class.
  */
public class OperationBuilder {
    private String functionCode;
    private String functionName;
    private String functionDesc;
    private boolean functionStatus;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Modules module;
    private List<Permission> permissions = new ArrayList<Permission>();

    public OperationBuilder() {
    }

    public OperationBuilder(String functionCode) {
        this.functionCode = functionCode;

    }

    /**
     * Static factor method for OperationBuilder
     */
    public static OperationBuilder operation() {
        return new OperationBuilder();
    }

    public OperationBuilder functionCode(String val) {
        this.functionCode = val;
        return this;
    }

    public OperationBuilder functionName(String val) {
        this.functionName = val;
        return this;
    }

    public OperationBuilder functionDesc(String val) {
        this.functionDesc = val;
        return this;
    }

    public OperationBuilder functionStatus(boolean val) {
        this.functionStatus = val;
        return this;
    }

    public OperationBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public OperationBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public OperationBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public OperationBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public OperationBuilder module(Modules module) {
        this.module = module;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getPermissions}.
     */
    public OperationBuilder addPermission(Permission permissionElement) {
        getPermissions().add(permissionElement);
        return this;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public String getFunctionName() {
        return functionName;
    }

    public String getFunctionDesc() {
        return functionDesc;
    }

    public boolean isFunctionStatus() {
        return functionStatus;
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

    public Modules getModule() {
        return module;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * @return new Operation instance constructed based on the values that have been set into this builder
     */
    public Operation build() {
        Operation obj = new Operation(getFunctionCode());

        obj.setFunctionName(functionName);

        obj.setFunctionDesc(functionDesc);

        obj.setFunctionStatus(functionStatus);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.setModule(module);

        obj.getPermissions().addAll(permissions);

        return obj;
    }
}
