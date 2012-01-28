package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.RolePermission;
import com.fos.common.security.repository.RolePermissionRepository;
import com.fos.common.security.service.RolePermissionService;

/**
* Implementation of RolePermissionService.
*/
@Service("rolePermissionService")
public class RolePermissionServiceImpl implements RolePermissionService {
    @Autowired
    private RolePermissionRepository rolePermissionRepository;

    public RolePermissionServiceImpl() {
    }

    protected RolePermissionRepository getRolePermissionRepository() {
        return rolePermissionRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.RolePermissionRepository#findById}
     */
    public RolePermission findById(Long id) {
        return rolePermissionRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.RolePermissionRepository#findAll}
     */
    public List<RolePermission> findAll() {
        return rolePermissionRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.RolePermissionRepository#save}
     */
    public RolePermission save(RolePermission entity) {
        return rolePermissionRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.RolePermissionRepository#delete}
     */
    public void delete(RolePermission entity) {
        rolePermissionRepository.delete(entity);

    }
}
