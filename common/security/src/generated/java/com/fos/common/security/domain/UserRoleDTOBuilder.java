package com.fos.common.security.domain;

import com.fos.common.security.dto.RoleDTO;
import com.fos.common.security.dto.UserDTO;
import com.fos.common.security.dto.UserRoleDTO;

/**
  * Builder for UserRoleDTO class.
  */
public class UserRoleDTOBuilder {
    private RoleDTO role;
    private UserDTO user;

    public UserRoleDTOBuilder() {
    }

    /**
     * Static factor method for UserRoleDTOBuilder
     */
    public static UserRoleDTOBuilder userRoleDTO() {
        return new UserRoleDTOBuilder();
    }

    public UserRoleDTOBuilder role(RoleDTO role) {
        this.role = role;
        return this;
    }

    public UserRoleDTOBuilder user(UserDTO user) {
        this.user = user;
        return this;
    }

    public RoleDTO getRole() {
        return role;
    }

    public UserDTO getUser() {
        return user;
    }

    /**
     * @return new UserRoleDTO instance constructed based on the values that have been set into this builder
     */
    public UserRoleDTO build() {
        UserRoleDTO obj = new UserRoleDTO();

        obj.setRole(role);

        obj.setUser(user);

        return obj;
    }
}
