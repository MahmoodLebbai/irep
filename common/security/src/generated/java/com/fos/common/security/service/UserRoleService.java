package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.UserRole;

/**
 * Generated interface for the Service UserRoleService.
 */
public interface UserRoleService {
    public static final String BEAN_ID = "userRoleService";

    public UserRole findById(Long id);

    public List<UserRole> findAll();

    public UserRole save(UserRole entity);

    public void delete(UserRole entity);
}
