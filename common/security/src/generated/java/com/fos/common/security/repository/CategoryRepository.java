package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.Category;

/**
 * Generated interface for Repository for Category
 */
public interface CategoryRepository {
    public static final String BEAN_ID = "categoryRepository";

    public Category findById(Long id);

    public List<Category> findAll();

    public Category save(Category entity);

    public void delete(Category entity);
}
