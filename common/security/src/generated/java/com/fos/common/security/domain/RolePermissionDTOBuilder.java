package com.fos.common.security.domain;

import com.fos.common.security.dto.PermissionDTO;
import com.fos.common.security.dto.RoleDTO;
import com.fos.common.security.dto.RolePermissionDTO;

/**
  * Builder for RolePermissionDTO class.
  */
public class RolePermissionDTOBuilder {
    private RoleDTO role;
    private PermissionDTO permission;

    public RolePermissionDTOBuilder() {
    }

    /**
     * Static factor method for RolePermissionDTOBuilder
     */
    public static RolePermissionDTOBuilder rolePermissionDTO() {
        return new RolePermissionDTOBuilder();
    }

    public RolePermissionDTOBuilder role(RoleDTO role) {
        this.role = role;
        return this;
    }

    public RolePermissionDTOBuilder permission(PermissionDTO permission) {
        this.permission = permission;
        return this;
    }

    public RoleDTO getRole() {
        return role;
    }

    public PermissionDTO getPermission() {
        return permission;
    }

    /**
     * @return new RolePermissionDTO instance constructed based on the values that have been set into this builder
     */
    public RolePermissionDTO build() {
        RolePermissionDTO obj = new RolePermissionDTO();

        obj.setRole(role);

        obj.setPermission(permission);

        return obj;
    }
}
