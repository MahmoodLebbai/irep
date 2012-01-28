package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.UserDelegation;

/**
 * Generated interface for Repository for UserDelegation
 */
public interface UserDelegationRepository {
    public static final String BEAN_ID = "userDelegationRepository";

    public UserDelegation findById(Long id);

    public List<UserDelegation> findAll();

    public UserDelegation save(UserDelegation entity);

    public void delete(UserDelegation entity);
}
