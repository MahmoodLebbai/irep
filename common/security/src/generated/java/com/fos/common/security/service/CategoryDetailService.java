package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.CategoryDetail;

/**
 * Generated interface for the Service CategoryDetailService.
 */
public interface CategoryDetailService {
    public static final String BEAN_ID = "categoryDetailService";

    public CategoryDetail findById(Long id);

    public List<CategoryDetail> findAll();

    public CategoryDetail save(CategoryDetail entity);

    public void delete(CategoryDetail entity);
}
