package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.UserCategoryPermission;
import com.fos.common.security.repository.UserCategoryPermissionRepository;
import com.fos.common.security.service.UserCategoryPermissionService;

/**
* Implementation of UserCategoryPermissionService.
*/
@Service("userCategoryPermissionService")
public class UserCategoryPermissionServiceImpl
    implements UserCategoryPermissionService {
    @Autowired
    private UserCategoryPermissionRepository userCategoryPermissionRepository;

    public UserCategoryPermissionServiceImpl() {
    }

    protected UserCategoryPermissionRepository getUserCategoryPermissionRepository() {
        return userCategoryPermissionRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserCategoryPermissionRepository#findById}
     */
    public UserCategoryPermission findById(Long id) {
        return userCategoryPermissionRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserCategoryPermissionRepository#findAll}
     */
    public List<UserCategoryPermission> findAll() {
        return userCategoryPermissionRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserCategoryPermissionRepository#save}
     */
    public UserCategoryPermission save(UserCategoryPermission entity) {
        return userCategoryPermissionRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserCategoryPermissionRepository#delete}
     */
    public void delete(UserCategoryPermission entity) {
        userCategoryPermissionRepository.delete(entity);

    }
}
