package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.CategoryDetailsPermission;

/**
 * Generated interface for the Service CategoryDetailsPermissionService.
 */
public interface CategoryDetailsPermissionService {
    public static final String BEAN_ID = "categoryDetailsPermissionService";

    public CategoryDetailsPermission findById(Long id);

    public List<CategoryDetailsPermission> findAll();

    public CategoryDetailsPermission save(CategoryDetailsPermission entity);

    public void delete(CategoryDetailsPermission entity);
}
