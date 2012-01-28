package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.Applications;

/**
 * Generated interface for Repository for Applications
 */
public interface ApplicationsRepository {
    public static final String BEAN_ID = "applicationsRepository";

    public Applications findApplicationByName(String applicationName)
        throws com.fos.common.security.exception.SecurityException;

    public Applications findApplicationByCode(String applicationCode)
        throws com.fos.common.security.exception.SecurityException;

    public Applications findById(Long id);

    public List<Applications> findAll();

    public Applications save(Applications entity);

    public void delete(Applications entity);
}
