package com.fos.common.security.domain;

import java.util.Date;

/**
  * Builder for UserPhone class.
  */
public class UserPhoneBuilder {
    private String phoneType;
    private String phoneNumber;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private User user;

    public UserPhoneBuilder() {
    }

    /**
     * Static factor method for UserPhoneBuilder
     */
    public static UserPhoneBuilder userPhone() {
        return new UserPhoneBuilder();
    }

    public UserPhoneBuilder phoneType(String val) {
        this.phoneType = val;
        return this;
    }

    public UserPhoneBuilder phoneNumber(String val) {
        this.phoneNumber = val;
        return this;
    }

    public UserPhoneBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public UserPhoneBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public UserPhoneBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public UserPhoneBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public UserPhoneBuilder user(User user) {
        this.user = user;
        return this;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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
     * @return new UserPhone instance constructed based on the values that have been set into this builder
     */
    public UserPhone build() {
        UserPhone obj = new UserPhone();

        obj.setPhoneType(phoneType);

        obj.setPhoneNumber(phoneNumber);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.setUser(user);

        return obj;
    }
}
