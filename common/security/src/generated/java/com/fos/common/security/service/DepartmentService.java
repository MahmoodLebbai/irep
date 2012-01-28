package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.Department;

/**
 * Generated interface for the Service DepartmentService.
 */
public interface DepartmentService {
    public static final String BEAN_ID = "departmentService";

    public Department findById(Long id);

    public List<Department> findAll();

    public Department save(Department entity);

    public void delete(Department entity);
}
