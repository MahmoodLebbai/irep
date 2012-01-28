package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.security.dto.UserDTO;
import com.fos.common.security.dto.UserGroupCategoryPermissionDTO;
import com.fos.common.security.dto.UserGroupDTO;
import com.fos.common.security.dto.UserGroupRoleDTO;

/**
  * Builder for UserGroupDTO class.
  */
public class UserGroupDTOBuilder {
    private String userGroupCode;
    private String userGroupName;
    private String userGroupDesc;
    private boolean userGroupStatus;
    private List<UserDTO> users = new ArrayList<UserDTO>();
    private List<UserGroupRoleDTO> userGroupRoles =
        new ArrayList<UserGroupRoleDTO>();
    private List<UserGroupCategoryPermissionDTO> userGroupCategoryPermissions =
        new ArrayList<UserGroupCategoryPermissionDTO>();

    public UserGroupDTOBuilder() {
    }

    /**
     * Static factor method for UserGroupDTOBuilder
     */
    public static UserGroupDTOBuilder userGroupDTO() {
        return new UserGroupDTOBuilder();
    }

    public UserGroupDTOBuilder userGroupCode(String val) {
        this.userGroupCode = val;
        return this;
    }

    public UserGroupDTOBuilder userGroupName(String val) {
        this.userGroupName = val;
        return this;
    }

    public UserGroupDTOBuilder userGroupDesc(String val) {
        this.userGroupDesc = val;
        return this;
    }

    public UserGroupDTOBuilder userGroupStatus(boolean val) {
        this.userGroupStatus = val;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUsers}.
     */
    public UserGroupDTOBuilder addUser(UserDTO userElement) {
        getUsers().add(userElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserGroupRoles}.
     */
    public UserGroupDTOBuilder addUserGroupRole(
        UserGroupRoleDTO userGroupRoleElement) {
        getUserGroupRoles().add(userGroupRoleElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserGroupCategoryPermissions}.
     */
    public UserGroupDTOBuilder addUserGroupCategoryPermission(
        UserGroupCategoryPermissionDTO userGroupCategoryPermissionElement) {
        getUserGroupCategoryPermissions().add(userGroupCategoryPermissionElement);
        return this;
    }

    @XmlElement()
    public String getUserGroupCode() {
        return userGroupCode;
    }

    @XmlElement()
    public String getUserGroupName() {
        return userGroupName;
    }

    @XmlElement()
    public String getUserGroupDesc() {
        return userGroupDesc;
    }

    @XmlElement()
    public boolean isUserGroupStatus() {
        return userGroupStatus;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public List<UserGroupRoleDTO> getUserGroupRoles() {
        return userGroupRoles;
    }

    public List<UserGroupCategoryPermissionDTO> getUserGroupCategoryPermissions() {
        return userGroupCategoryPermissions;
    }

    /**
     * @return new UserGroupDTO instance constructed based on the values that have been set into this builder
     */
    public UserGroupDTO build() {
        UserGroupDTO obj = new UserGroupDTO();

        obj.setUserGroupCode(userGroupCode);

        obj.setUserGroupName(userGroupName);

        obj.setUserGroupDesc(userGroupDesc);

        obj.setUserGroupStatus(userGroupStatus);

        obj.getUsers().addAll(users);

        obj.getUserGroupRoles().addAll(userGroupRoles);

        obj.getUserGroupCategoryPermissions()
           .addAll(userGroupCategoryPermissions);

        return obj;
    }
}
