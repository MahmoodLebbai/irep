package com.fos.common.security.domain;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.security.dto.UserDTO;
import com.fos.common.security.dto.UserEmailDTO;

/**
  * Builder for UserEmailDTO class.
  */
public class UserEmailDTOBuilder {
    private String emailType;
    private String emailId;
    private UserDTO user;

    public UserEmailDTOBuilder() {
    }

    /**
     * Static factor method for UserEmailDTOBuilder
     */
    public static UserEmailDTOBuilder userEmailDTO() {
        return new UserEmailDTOBuilder();
    }

    public UserEmailDTOBuilder emailType(String val) {
        this.emailType = val;
        return this;
    }

    public UserEmailDTOBuilder emailId(String val) {
        this.emailId = val;
        return this;
    }

    public UserEmailDTOBuilder user(UserDTO user) {
        this.user = user;
        return this;
    }

    @XmlElement()
    public String getEmailType() {
        return emailType;
    }

    @XmlElement()
    public String getEmailId() {
        return emailId;
    }

    public UserDTO getUser() {
        return user;
    }

    /**
     * @return new UserEmailDTO instance constructed based on the values that have been set into this builder
     */
    public UserEmailDTO build() {
        UserEmailDTO obj = new UserEmailDTO();

        obj.setEmailType(emailType);

        obj.setEmailId(emailId);

        obj.setUser(user);

        return obj;
    }
}
