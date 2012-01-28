package com.fos.common.security.domain;

import javax.xml.bind.annotation.XmlElement;

import com.fos.common.security.dto.UserDTO;
import com.fos.common.security.dto.UserPhoneDTO;

/**
  * Builder for UserPhoneDTO class.
  */
public class UserPhoneDTOBuilder {
    private String phoneType;
    private String phoneNumber;
    private UserDTO user;

    public UserPhoneDTOBuilder() {
    }

    /**
     * Static factor method for UserPhoneDTOBuilder
     */
    public static UserPhoneDTOBuilder userPhoneDTO() {
        return new UserPhoneDTOBuilder();
    }

    public UserPhoneDTOBuilder phoneType(String val) {
        this.phoneType = val;
        return this;
    }

    public UserPhoneDTOBuilder phoneNumber(String val) {
        this.phoneNumber = val;
        return this;
    }

    public UserPhoneDTOBuilder user(UserDTO user) {
        this.user = user;
        return this;
    }

    @XmlElement()
    public String getPhoneType() {
        return phoneType;
    }

    @XmlElement()
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserDTO getUser() {
        return user;
    }

    /**
     * @return new UserPhoneDTO instance constructed based on the values that have been set into this builder
     */
    public UserPhoneDTO build() {
        UserPhoneDTO obj = new UserPhoneDTO();

        obj.setPhoneType(phoneType);

        obj.setPhoneNumber(phoneNumber);

        obj.setUser(user);

        return obj;
    }
}
