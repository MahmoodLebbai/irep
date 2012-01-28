package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.RolePermission;

/**
 * Generated interface for the Service RolePermissionService.
 */
public interface RolePermissionService {
    public static final String BEAN_ID = "rolePermissionService";

    public RolePermission findById(Long id);

    public List<RolePermission> findAll();

    public RolePermission save(RolePermission entity);

    public void delete(RolePermission entity);
}
