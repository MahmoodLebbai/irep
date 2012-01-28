package com.fos.common.emailtemplate.domain;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.emailtemplate.dto.UserRegisteration;

/**
  * Builder for UserRegisteration class.
  */
public class UserRegisterationBuilder {
    private String userFirstName;
    private String userLastName;
    private String emailAddress;
    private String password;
    private String userId;
    private String applicationUrl;
    private String changePasswordUrlLink;
    private String emailSenderDetail;
    private Integer changePasswordLinkExpiry;
    private PassworkLinkExpiry passwordLinkExpiry;

    public UserRegisterationBuilder() {
    }

    /**
     * Static factor method for UserRegisterationBuilder
     */
    public static UserRegisterationBuilder userRegisteration() {
        return new UserRegisterationBuilder();
    }

    public UserRegisterationBuilder userFirstName(String val) {
        this.userFirstName = val;
        return this;
    }

    public UserRegisterationBuilder userLastName(String val) {
        this.userLastName = val;
        return this;
    }

    public UserRegisterationBuilder emailAddress(String val) {
        this.emailAddress = val;
        return this;
    }

    public UserRegisterationBuilder password(String val) {
        this.password = val;
        return this;
    }

    public UserRegisterationBuilder userId(String val) {
        this.userId = val;
        return this;
    }

    public UserRegisterationBuilder applicationUrl(String val) {
        this.applicationUrl = val;
        return this;
    }

    public UserRegisterationBuilder changePasswordUrlLink(String val) {
        this.changePasswordUrlLink = val;
        return this;
    }

    public UserRegisterationBuilder emailSenderDetail(String val) {
        this.emailSenderDetail = val;
        return this;
    }

    public UserRegisterationBuilder changePasswordLinkExpiry(Integer val) {
        this.changePasswordLinkExpiry = val;
        return this;
    }

    public UserRegisterationBuilder passwordLinkExpiry(
        PassworkLinkExpiry passwordLinkExpiry) {
        this.passwordLinkExpiry = passwordLinkExpiry;
        return this;
    }

    @XmlElement()
    public String getUserFirstName() {
        return userFirstName;
    }

    @XmlElement()
    public String getUserLastName() {
        return userLastName;
    }

    @XmlElement()
    public String getEmailAddress() {
        return emailAddress;
    }

    @XmlElement()
    public String getPassword() {
        return password;
    }

    @XmlElement()
    public String getUserId() {
        return userId;
    }

    @XmlElement()
    public String getApplicationUrl() {
        return applicationUrl;
    }

    @XmlElement()
    public String getChangePasswordUrlLink() {
        return changePasswordUrlLink;
    }

    @XmlElement()
    public String getEmailSenderDetail() {
        return emailSenderDetail;
    }

    @XmlElement()
    public Integer getChangePasswordLinkExpiry() {
        return changePasswordLinkExpiry;
    }

    public PassworkLinkExpiry getPasswordLinkExpiry() {
        return passwordLinkExpiry;
    }

    /**
     * @return new UserRegisteration instance constructed based on the values that have been set into this builder
     */
    public UserRegisteration build() {
        UserRegisteration obj = new UserRegisteration();

        obj.setUserFirstName(userFirstName);

        obj.setUserLastName(userLastName);

        obj.setEmailAddress(emailAddress);

        obj.setPassword(password);

        obj.setUserId(userId);

        obj.setApplicationUrl(applicationUrl);

        obj.setChangePasswordUrlLink(changePasswordUrlLink);

        obj.setEmailSenderDetail(emailSenderDetail);

        obj.setChangePasswordLinkExpiry(changePasswordLinkExpiry);

        obj.setPasswordLinkExpiry(passwordLinkExpiry);

        return obj;
    }
}
