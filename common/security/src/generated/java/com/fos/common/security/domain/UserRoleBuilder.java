package com.fos.common.security.domain;

import java.util.Date;

/**
  * Builder for UserRole class.
  */
public class UserRoleBuilder {
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Role role;
    private User user;

    public UserRoleBuilder() {
    }

    public UserRoleBuilder(Role role, User user) {
        this.role = role;

        this.user = user;

    }

    /**
     * Static factor method for UserRoleBuilder
     */
    public static UserRoleBuilder userRole() {
        return new UserRoleBuilder();
    }

    public UserRoleBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public UserRoleBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public UserRoleBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public UserRoleBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public UserRoleBuilder role(Role role) {
        this.role = role;
        return this;
    }

    public UserRoleBuilder user(User user) {
        this.user = user;
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

    public User getUser() {
        return user;
    }

    /**
     * @return new UserRole instance constructed based on the values that have been set into this builder
     */
    public UserRole build() {
        UserRole obj = new UserRole(getRole(), getUser());

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        return obj;
    }
}
