package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.UserCategoryPermission;

/**
 * Generated interface for the Service UserCategoryPermissionService.
 */
public interface UserCategoryPermissionService {
    public static final String BEAN_ID = "userCategoryPermissionService";

    public UserCategoryPermission findById(Long id);

    public List<UserCategoryPermission> findAll();

    public UserCategoryPermission save(UserCategoryPermission entity);

    public void delete(UserCategoryPermission entity);
}
