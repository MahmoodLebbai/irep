package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.Applications;

/**
 * Generated interface for the Service ApplicationsService.
 */
public interface ApplicationsService {
    public static final String BEAN_ID = "applicationsService";

    public Applications findById(Long id);

    public List<Applications> findAll();

    public Applications save(Applications entity);

    public void delete(Applications entity);
}
