package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.UserRole;
import com.fos.common.security.repository.UserRoleRepository;
import com.fos.common.security.service.UserRoleService;

/**
* Implementation of UserRoleService.
*/
@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl() {
    }

    protected UserRoleRepository getUserRoleRepository() {
        return userRoleRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserRoleRepository#findById}
     */
    public UserRole findById(Long id) {
        return userRoleRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserRoleRepository#findAll}
     */
    public List<UserRole> findAll() {
        return userRoleRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserRoleRepository#save}
     */
    public UserRole save(UserRole entity) {
        return userRoleRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserRoleRepository#delete}
     */
    public void delete(UserRole entity) {
        userRoleRepository.delete(entity);

    }
}
