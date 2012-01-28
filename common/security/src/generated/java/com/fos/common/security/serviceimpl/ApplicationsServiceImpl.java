package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.Applications;
import com.fos.common.security.repository.ApplicationsRepository;
import com.fos.common.security.service.ApplicationsService;

/**
* Implementation of ApplicationsService.
*/
@Service("applicationsService")
public class ApplicationsServiceImpl implements ApplicationsService {
    @Autowired
    private ApplicationsRepository applicationsRepository;

    public ApplicationsServiceImpl() {
    }

    protected ApplicationsRepository getApplicationsRepository() {
        return applicationsRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.ApplicationsRepository#findById}
     */
    public Applications findById(Long id) {
        return applicationsRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.ApplicationsRepository#findAll}
     */
    public List<Applications> findAll() {
        return applicationsRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.ApplicationsRepository#save}
     */
    public Applications save(Applications entity) {
        return applicationsRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.ApplicationsRepository#delete}
     */
    public void delete(Applications entity) {
        applicationsRepository.delete(entity);

    }
}
