package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.CategoryDetail;
import com.fos.common.security.repository.CategoryDetailRepository;
import com.fos.common.security.service.CategoryDetailService;

/**
* Implementation of CategoryDetailService.
*/
@Service("categoryDetailService")
public class CategoryDetailServiceImpl implements CategoryDetailService {
    @Autowired
    private CategoryDetailRepository categoryDetailRepository;

    public CategoryDetailServiceImpl() {
    }

    protected CategoryDetailRepository getCategoryDetailRepository() {
        return categoryDetailRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.CategoryDetailRepository#findById}
     */
    public CategoryDetail findById(Long id) {
        return categoryDetailRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.CategoryDetailRepository#findAll}
     */
    public List<CategoryDetail> findAll() {
        return categoryDetailRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.CategoryDetailRepository#save}
     */
    public CategoryDetail save(CategoryDetail entity) {
        return categoryDetailRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.CategoryDetailRepository#delete}
     */
    public void delete(CategoryDetail entity) {
        categoryDetailRepository.delete(entity);

    }
}
