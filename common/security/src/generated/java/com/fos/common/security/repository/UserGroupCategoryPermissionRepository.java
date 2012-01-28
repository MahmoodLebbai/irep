package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.UserGroupCategoryPermission;

/**
 * Generated interface for Repository for UserGroupCategoryPermission
 */
public interface UserGroupCategoryPermissionRepository {
    public static final String BEAN_ID =
        "userGroupCategoryPermissionRepository";

    public UserGroupCategoryPermission findById(Long id);

    public List<UserGroupCategoryPermission> findAll();

    public UserGroupCategoryPermission save(UserGroupCategoryPermission entity);

    public void delete(UserGroupCategoryPermission entity);
}
