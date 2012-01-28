package com.fos.common.security.domain;

import com.fos.common.security.dto.RoleDTO;
import com.fos.common.security.dto.UserGroupDTO;
import com.fos.common.security.dto.UserGroupRoleDTO;

/**
  * Builder for UserGroupRoleDTO class.
  */
public class UserGroupRoleDTOBuilder {
    private UserGroupDTO userGroup;
    private RoleDTO role;

    public UserGroupRoleDTOBuilder() {
    }

    /**
     * Static factor method for UserGroupRoleDTOBuilder
     */
    public static UserGroupRoleDTOBuilder userGroupRoleDTO() {
        return new UserGroupRoleDTOBuilder();
    }

    public UserGroupRoleDTOBuilder userGroup(UserGroupDTO userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    public UserGroupRoleDTOBuilder role(RoleDTO role) {
        this.role = role;
        return this;
    }

    public UserGroupDTO getUserGroup() {
        return userGroup;
    }

    public RoleDTO getRole() {
        return role;
    }

    /**
     * @return new UserGroupRoleDTO instance constructed based on the values that have been set into this builder
     */
    public UserGroupRoleDTO build() {
        UserGroupRoleDTO obj = new UserGroupRoleDTO();

        obj.setUserGroup(userGroup);

        obj.setRole(role);

        return obj;
    }
}
