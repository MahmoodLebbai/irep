package com.fos.common.security.repositoryimpl;

import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria;
import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder;
import org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess;
import org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess2;
import org.fornax.cartridges.sculptor.framework.accessapi.FindByConditionAccess2;
import org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess;
import org.fornax.cartridges.sculptor.framework.accessapi.SaveAccess;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaDeleteAccessImpl;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaFindAllAccessImplGeneric;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaFindByConditionAccessImplGeneric;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaFindByIdAccessImpl;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaSaveAccessImpl;

import org.springframework.orm.jpa.support.JpaDaoSupport;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.fos.common.security.domain.Applications;
import com.fos.common.security.domain.ApplicationsProperties;
import com.fos.common.security.exception.SecurityException;
import com.fos.common.security.repository.ApplicationsRepository;

/**
 * Generated base class for implementation of Repository for Applications
 * <p>Make sure that subclass defines the following annotations:
 * <pre>
   @org.springframework.stereotype.Repository("applicationsRepository")
 * </pre>
 *
 */
public abstract class ApplicationsRepositoryBase extends JpaDaoSupport
    implements ApplicationsRepository {
    private EntityManager entityManager;

    public ApplicationsRepositoryBase() {
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess}
     */
    public Applications findById(Long id) {
        FindByIdAccess<Applications, Long> ao = createFindByIdAccess();

        ao.setId(id);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess}
     */
    public List<Applications> findAll() {
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
    public Applications save(Applications entity) {
        SaveAccess<Applications> ao = createSaveAccess();

        ao.setEntity(entity);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess}
     */
    public void delete(Applications entity) {
        DeleteAccess<Applications> ao = createDeleteAccess();

        ao.setEntity(entity);

        ao.execute();
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByConditionAccess}
     */
    protected Applications findByCondition(
        List<ConditionalCriteria> condition, boolean useSingleResult) {
        return findByCondition(condition, useSingleResult, getPersistentClass());
    }

    protected <R> R findByCondition(List<ConditionalCriteria> condition,
        boolean useSingleResult, Class<R> resultType) {
        FindByConditionAccess2<R> ao = createFindByConditionAccess(resultType);

        ao.setCondition(condition);
        ao.setUseSingleResult(useSingleResult);

        ao.execute();

        return ao.getSingleResult();

    }

    public Applications findApplicationByName(String applicationName)
        throws SecurityException {
        List<ConditionalCriteria> condition =
            ConditionalCriteriaBuilder.criteriaFor(Applications.class)
                                      .withProperty(ApplicationsProperties.applicationName())
                                      .eq(applicationName).build();

        Applications result =
            findByCondition(condition, true, Applications.class);

        return result;

    }

    public Applications findApplicationByCode(String applicationCode)
        throws SecurityException {
        List<ConditionalCriteria> condition =
            ConditionalCriteriaBuilder.criteriaFor(Applications.class)
                                      .withProperty(ApplicationsProperties.applicationCode())
                                      .eq(applicationCode).build();

        Applications result =
            findByCondition(condition, true, Applications.class);

        return result;

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

    protected FindByIdAccess<Applications, Long> createFindByIdAccess() {
        JpaFindByIdAccessImpl<Applications, Long> ao =
            new JpaFindByIdAccessImpl<Applications, Long>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    // convenience method
    protected FindAllAccess2<Applications> createFindAllAccess() {
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

    protected SaveAccess<Applications> createSaveAccess() {
        JpaSaveAccessImpl<Applications> ao =
            new JpaSaveAccessImpl<Applications>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected DeleteAccess<Applications> createDeleteAccess() {
        JpaDeleteAccessImpl<Applications> ao =
            new JpaDeleteAccessImpl<Applications>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    // convenience method
    protected FindByConditionAccess2<Applications> createFindByConditionAccess() {
        return createFindByConditionAccess(getPersistentClass(),
            getPersistentClass());
    }

    // convenience method
    protected <R> FindByConditionAccess2<R> createFindByConditionAccess(
        Class<R> resultType) {
        return createFindByConditionAccess(getPersistentClass(), resultType);
    }

    protected <T, R> FindByConditionAccess2<R> createFindByConditionAccess(
        Class<T> type, Class<R> resultType) {
        JpaFindByConditionAccessImplGeneric<T, R> ao =
            new JpaFindByConditionAccessImplGeneric<T, R>(type, resultType);

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected Class<Applications> getPersistentClass() {
        return Applications.class;
    }
}
