package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.Role;
import com.fos.common.security.repository.RoleRepository;
import com.fos.common.security.service.RoleService;

/**
* Implementation of RoleService.
*/
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public RoleServiceImpl() {
    }

    protected RoleRepository getRoleRepository() {
        return roleRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.RoleRepository#findById}
     */
    public Role findById(Long id) {
        return roleRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.RoleRepository#findAll}
     */
    public List<Role> findAll() {
        return roleRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.RoleRepository#save}
     */
    public Role save(Role entity) {
        return roleRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.RoleRepository#delete}
     */
    public void delete(Role entity) {
        roleRepository.delete(entity);

    }
}
