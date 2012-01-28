package com.fos.common.security.domain;

import java.util.Date;

/**
  * Builder for UserEmail class.
  */
public class UserEmailBuilder {
    private String emailType;
    private String emailId;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private User user;

    public UserEmailBuilder() {
    }

    public UserEmailBuilder(String emailId) {
        this.emailId = emailId;

    }

    /**
     * Static factor method for UserEmailBuilder
     */
    public static UserEmailBuilder userEmail() {
        return new UserEmailBuilder();
    }

    public UserEmailBuilder emailType(String val) {
        this.emailType = val;
        return this;
    }

    public UserEmailBuilder emailId(String val) {
        this.emailId = val;
        return this;
    }

    public UserEmailBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public UserEmailBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public UserEmailBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public UserEmailBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public UserEmailBuilder user(User user) {
        this.user = user;
        return this;
    }

    public String getEmailType() {
        return emailType;
    }

    public String getEmailId() {
        return emailId;
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

    /**
     * @return new UserEmail instance constructed based on the values that have been set into this builder
     */
    public UserEmail build() {
        UserEmail obj = new UserEmail(getEmailId());

        obj.setEmailType(emailType);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.setUser(user);

        return obj;
    }
}
