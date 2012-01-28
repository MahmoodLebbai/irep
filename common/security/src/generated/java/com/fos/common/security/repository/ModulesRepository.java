package com.fos.common.security.repository;

import java.util.List;

import com.fos.common.security.domain.Modules;

/**
 * Generated interface for Repository for Modules
 */
public interface ModulesRepository {
    public static final String BEAN_ID = "modulesRepository";

    public Modules findById(Long id);

    public List<Modules> findAll();

    public Modules save(Modules entity);

    public void delete(Modules entity);
}
