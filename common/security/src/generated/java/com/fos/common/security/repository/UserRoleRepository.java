package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.UserRole;

/**
 * Generated interface for Repository for UserRole
 */
public interface UserRoleRepository {
    public static final String BEAN_ID = "userRoleRepository";

    public UserRole findById(Long id);

    public List<UserRole> findAll();

    public UserRole save(UserRole entity);

    public void delete(UserRole entity);
}
