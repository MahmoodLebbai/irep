package com.fos.common.emailtemplate.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.emailtemplate.domain.PassworkLinkExpiry;

/**
* Data transfer object for UserRegisteration.
*/
public class UserRegisteration implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
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

    public UserRegisteration() {
    }

    @XmlElement()
    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    @XmlElement()
    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    @XmlElement()
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @XmlElement()
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement()
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @XmlElement()
    public String getApplicationUrl() {
        return applicationUrl;
    }

    public void setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
    }

    @XmlElement()
    public String getChangePasswordUrlLink() {
        return changePasswordUrlLink;
    }

    public void setChangePasswordUrlLink(String changePasswordUrlLink) {
        this.changePasswordUrlLink = changePasswordUrlLink;
    }

    @XmlElement()
    public String getEmailSenderDetail() {
        return emailSenderDetail;
    }

    public void setEmailSenderDetail(String emailSenderDetail) {
        this.emailSenderDetail = emailSenderDetail;
    }

    @XmlElement()
    public Integer getChangePasswordLinkExpiry() {
        return changePasswordLinkExpiry;
    }

    public void setChangePasswordLinkExpiry(Integer changePasswordLinkExpiry) {
        this.changePasswordLinkExpiry = changePasswordLinkExpiry;
    }

    @XmlElement()
    public PassworkLinkExpiry getPasswordLinkExpiry() {
        return passwordLinkExpiry;
    }

    public void setPasswordLinkExpiry(PassworkLinkExpiry passwordLinkExpiry) {
        this.passwordLinkExpiry = passwordLinkExpiry;
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
