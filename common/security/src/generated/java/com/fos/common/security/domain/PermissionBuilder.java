package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * Builder for Permission class.
  */
public class PermissionBuilder {
    private String permissionCode;
    private boolean createFlag;
    private boolean modifyFlag;
    private boolean deleteFlag;
    private boolean viewFlag;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Operation operation;
    private List<RolePermission> rolePermissions =
        new ArrayList<RolePermission>();

    public PermissionBuilder() {
    }

    public PermissionBuilder(String permissionCode, Operation operation) {
        this.permissionCode = permissionCode;

        this.operation = operation;

    }

    /**
     * Static factor method for PermissionBuilder
     */
    public static PermissionBuilder permission() {
        return new PermissionBuilder();
    }

    public PermissionBuilder permissionCode(String val) {
        this.permissionCode = val;
        return this;
    }

    public PermissionBuilder createFlag(boolean val) {
        this.createFlag = val;
        return this;
    }

    public PermissionBuilder modifyFlag(boolean val) {
        this.modifyFlag = val;
        return this;
    }

    public PermissionBuilder deleteFlag(boolean val) {
        this.deleteFlag = val;
        return this;
    }

    public PermissionBuilder viewFlag(boolean val) {
        this.viewFlag = val;
        return this;
    }

    public PermissionBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public PermissionBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public PermissionBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public PermissionBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public PermissionBuilder operation(Operation operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getRolePermissions}.
     */
    public PermissionBuilder addRolePermission(
        RolePermission rolePermissionElement) {
        getRolePermissions().add(rolePermissionElement);
        return this;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public boolean isCreateFlag() {
        return createFlag;
    }

    public boolean isModifyFlag() {
        return modifyFlag;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public boolean isViewFlag() {
        return viewFlag;
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

    public Operation getOperation() {
        return operation;
    }

    public List<RolePermission> getRolePermissions() {
        return rolePermissions;
    }

    /**
     * @return new Permission instance constructed based on the values that have been set into this builder
     */
    public Permission build() {
        Permission obj = new Permission(getPermissionCode(), getOperation());

        obj.setCreateFlag(createFlag);

        obj.setModifyFlag(modifyFlag);

        obj.setDeleteFlag(deleteFlag);

        obj.setViewFlag(viewFlag);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.getRolePermissions().addAll(rolePermissions);

        return obj;
    }
}
