package com.fos.common.security.dto;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
* Data transfer object for RoleDTO.
*/
public class RoleDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String roleCode;
    private String roleName;
    private String roleDesc;
    private boolean roleStatus;
    private List<RolePermissionDTO> rolePermissions =
        new ArrayList<RolePermissionDTO>();
    private List<UserRoleDTO> userRoles = new ArrayList<UserRoleDTO>();
    private List<UserGroupRoleDTO> userGroupRoles =
        new ArrayList<UserGroupRoleDTO>();

    public RoleDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @XmlElement()
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @XmlElement()
    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @XmlElement()
    public boolean isRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(boolean roleStatus) {
        this.roleStatus = roleStatus;
    }

    @XmlElementWrapper(name = "rolePermissions")
    @XmlElement(name = "rolePermission")
    public List<RolePermissionDTO> getRolePermissions() {
        return rolePermissions;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getRolePermissions}.
     */
    public void addRolePermission(RolePermissionDTO rolePermissionElement) {
        getRolePermissions().add(rolePermissionElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getRolePermissions}.
     */
    public void removeRolePermission(RolePermissionDTO rolePermissionElement) {
        getRolePermissions().remove(rolePermissionElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getRolePermissions}.
     */
    public void removeAllRolePermissions() {
        getRolePermissions().clear();
    }

    @XmlElementWrapper(name = "userRoles")
    @XmlElement(name = "userRole")
    public List<UserRoleDTO> getUserRoles() {
        return userRoles;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getUserRoles}.
     */
    public void addUserRole(UserRoleDTO userRoleElement) {
        getUserRoles().add(userRoleElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getUserRoles}.
     */
    public void removeUserRole(UserRoleDTO userRoleElement) {
        getUserRoles().remove(userRoleElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getUserRoles}.
     */
    public void removeAllUserRoles() {
        getUserRoles().clear();
    }

    @XmlElementWrapper(name = "userGroupRoles")
    @XmlElement(name = "userGroupRole")
    public List<UserGroupRoleDTO> getUserGroupRoles() {
        return userGroupRoles;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getUserGroupRoles}.
     */
    public void addUserGroupRole(UserGroupRoleDTO userGroupRoleElement) {
        getUserGroupRoles().add(userGroupRoleElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getUserGroupRoles}.
     */
    public void removeUserGroupRole(UserGroupRoleDTO userGroupRoleElement) {
        getUserGroupRoles().remove(userGroupRoleElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getUserGroupRoles}.
     */
    public void removeAllUserGroupRoles() {
        getUserGroupRoles().clear();
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
