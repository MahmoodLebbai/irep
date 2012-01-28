package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.User;

/**
 * Generated interface for the Service UserService.
 */
public interface UserService {
    public static final String BEAN_ID = "userService";

    public User getUserDetails(String userId, String password);

    public User findUser(String userId);

    public User findUserByEmail(String emailId);

    public User findById(Long id);

    public List<User> findAll();

    public User save(User entity);

    public void delete(User entity);
}
