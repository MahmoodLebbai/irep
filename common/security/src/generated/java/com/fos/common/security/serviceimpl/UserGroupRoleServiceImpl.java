package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.UserGroupRole;
import com.fos.common.security.repository.UserGroupRoleRepository;
import com.fos.common.security.service.UserGroupRoleService;

/**
* Implementation of UserGroupRoleService.
*/
@Service("userGroupRoleService")
public class UserGroupRoleServiceImpl implements UserGroupRoleService {
    @Autowired
    private UserGroupRoleRepository userGroupRoleRepository;

    public UserGroupRoleServiceImpl() {
    }

    protected UserGroupRoleRepository getUserGroupRoleRepository() {
        return userGroupRoleRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserGroupRoleRepository#findById}
     */
    public UserGroupRole findById(Long id) {
        return userGroupRoleRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserGroupRoleRepository#findAll}
     */
    public List<UserGroupRole> findAll() {
        return userGroupRoleRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserGroupRoleRepository#save}
     */
    public UserGroupRole save(UserGroupRole entity) {
        return userGroupRoleRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserGroupRoleRepository#delete}
     */
    public void delete(UserGroupRole entity) {
        userGroupRoleRepository.delete(entity);

    }
}
