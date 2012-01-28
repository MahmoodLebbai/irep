package com.fos.common.security.domain;

import java.util.Date;

/**
  * Builder for UserDelegation class.
  */
public class UserDelegationBuilder {
    private boolean delegationStatus;
    private Date startDate;
    private Date endDate;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private User user;
    private User delegatedUser;

    public UserDelegationBuilder() {
    }

    public UserDelegationBuilder(boolean delegationStatus, Date startDate,
        User user, User delegatedUser) {
        this.delegationStatus = delegationStatus;

        this.startDate = startDate;

        this.user = user;

        this.delegatedUser = delegatedUser;

    }

    /**
     * Static factor method for UserDelegationBuilder
     */
    public static UserDelegationBuilder userDelegation() {
        return new UserDelegationBuilder();
    }

    public UserDelegationBuilder delegationStatus(boolean val) {
        this.delegationStatus = val;
        return this;
    }

    public UserDelegationBuilder startDate(Date val) {
        this.startDate = val;
        return this;
    }

    public UserDelegationBuilder endDate(Date val) {
        this.endDate = val;
        return this;
    }

    public UserDelegationBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public UserDelegationBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public UserDelegationBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public UserDelegationBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public UserDelegationBuilder user(User user) {
        this.user = user;
        return this;
    }

    public UserDelegationBuilder delegatedUser(User delegatedUser) {
        this.delegatedUser = delegatedUser;
        return this;
    }

    public boolean isDelegationStatus() {
        return delegationStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
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

    public User getUser() {
        return user;
    }

    public User getDelegatedUser() {
        return delegatedUser;
    }

    /**
     * @return new UserDelegation instance constructed based on the values that have been set into this builder
     */
    public UserDelegation build() {
        UserDelegation obj =
            new UserDelegation(isDelegationStatus(), getStartDate(), getUser(),
                getDelegatedUser());

        obj.setEndDate(endDate);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        return obj;
    }
}
