package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.RolePermission;

/**
 * Generated interface for Repository for RolePermission
 */
public interface RolePermissionRepository {
    public static final String BEAN_ID = "rolePermissionRepository";

    public RolePermission findById(Long id);

    public List<RolePermission> findAll();

    public RolePermission save(RolePermission entity);

    public void delete(RolePermission entity);
}
