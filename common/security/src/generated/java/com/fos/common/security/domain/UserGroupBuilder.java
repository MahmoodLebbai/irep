package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * Builder for UserGroup class.
  */
public class UserGroupBuilder {
    private String userGroupCode;
    private String userGroupName;
    private String userGroupDesc;
    private boolean userGroupStatus;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private List<User> users = new ArrayList<User>();
    private List<UserGroupRole> userGroupRoles = new ArrayList<UserGroupRole>();
    private List<UserGroupCategoryPermission> userGroupCategoryPermissions =
        new ArrayList<UserGroupCategoryPermission>();

    public UserGroupBuilder() {
    }

    public UserGroupBuilder(String userGroupCode, String userGroupName) {
        this.userGroupCode = userGroupCode;

        this.userGroupName = userGroupName;

    }

    /**
     * Static factor method for UserGroupBuilder
     */
    public static UserGroupBuilder userGroup() {
        return new UserGroupBuilder();
    }

    public UserGroupBuilder userGroupCode(String val) {
        this.userGroupCode = val;
        return this;
    }

    public UserGroupBuilder userGroupName(String val) {
        this.userGroupName = val;
        return this;
    }

    public UserGroupBuilder userGroupDesc(String val) {
        this.userGroupDesc = val;
        return this;
    }

    public UserGroupBuilder userGroupStatus(boolean val) {
        this.userGroupStatus = val;
        return this;
    }

    public UserGroupBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public UserGroupBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public UserGroupBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public UserGroupBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUsers}.
     */
    public UserGroupBuilder addUser(User userElement) {
        getUsers().add(userElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserGroupRoles}.
     */
    public UserGroupBuilder addUserGroupRole(UserGroupRole userGroupRoleElement) {
        getUserGroupRoles().add(userGroupRoleElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserGroupCategoryPermissions}.
     */
    public UserGroupBuilder addUserGroupCategoryPermission(
        UserGroupCategoryPermission userGroupCategoryPermissionElement) {
        getUserGroupCategoryPermissions().add(userGroupCategoryPermissionElement);
        return this;
    }

    public String getUserGroupCode() {
        return userGroupCode;
    }

    public String getUserGroupName() {
        return userGroupName;
    }

    public String getUserGroupDesc() {
        return userGroupDesc;
    }

    public boolean isUserGroupStatus() {
        return userGroupStatus;
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

    public List<User> getUsers() {
        return users;
    }

    public List<UserGroupRole> getUserGroupRoles() {
        return userGroupRoles;
    }

    public List<UserGroupCategoryPermission> getUserGroupCategoryPermissions() {
        return userGroupCategoryPermissions;
    }

    /**
     * @return new UserGroup instance constructed based on the values that have been set into this builder
     */
    public UserGroup build() {
        UserGroup obj = new UserGroup(getUserGroupCode(), getUserGroupName());

        obj.setUserGroupDesc(userGroupDesc);

        obj.setUserGroupStatus(userGroupStatus);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.getUsers().addAll(users);

        obj.getUserGroupRoles().addAll(userGroupRoles);

        obj.getUserGroupCategoryPermissions()
           .addAll(userGroupCategoryPermissions);

        return obj;
    }
}
