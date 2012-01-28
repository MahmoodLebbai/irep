package com.fos.common.security.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;

import com.fos.common.security.dto.UserDTO;
import com.fos.common.security.dto.UserDelegationDTO;

/**
  * Builder for UserDelegationDTO class.
  */
public class UserDelegationDTOBuilder {
    private boolean delegationStatus;
    private Date startDate;
    private Date endDate;
    private UserDTO user;
    private UserDTO delegatedUser;

    public UserDelegationDTOBuilder() {
    }

    /**
     * Static factor method for UserDelegationDTOBuilder
     */
    public static UserDelegationDTOBuilder userDelegationDTO() {
        return new UserDelegationDTOBuilder();
    }

    public UserDelegationDTOBuilder delegationStatus(boolean val) {
        this.delegationStatus = val;
        return this;
    }

    public UserDelegationDTOBuilder startDate(Date val) {
        this.startDate = val;
        return this;
    }

    public UserDelegationDTOBuilder endDate(Date val) {
        this.endDate = val;
        return this;
    }

    public UserDelegationDTOBuilder user(UserDTO user) {
        this.user = user;
        return this;
    }

    public UserDelegationDTOBuilder delegatedUser(UserDTO delegatedUser) {
        this.delegatedUser = delegatedUser;
        return this;
    }

    @XmlElement()
    public boolean isDelegationStatus() {
        return delegationStatus;
    }

    @XmlElement()
    @XmlSchemaType(name = "date")
    public Date getStartDate() {
        return startDate;
    }

    @XmlElement()
    @XmlSchemaType(name = "date")
    public Date getEndDate() {
        return endDate;
    }

    public UserDTO getUser() {
        return user;
    }

    public UserDTO getDelegatedUser() {
        return delegatedUser;
    }

    /**
     * @return new UserDelegationDTO instance constructed based on the values that have been set into this builder
     */
    public UserDelegationDTO build() {
        UserDelegationDTO obj = new UserDelegationDTO();

        obj.setDelegationStatus(delegationStatus);

        obj.setStartDate(startDate);

        obj.setEndDate(endDate);

        obj.setUser(user);

        obj.setDelegatedUser(delegatedUser);

        return obj;
    }
}
