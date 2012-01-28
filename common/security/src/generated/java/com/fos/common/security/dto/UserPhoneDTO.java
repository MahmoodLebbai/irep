package com.fos.common.security.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
* Data transfer object for UserPhoneDTO.
*/
public class UserPhoneDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String phoneType;
    private String phoneNumber;
    private UserDTO user;

    public UserPhoneDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    @XmlElement()
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @XmlElement()
    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
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
