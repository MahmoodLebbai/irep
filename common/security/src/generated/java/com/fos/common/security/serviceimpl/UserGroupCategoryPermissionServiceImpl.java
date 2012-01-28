package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.UserGroupCategoryPermission;
import com.fos.common.security.repository.UserGroupCategoryPermissionRepository;
import com.fos.common.security.service.UserGroupCategoryPermissionService;

/**
* Implementation of UserGroupCategoryPermissionService.
*/
@Service("userGroupCategoryPermissionService")
public class UserGroupCategoryPermissionServiceImpl
    implements UserGroupCategoryPermissionService {
    @Autowired
    private UserGroupCategoryPermissionRepository userGroupCategoryPermissionRepository;

    public UserGroupCategoryPermissionServiceImpl() {
    }

    protected UserGroupCategoryPermissionRepository getUserGroupCategoryPermissionRepository() {
        return userGroupCategoryPermissionRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserGroupCategoryPermissionRepository#findById}
     */
    public UserGroupCategoryPermission findById(Long id) {
        return userGroupCategoryPermissionRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserGroupCategoryPermissionRepository#findAll}
     */
    public List<UserGroupCategoryPermission> findAll() {
        return userGroupCategoryPermissionRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserGroupCategoryPermissionRepository#save}
     */
    public UserGroupCategoryPermission save(UserGroupCategoryPermission entity) {
        return userGroupCategoryPermissionRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserGroupCategoryPermissionRepository#delete}
     */
    public void delete(UserGroupCategoryPermission entity) {
        userGroupCategoryPermissionRepository.delete(entity);

    }
}
