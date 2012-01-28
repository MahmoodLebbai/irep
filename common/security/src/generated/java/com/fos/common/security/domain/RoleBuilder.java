package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * Builder for Role class.
  */
public class RoleBuilder {
    private String roleCode;
    private String roleName;
    private String roleDesc;
    private boolean roleStatus;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private List<RolePermission> rolePermissions =
        new ArrayList<RolePermission>();
    private List<UserRole> userRoles = new ArrayList<UserRole>();
    private List<UserGroupRole> userGroupRoles = new ArrayList<UserGroupRole>();

    public RoleBuilder() {
    }

    public RoleBuilder(String roleCode, String roleName) {
        this.roleCode = roleCode;

        this.roleName = roleName;

    }

    /**
     * Static factor method for RoleBuilder
     */
    public static RoleBuilder role() {
        return new RoleBuilder();
    }

    public RoleBuilder roleCode(String val) {
        this.roleCode = val;
        return this;
    }

    public RoleBuilder roleName(String val) {
        this.roleName = val;
        return this;
    }

    public RoleBuilder roleDesc(String val) {
        this.roleDesc = val;
        return this;
    }

    public RoleBuilder roleStatus(boolean val) {
        this.roleStatus = val;
        return this;
    }

    public RoleBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public RoleBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public RoleBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public RoleBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getRolePermissions}.
     */
    public RoleBuilder addRolePermission(RolePermission rolePermissionElement) {
        getRolePermissions().add(rolePermissionElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserRoles}.
     */
    public RoleBuilder addUserRole(UserRole userRoleElement) {
        getUserRoles().add(userRoleElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserGroupRoles}.
     */
    public RoleBuilder addUserGroupRole(UserGroupRole userGroupRoleElement) {
        getUserGroupRoles().add(userGroupRoleElement);
        return this;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public boolean isRoleStatus() {
        return roleStatus;
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

    public List<RolePermission> getRolePermissions() {
        return rolePermissions;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public List<UserGroupRole> getUserGroupRoles() {
        return userGroupRoles;
    }

    /**
     * @return new Role instance constructed based on the values that have been set into this builder
     */
    public Role build() {
        Role obj = new Role(getRoleCode(), getRoleName());

        obj.setRoleDesc(roleDesc);

        obj.setRoleStatus(roleStatus);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.getRolePermissions().addAll(rolePermissions);

        obj.getUserRoles().addAll(userRoles);

        obj.getUserGroupRoles().addAll(userGroupRoles);

        return obj;
    }
}
