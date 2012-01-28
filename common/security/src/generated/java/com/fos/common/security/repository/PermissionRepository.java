package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.Permission;

/**
 * Generated interface for Repository for Permission
 */
public interface PermissionRepository {
    public static final String BEAN_ID = "permissionRepository";

    public Permission findById(Long id);

    public List<Permission> findAll();

    public Permission save(Permission entity);

    public void delete(Permission entity);
}
