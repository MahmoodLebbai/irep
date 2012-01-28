package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.Operation;
import com.fos.common.security.repository.OperationRepository;
import com.fos.common.security.service.OperationService;

/**
* Implementation of OperationService.
*/
@Service("operationService")
public class OperationServiceImpl implements OperationService {
    @Autowired
    private OperationRepository operationRepository;

    public OperationServiceImpl() {
    }

    protected OperationRepository getOperationRepository() {
        return operationRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.OperationRepository#findById}
     */
    public Operation findById(Long id) {
        return operationRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.OperationRepository#findAll}
     */
    public List<Operation> findAll() {
        return operationRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.OperationRepository#save}
     */
    public Operation save(Operation entity) {
        return operationRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.OperationRepository#delete}
     */
    public void delete(Operation entity) {
        operationRepository.delete(entity);

    }
}
