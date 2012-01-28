package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.UserDelegation;
import com.fos.common.security.repository.UserDelegationRepository;
import com.fos.common.security.service.UserDelegationService;

/**
* Implementation of UserDelegationService.
*/
@Service("userDelegationService")
public class UserDelegationServiceImpl implements UserDelegationService {
    @Autowired
    private UserDelegationRepository userDelegationRepository;

    public UserDelegationServiceImpl() {
    }

    protected UserDelegationRepository getUserDelegationRepository() {
        return userDelegationRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserDelegationRepository#findById}
     */
    public UserDelegation findById(Long id) {
        return userDelegationRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserDelegationRepository#findAll}
     */
    public List<UserDelegation> findAll() {
        return userDelegationRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserDelegationRepository#save}
     */
    public UserDelegation save(UserDelegation entity) {
        return userDelegationRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserDelegationRepository#delete}
     */
    public void delete(UserDelegation entity) {
        userDelegationRepository.delete(entity);

    }
}
