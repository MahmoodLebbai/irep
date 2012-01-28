package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.Permission;
import com.fos.common.security.repository.PermissionRepository;
import com.fos.common.security.service.PermissionService;

/**
* Implementation of PermissionService.
*/
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionRepository permissionRepository;

    public PermissionServiceImpl() {
    }

    protected PermissionRepository getPermissionRepository() {
        return permissionRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.PermissionRepository#findById}
     */
    public Permission findById(Long id) {
        return permissionRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.PermissionRepository#findAll}
     */
    public List<Permission> findAll() {
        return permissionRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.PermissionRepository#save}
     */
    public Permission save(Permission entity) {
        return permissionRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.PermissionRepository#delete}
     */
    public void delete(Permission entity) {
        permissionRepository.delete(entity);

    }
}
