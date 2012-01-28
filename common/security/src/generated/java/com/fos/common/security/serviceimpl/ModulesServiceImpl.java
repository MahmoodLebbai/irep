package com.fos.common.security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fos.common.security.domain.Modules;
import com.fos.common.security.repository.ModulesRepository;
import com.fos.common.security.service.ModulesService;

/**
* Implementation of ModulesService.
*/
@Service("modulesService")
public class ModulesServiceImpl implements ModulesService {
    @Autowired
    private ModulesRepository modulesRepository;

    public ModulesServiceImpl() {
    }

    protected ModulesRepository getModulesRepository() {
        return modulesRepository;
    }

    /**
     * Delegates to {@link com.fos.common.security.repository.ModulesRepository#findById}
     */
    public Modules findById(Long id) {
        return modulesRepository.findById(id);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.ModulesRepository#findAll}
     */
    public List<Modules> findAll() {
        return modulesRepository.findAll();

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.ModulesRepository#save}
     */
    public Modules save(Modules entity) {
        return modulesRepository.save(entity);

    }

    /**
     * Delegates to {@link com.fos.common.security.repository.ModulesRepository#delete}
     */
    public void delete(Modules entity) {
        modulesRepository.delete(entity);

    }
}
