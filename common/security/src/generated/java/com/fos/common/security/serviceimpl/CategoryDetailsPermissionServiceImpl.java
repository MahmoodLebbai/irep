package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.CategoryDetailsPermission;
import com.fos.common.security.repository.CategoryDetailsPermissionRepository;
import com.fos.common.security.service.CategoryDetailsPermissionService;

/**
* Implementation of CategoryDetailsPermissionService.
*/
@Service("categoryDetailsPermissionService")
public class CategoryDetailsPermissionServiceImpl
    implements CategoryDetailsPermissionService {
    @Autowired
    private CategoryDetailsPermissionRepository categoryDetailsPermissionRepository;

    public CategoryDetailsPermissionServiceImpl() {
    }

    protected CategoryDetailsPermissionRepository getCategoryDetailsPermissionRepository() {
        return categoryDetailsPermissionRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.CategoryDetailsPermissionRepository#findById}
     */
    public CategoryDetailsPermission findById(Long id) {
        return categoryDetailsPermissionRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.CategoryDetailsPermissionRepository#findAll}
     */
    public List<CategoryDetailsPermission> findAll() {
        return categoryDetailsPermissionRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.CategoryDetailsPermissionRepository#save}
     */
    public CategoryDetailsPermission save(CategoryDetailsPermission entity) {
        return categoryDetailsPermissionRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.CategoryDetailsPermissionRepository#delete}
     */
    public void delete(CategoryDetailsPermission entity) {
        categoryDetailsPermissionRepository.delete(entity);

    }
}
