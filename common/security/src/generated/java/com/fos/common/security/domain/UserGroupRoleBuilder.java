package com.fos.common.security.domain;

import java.util.Date;

/**
  * Builder for UserGroupRole class.
  */
public class UserGroupRoleBuilder {
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private UserGroup userGroup;
    private Role role;

    public UserGroupRoleBuilder() {
    }

    public UserGroupRoleBuilder(UserGroup userGroup, Role role) {
        this.userGroup = userGroup;

        this.role = role;

    }

    /**
     * Static factor method for UserGroupRoleBuilder
     */
    public static UserGroupRoleBuilder userGroupRole() {
        return new UserGroupRoleBuilder();
    }

    public UserGroupRoleBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public UserGroupRoleBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public UserGroupRoleBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public UserGroupRoleBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public UserGroupRoleBuilder userGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    public UserGroupRoleBuilder role(Role role) {
        this.role = role;
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

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public Role getRole() {
        return role;
    }

    /**
     * @return new UserGroupRole instance constructed based on the values that have been set into this builder
     */
    public UserGroupRole build() {
        UserGroupRole obj = new UserGroupRole(getUserGroup(), getRole());

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        return obj;
    }
}
