package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.UserGroup;

/**
 * Generated interface for Repository for UserGroup
 */
public interface UserGroupRepository {
    public static final String BEAN_ID = "userGroupRepository";

    public UserGroup findUserGroupByName(String userGroupName)
        throws com.fos.common.security.exception.SecurityException;

    public UserGroup findUserGroupByCode(String userGroupCode)
        throws com.fos.common.security.exception.SecurityException;

    public UserGroup findById(Long id);

    public List<UserGroup> findAll();

    public UserGroup save(UserGroup entity);

    public void delete(UserGroup entity);
}
