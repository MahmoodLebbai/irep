package com.fos.common.security.dto;

import java.io.Serializable;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;

/**
* Data transfer object for UserDelegationDTO.
*/
public class UserDelegationDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private boolean delegationStatus;
    private Date startDate;
    private Date endDate;
    private UserDTO user;
    private UserDTO delegatedUser;

    public UserDelegationDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public boolean isDelegationStatus() {
        return delegationStatus;
    }

    public void setDelegationStatus(boolean delegationStatus) {
        this.delegationStatus = delegationStatus;
    }

    @XmlElement()
    @XmlSchemaType(name = "date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @XmlElement()
    @XmlSchemaType(name = "date")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @XmlElement()
    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    @XmlElement()
    public UserDTO getDelegatedUser() {
        return delegatedUser;
    }

    public void setDelegatedUser(UserDTO delegatedUser) {
        this.delegatedUser = delegatedUser;
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
