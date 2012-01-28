package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.Department;
import com.fos.common.security.repository.DepartmentRepository;
import com.fos.common.security.service.DepartmentService;

/**
* Implementation of DepartmentService.
*/
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl() {
    }

    protected DepartmentRepository getDepartmentRepository() {
        return departmentRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.DepartmentRepository#findById}
     */
    public Department findById(Long id) {
        return departmentRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.DepartmentRepository#findAll}
     */
    public List<Department> findAll() {
        return departmentRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.DepartmentRepository#save}
     */
    public Department save(Department entity) {
        return departmentRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.DepartmentRepository#delete}
     */
    public void delete(Department entity) {
        departmentRepository.delete(entity);

    }
}
