package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.security.dto.RoleDTO;
import com.fos.common.security.dto.RolePermissionDTO;
import com.fos.common.security.dto.UserGroupRoleDTO;
import com.fos.common.security.dto.UserRoleDTO;

/**
  * Builder for RoleDTO class.
  */
public class RoleDTOBuilder {
    private String roleCode;
    private String roleName;
    private String roleDesc;
    private boolean roleStatus;
    private List<RolePermissionDTO> rolePermissions =
        new ArrayList<RolePermissionDTO>();
    private List<UserRoleDTO> userRoles = new ArrayList<UserRoleDTO>();
    private List<UserGroupRoleDTO> userGroupRoles =
        new ArrayList<UserGroupRoleDTO>();

    public RoleDTOBuilder() {
    }

    /**
     * Static factor method for RoleDTOBuilder
     */
    public static RoleDTOBuilder roleDTO() {
        return new RoleDTOBuilder();
    }

    public RoleDTOBuilder roleCode(String val) {
        this.roleCode = val;
        return this;
    }

    public RoleDTOBuilder roleName(String val) {
        this.roleName = val;
        return this;
    }

    public RoleDTOBuilder roleDesc(String val) {
        this.roleDesc = val;
        return this;
    }

    public RoleDTOBuilder roleStatus(boolean val) {
        this.roleStatus = val;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getRolePermissions}.
     */
    public RoleDTOBuilder addRolePermission(
        RolePermissionDTO rolePermissionElement) {
        getRolePermissions().add(rolePermissionElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserRoles}.
     */
    public RoleDTOBuilder addUserRole(UserRoleDTO userRoleElement) {
        getUserRoles().add(userRoleElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserGroupRoles}.
     */
    public RoleDTOBuilder addUserGroupRole(
        UserGroupRoleDTO userGroupRoleElement) {
        getUserGroupRoles().add(userGroupRoleElement);
        return this;
    }

    @XmlElement()
    public String getRoleCode() {
        return roleCode;
    }

    @XmlElement()
    public String getRoleName() {
        return roleName;
    }

    @XmlElement()
    public String getRoleDesc() {
        return roleDesc;
    }

    @XmlElement()
    public boolean isRoleStatus() {
        return roleStatus;
    }

    public List<RolePermissionDTO> getRolePermissions() {
        return rolePermissions;
    }

    public List<UserRoleDTO> getUserRoles() {
        return userRoles;
    }

    public List<UserGroupRoleDTO> getUserGroupRoles() {
        return userGroupRoles;
    }

    /**
     * @return new RoleDTO instance constructed based on the values that have been set into this builder
     */
    public RoleDTO build() {
        RoleDTO obj = new RoleDTO();

        obj.setRoleCode(roleCode);

        obj.setRoleName(roleName);

        obj.setRoleDesc(roleDesc);

        obj.setRoleStatus(roleStatus);

        obj.getRolePermissions().addAll(rolePermissions);

        obj.getUserRoles().addAll(userRoles);

        obj.getUserGroupRoles().addAll(userGroupRoles);

        return obj;
    }
}
