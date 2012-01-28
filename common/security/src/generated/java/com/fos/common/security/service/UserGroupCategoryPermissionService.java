package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.UserGroupCategoryPermission;

/**
 * Generated interface for the Service UserGroupCategoryPermissionService.
 */
public interface UserGroupCategoryPermissionService {
    public static final String BEAN_ID = "userGroupCategoryPermissionService";

    public UserGroupCategoryPermission findById(Long id);

    public List<UserGroupCategoryPermission> findAll();

    public UserGroupCategoryPermission save(UserGroupCategoryPermission entity);

    public void delete(UserGroupCategoryPermission entity);
}
