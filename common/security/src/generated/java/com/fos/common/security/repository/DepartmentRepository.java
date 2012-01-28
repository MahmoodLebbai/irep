package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.Department;

/**
 * Generated interface for Repository for Department
 */
public interface DepartmentRepository {
    public static final String BEAN_ID = "departmentRepository";

    public Department findById(Long id);

    public List<Department> findAll();

    public Department save(Department entity);

    public void delete(Department entity);
}
