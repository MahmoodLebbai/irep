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

import com.fos.common.security.domain.UserGroup;
import com.fos.common.security.domain.UserGroupProperties;
import com.fos.common.security.exception.SecurityException;
import com.fos.common.security.repository.UserGroupRepository;

/**
 * Generated base class for implementation of Repository for UserGroup
 * <p>Make sure that subclass defines the following annotations:
 * <pre>
   @org.springframework.stereotype.Repository("userGroupRepository")
 * </pre>
 *
 */
public abstract class UserGroupRepositoryBase extends JpaDaoSupport
    implements UserGroupRepository {
    private EntityManager entityManager;

    public UserGroupRepositoryBase() {
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess}
     */
    public UserGroup findById(Long id) {
        FindByIdAccess<UserGroup, Long> ao = createFindByIdAccess();

        ao.setId(id);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess}
     */
    public List<UserGroup> findAll() {
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
    public UserGroup save(UserGroup entity) {
        SaveAccess<UserGroup> ao = createSaveAccess();

        ao.setEntity(entity);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess}
     */
    public void delete(UserGroup entity) {
        DeleteAccess<UserGroup> ao = createDeleteAccess();

        ao.setEntity(entity);

        ao.execute();
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByConditionAccess}
     */
    protected UserGroup findByCondition(List<ConditionalCriteria> condition,
        boolean useSingleResult) {
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

    public UserGroup findUserGroupByName(String userGroupName)
        throws SecurityException {
        List<ConditionalCriteria> condition =
            ConditionalCriteriaBuilder.criteriaFor(UserGroup.class)
                                      .withProperty(UserGroupProperties.userGroupName())
                                      .eq(userGroupName).build();

        UserGroup result = findByCondition(condition, true, UserGroup.class);

        return result;

    }

    public UserGroup findUserGroupByCode(String userGroupCode)
        throws SecurityException {
        List<ConditionalCriteria> condition =
            ConditionalCriteriaBuilder.criteriaFor(UserGroup.class)
                                      .withProperty(UserGroupProperties.userGroupCode())
                                      .eq(userGroupCode).build();

        UserGroup result = findByCondition(condition, true, UserGroup.class);

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

    protected FindByIdAccess<UserGroup, Long> createFindByIdAccess() {
        JpaFindByIdAccessImpl<UserGroup, Long> ao =
            new JpaFindByIdAccessImpl<UserGroup, Long>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    // convenience method
    protected FindAllAccess2<UserGroup> createFindAllAccess() {
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

    protected SaveAccess<UserGroup> createSaveAccess() {
        JpaSaveAccessImpl<UserGroup> ao =
            new JpaSaveAccessImpl<UserGroup>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected DeleteAccess<UserGroup> createDeleteAccess() {
        JpaDeleteAccessImpl<UserGroup> ao =
            new JpaDeleteAccessImpl<UserGroup>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    // convenience method
    protected FindByConditionAccess2<UserGroup> createFindByConditionAccess() {
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

    protected Class<UserGroup> getPersistentClass() {
        return UserGroup.class;
    }
}
