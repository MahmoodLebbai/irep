package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.Operation;

/**
 * Generated interface for the Service OperationService.
 */
public interface OperationService {
    public static final String BEAN_ID = "operationService";

    public Operation findById(Long id);

    public List<Operation> findAll();

    public Operation save(Operation entity);

    public void delete(Operation entity);
}
