package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.UserDelegation;

/**
 * Generated interface for the Service UserDelegationService.
 */
public interface UserDelegationService {
    public static final String BEAN_ID = "userDelegationService";

    public UserDelegation findById(Long id);

    public List<UserDelegation> findAll();

    public UserDelegation save(UserDelegation entity);

    public void delete(UserDelegation entity);
}
