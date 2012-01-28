package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.CategoryDetailsPermission;

/**
 * Generated interface for Repository for CategoryDetailsPermission
 */
public interface CategoryDetailsPermissionRepository {
    public static final String BEAN_ID = "categoryDetailsPermissionRepository";

    public CategoryDetailsPermission findById(Long id);

    public List<CategoryDetailsPermission> findAll();

    public CategoryDetailsPermission save(CategoryDetailsPermission entity);

    public void delete(CategoryDetailsPermission entity);
}
