package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.CategoryDetail;

/**
 * Generated interface for Repository for CategoryDetail
 */
public interface CategoryDetailRepository {
    public static final String BEAN_ID = "categoryDetailRepository";

    public CategoryDetail findById(Long id);

    public List<CategoryDetail> findAll();

    public CategoryDetail save(CategoryDetail entity);

    public void delete(CategoryDetail entity);
}
