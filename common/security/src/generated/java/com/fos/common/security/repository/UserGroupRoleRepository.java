package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.UserGroupRole;

/**
 * Generated interface for Repository for UserGroupRole
 */
public interface UserGroupRoleRepository {
    public static final String BEAN_ID = "userGroupRoleRepository";

    public UserGroupRole findById(Long id);

    public List<UserGroupRole> findAll();

    public UserGroupRole save(UserGroupRole entity);

    public void delete(UserGroupRole entity);
}
