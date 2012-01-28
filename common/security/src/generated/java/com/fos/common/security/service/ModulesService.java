package com.fos.common.security.service;

import java.util.List;

import com.fos.common.security.domain.Modules;

/**
 * Generated interface for the Service ModulesService.
 */
public interface ModulesService {
    public static final String BEAN_ID = "modulesService";

    public Modules findById(Long id);

    public List<Modules> findAll();

    public Modules save(Modules entity);

    public void delete(Modules entity);
}
