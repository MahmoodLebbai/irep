package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.UserGroup;
import com.fos.common.security.repository.UserGroupRepository;
import com.fos.common.security.service.UserGroupService;

/**
* Implementation of UserGroupService.
*/
@Service("userGroupService")
public class UserGroupServiceImpl implements UserGroupService {
    @Autowired
    private UserGroupRepository userGroupRepository;

    public UserGroupServiceImpl() {
    }

    protected UserGroupRepository getUserGroupRepository() {
        return userGroupRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserGroupRepository#findById}
     */
    public UserGroup findById(Long id) {
        return userGroupRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserGroupRepository#findAll}
     */
    public List<UserGroup> findAll() {
        return userGroupRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserGroupRepository#save}
     */
    public UserGroup save(UserGroup entity) {
        return userGroupRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserGroupRepository#delete}
     */
    public void delete(UserGroup entity) {
        userGroupRepository.delete(entity);

    }
}
