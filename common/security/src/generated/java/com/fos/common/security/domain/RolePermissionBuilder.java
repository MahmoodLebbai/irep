package com.fos.common.security.domain;

import java.util.Date;

/**
  * Builder for RolePermission class.
  */
public class RolePermissionBuilder {
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Role role;
    private Permission permission;

    public RolePermissionBuilder() {
    }

    public RolePermissionBuilder(Role role, Permission permission) {
        this.role = role;

        this.permission = permission;

    }

    /**
     * Static factor method for RolePermissionBuilder
     */
    public static RolePermissionBuilder rolePermission() {
        return new RolePermissionBuilder();
    }

    public RolePermissionBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public RolePermissionBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public RolePermissionBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public RolePermissionBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public RolePermissionBuilder role(Role role) {
        this.role = role;
        return this;
    }

    public RolePermissionBuilder permission(Permission permission) {
        this.permission = permission;
        return this;
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

    public Role getRole() {
        return role;
    }

    public Permission getPermission() {
        return permission;
    }

    /**
     * @return new RolePermission instance constructed based on the values that have been set into this builder
     */
    public RolePermission build() {
        RolePermission obj = new RolePermission(getRole(), getPermission());

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        return obj;
    }
}
