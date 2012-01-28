package com.fos.common.security.repositoryimpl;

import org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess;
import org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess2;
import org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess;
import org.fornax.cartridges.sculptor.framework.accessapi.SaveAccess;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaDeleteAccessImpl;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaFindAllAccessImplGeneric;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaFindByIdAccessImpl;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaSaveAccessImpl;

import org.springframework.orm.jpa.support.JpaDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.fos.common.security.domain.Operation;
import com.fos.common.security.repository.OperationRepository;

/**
 * Repository implementation for Operation
 */
@Repository("operationRepository")
public class OperationRepositoryImpl extends JpaDaoSupport
    implements OperationRepository {
    private EntityManager entityManager;

    public OperationRepositoryImpl() {
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess}
     */
    public Operation findById(Long id) {
        FindByIdAccess<Operation, Long> ao = createFindByIdAccess();

        ao.setId(id);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess}
     */
    public List<Operation> findAll() {
        return findAll(getPersistentClass());
    }

    public <R> List<R> findAll(Class<R> resultType) {
        FindAllAccess2<R> ao = createFindAllAccess(resultType);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.SaveAccess}
     */
    public Operation save(Operation entity) {
        SaveAccess<Operation> ao = createSaveAccess();

        ao.setEntity(entity);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess}
     */
    public void delete(Operation entity) {
        DeleteAccess<Operation> ao = createDeleteAccess();

        ao.setEntity(entity);

        ao.execute();
    }

    /**
     * Dependency injection
     */
    @PersistenceContext(unitName = "SecurityPartEntityManagerFactory")
    protected void setEntityManagerDependency(EntityManager entityManager) {
        this.entityManager = entityManager;
        // for JpaDaoSupport, JpaTemplate
        setEntityManager(entityManager);
    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    protected FindByIdAccess<Operation, Long> createFindByIdAccess() {
        JpaFindByIdAccessImpl<Operation, Long> ao =
            new JpaFindByIdAccessImpl<Operation, Long>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    // convenience method
    protected FindAllAccess2<Operation> createFindAllAccess() {
        return createFindAllAccess(getPersistentClass(), getPersistentClass());
    }

    // convenience method
    protected <R> FindAllAccess2<R> createFindAllAccess(Class<R> resultType) {
        return createFindAllAccess(getPersistentClass(), resultType);
    }

    protected <T, R> FindAllAccess2<R> createFindAllAccess(Class<T> type,
        Class<R> resultType) {
        JpaFindAllAccessImplGeneric<T, R> ao =
            new JpaFindAllAccessImplGeneric<T, R>(type, resultType);

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected SaveAccess<Operation> createSaveAccess() {
        JpaSaveAccessImpl<Operation> ao =
            new JpaSaveAccessImpl<Operation>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected DeleteAccess<Operation> createDeleteAccess() {
        JpaDeleteAccessImpl<Operation> ao =
            new JpaDeleteAccessImpl<Operation>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected Class<Operation> getPersistentClass() {
        return Operation.class;
    }
}
