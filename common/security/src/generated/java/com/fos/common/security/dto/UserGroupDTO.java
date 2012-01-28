package com.fos.common.security.dto;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
* Data transfer object for UserGroupDTO.
*/
public class UserGroupDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String userGroupCode;
    private String userGroupName;
    private String userGroupDesc;
    private boolean userGroupStatus;
    private List<UserDTO> users = new ArrayList<UserDTO>();
    private List<UserGroupRoleDTO> userGroupRoles =
        new ArrayList<UserGroupRoleDTO>();
    private List<UserGroupCategoryPermissionDTO> userGroupCategoryPermissions =
        new ArrayList<UserGroupCategoryPermissionDTO>();

    public UserGroupDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public String getUserGroupCode() {
        return userGroupCode;
    }

    public void setUserGroupCode(String userGroupCode) {
        this.userGroupCode = userGroupCode;
    }

    @XmlElement()
    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    @XmlElement()
    public String getUserGroupDesc() {
        return userGroupDesc;
    }

    public void setUserGroupDesc(String userGroupDesc) {
        this.userGroupDesc = userGroupDesc;
    }

    @XmlElement()
    public boolean isUserGroupStatus() {
        return userGroupStatus;
    }

    public void setUserGroupStatus(boolean userGroupStatus) {
        this.userGroupStatus = userGroupStatus;
    }

    @XmlElementWrapper(name = "users")
    @XmlElement(name = "user")
    public List<UserDTO> getUsers() {
        return users;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getUsers}.
     */
    public void addUser(UserDTO userElement) {
        getUsers().add(userElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getUsers}.
     */
    public void removeUser(UserDTO userElement) {
        getUsers().remove(userElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getUsers}.
     */
    public void removeAllUsers() {
        getUsers().clear();
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

    @XmlElementWrapper(name = "userGroupCategoryPermissions")
    @XmlElement(name = "userGroupCategoryPermission")
    public List<UserGroupCategoryPermissionDTO> getUserGroupCategoryPermissions() {
        return userGroupCategoryPermissions;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getUserGroupCategoryPermissions}.
     */
    public void addUserGroupCategoryPermission(
        UserGroupCategoryPermissionDTO userGroupCategoryPermissionElement) {
        getUserGroupCategoryPermissions().add(userGroupCategoryPermissionElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getUserGroupCategoryPermissions}.
     */
    public void removeUserGroupCategoryPermission(
        UserGroupCategoryPermissionDTO userGroupCategoryPermissionElement) {
        getUserGroupCategoryPermissions()
            .remove(userGroupCategoryPermissionElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getUserGroupCategoryPermissions}.
     */
    public void removeAllUserGroupCategoryPermissions() {
        getUserGroupCategoryPermissions().clear();
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
