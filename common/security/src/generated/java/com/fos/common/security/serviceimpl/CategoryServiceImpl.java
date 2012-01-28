package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.Category;
import com.fos.common.security.repository.CategoryRepository;
import com.fos.common.security.service.CategoryService;

/**
* Implementation of CategoryService.
*/
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl() {
    }

    protected CategoryRepository getCategoryRepository() {
        return categoryRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.CategoryRepository#findById}
     */
    public Category findById(Long id) {
        return categoryRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.CategoryRepository#findAll}
     */
    public List<Category> findAll() {
        return categoryRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.CategoryRepository#save}
     */
    public Category save(Category entity) {
        return categoryRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.CategoryRepository#delete}
     */
    public void delete(Category entity) {
        categoryRepository.delete(entity);

    }
}
