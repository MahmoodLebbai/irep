package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.User;
import com.fos.common.security.repository.UserRepository;
import com.fos.common.security.service.UserService;

/**
* Implementation of UserService.
*/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl() {
    }

    protected UserRepository getUserRepository() {
        return userRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserRepository#getUserDetails}
     */
    public User getUserDetails(String userId, String password) {
        return userRepository.getUserDetails(userId, password);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserRepository#findUser}
     */
    public User findUser(String userId) {
        return userRepository.findUser(userId);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserRepository#findUserByEmail}
     */
    public User findUserByEmail(String emailId) {
        return userRepository.findUserByEmail(emailId);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserRepository#findById}
     */
    public User findById(Long id) {
        return userRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserRepository#findAll}
     */
    public List<User> findAll() {
        return userRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserRepository#save}
     */
    public User save(User entity) {
        return userRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.UserRepository#delete}
     */
    public void delete(User entity) {
        userRepository.delete(entity);

    }
}
