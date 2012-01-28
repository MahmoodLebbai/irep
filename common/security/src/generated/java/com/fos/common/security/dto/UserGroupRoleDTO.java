package com.fos.common.security.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
* Data transfer object for UserGroupRoleDTO.
*/
public class UserGroupRoleDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private UserGroupDTO userGroup;
    private RoleDTO role;

    public UserGroupRoleDTO() {
    }

    @XmlElement()
    public UserGroupDTO getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroupDTO userGroup) {
        this.userGroup = userGroup;
    }

    @XmlElement()
    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
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
