package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.UserGroupRole;

/**
 * Generated interface for the Service UserGroupRoleService.
 */
public interface UserGroupRoleService {
    public static final String BEAN_ID = "userGroupRoleService";

    public UserGroupRole findById(Long id);

    public List<UserGroupRole> findAll();

    public UserGroupRole save(UserGroupRole entity);

    public void delete(UserGroupRole entity);
}
