package com.fos.common.security.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
* Data transfer object for RolePermissionDTO.
*/
public class RolePermissionDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private RoleDTO role;
    private PermissionDTO permission;

    public RolePermissionDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
    }

    @XmlElement()
    public PermissionDTO getPermission() {
        return permission;
    }

    public void setPermission(PermissionDTO permission) {
        this.permission = permission;
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
