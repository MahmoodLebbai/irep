package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.Permission;

/**
 * Generated interface for the Service PermissionService.
 */
public interface PermissionService {
    public static final String BEAN_ID = "permissionService";

    public Permission findById(Long id);

    public List<Permission> findAll();

    public Permission save(Permission entity);

    public void delete(Permission entity);
}
