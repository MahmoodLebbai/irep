package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.Operation;

/**
 * Generated interface for Repository for Operation
 */
public interface OperationRepository {
    public static final String BEAN_ID = "operationRepository";

    public Operation findById(Long id);

    public List<Operation> findAll();

    public Operation save(Operation entity);

    public void delete(Operation entity);
}
