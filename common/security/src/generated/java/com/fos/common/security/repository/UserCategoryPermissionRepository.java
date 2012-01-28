package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.UserCategoryPermission;

/**
 * Generated interface for Repository for UserCategoryPermission
 */
public interface UserCategoryPermissionRepository {
    public static final String BEAN_ID = "userCategoryPermissionRepository";

    public UserCategoryPermission findById(Long id);

    public List<UserCategoryPermission> findAll();

    public UserCategoryPermission save(UserCategoryPermission entity);

    public void delete(UserCategoryPermission entity);
}
