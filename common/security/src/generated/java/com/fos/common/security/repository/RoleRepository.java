package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.Role;

/**
 * Generated interface for Repository for Role
 */
public interface RoleRepository {
    public static final String BEAN_ID = "roleRepository";

    public Role findById(Long id);

    public List<Role> findAll();

    public Role save(Role entity);

    public void delete(Role entity);
}
