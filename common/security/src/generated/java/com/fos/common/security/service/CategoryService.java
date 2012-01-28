package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.Category;

/**
 * Generated interface for the Service CategoryService.
 */
public interface CategoryService {
    public static final String BEAN_ID = "categoryService";

    public Category findById(Long id);

    public List<Category> findAll();

    public Category save(Category entity);

    public void delete(Category entity);
}
