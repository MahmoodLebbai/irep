package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.Role;

/**
 * Generated interface for the Service RoleService.
 */
public interface RoleService {
    public static final String BEAN_ID = "roleService";

    public Role findById(Long id);

    public List<Role> findAll();

    public Role save(Role entity);

    public void delete(Role entity);
}
