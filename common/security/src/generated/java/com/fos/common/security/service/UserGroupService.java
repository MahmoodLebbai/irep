package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.UserGroup;

/**
 * Generated interface for the Service UserGroupService.
 */
public interface UserGroupService {
    public static final String BEAN_ID = "userGroupService";

    public UserGroup findById(Long id);

    public List<UserGroup> findAll();

    public UserGroup save(UserGroup entity);

    public void delete(UserGroup entity);
}
