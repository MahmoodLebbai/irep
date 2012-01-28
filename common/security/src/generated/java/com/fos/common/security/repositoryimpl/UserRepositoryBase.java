package com.fos.common.security.repositoryimpl;

import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria;
import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder;
import org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess;
import org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess2;
import org.fornax.cartridges.sculptor.framework.accessapi.FindByConditionAccess2;
import org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess;
import org.fornax.cartridges.sculptor.framework.accessapi.FindByQueryAccess2;
import org.fornax.cartridges.sculptor.framework.accessapi.SaveAccess;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaDeleteAccessImpl;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaFindAllAccessImplGeneric;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaFindByConditionAccessImplGeneric;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaFindByIdAccessImpl;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaFindByQueryAccessImplGeneric;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaSaveAccessImpl;

import org.springframework.orm.jpa.support.JpaDaoSupport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.fos.common.security.domain.User;
import com.fos.common.security.domain.UserProperties;
import com.fos.common.security.repository.UserRepository;

/**
 * Generated base class for implementation of Repository for User
 * <p>Make sure that subclass defines the following annotations:
 * <pre>
   @org.springframework.stereotype.Repository("userRepository")
 * </pre>
 *
 */
public abstract class UserRepositoryBase extends JpaDaoSupport
    implements UserRepository {
    private EntityManager entityManager;

    public UserRepositoryBase() {
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess}
     */
    public User findById(Long id) {
        FindByIdAccess<User, Long> ao = createFindByIdAccess();

        ao.setId(id);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess}
     */
    public List<User> findAll() {
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
    public User save(User entity) {
        SaveAccess<User> ao = createSaveAccess();

        ao.setEntity(entity);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess}
     */
    public void delete(User entity) {
        DeleteAccess<User> ao = createDeleteAccess();

        ao.setEntity(entity);

        ao.execute();
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByConditionAccess}
     */
    protected User findByCondition(List<ConditionalCriteria> condition,
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

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByQueryAccess}
     */
    protected Object findByQuery(String query, Map<String, Object> parameters,
        boolean useSingleResult) {
        return findByQuery(query, parameters, useSingleResult,
            getPersistentClass());
    }

    protected <R> R findByQuery(String query, Map<String, Object> parameters,
        boolean useSingleResult, Class<R> resultType) {
        FindByQueryAccess2<R> ao = createFindByQueryAccess(resultType);

        ao.setQuery(query);
        ao.setParameters(parameters);
        ao.setUseSingleResult(useSingleResult);

        ao.execute();

        return ao.getSingleResult();

    }

    public User getUserDetails(String userId, String password) {
        List<ConditionalCriteria> condition =
            ConditionalCriteriaBuilder.criteriaFor(User.class)
                                      .withProperty(UserProperties.userId())
                                      .eq(userId).and()
                                      .withProperty(UserProperties.password())
                                      .eq(password).build();

        User result = findByCondition(condition, true, User.class);

        return result;

    }

    public User findUser(String userId) {
        List<ConditionalCriteria> condition =
            ConditionalCriteriaBuilder.criteriaFor(User.class)
                                      .withProperty(UserProperties.userId())
                                      .eq(userId).build();

        User result = findByCondition(condition, true, User.class);

        return result;

    }

    public User findUserByEmail(String emailId) {
        Map<String, Object> parameters = new HashMap<String, Object>();

        parameters.put("emailId", emailId);

        User result =
            findByQuery("select user from User user inner join user.emails email where user.userId = email.user.userId and email.emailId = :emailId",
                parameters, true, User.class);

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

    protected FindByIdAccess<User, Long> createFindByIdAccess() {
        JpaFindByIdAccessImpl<User, Long> ao =
            new JpaFindByIdAccessImpl<User, Long>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    // convenience method
    protected FindAllAccess2<User> createFindAllAccess() {
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

    protected SaveAccess<User> createSaveAccess() {
        JpaSaveAccessImpl<User> ao =
            new JpaSaveAccessImpl<User>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected DeleteAccess<User> createDeleteAccess() {
        JpaDeleteAccessImpl<User> ao =
            new JpaDeleteAccessImpl<User>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    // convenience method
    protected FindByConditionAccess2<User> createFindByConditionAccess() {
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

    // convenience method
    protected FindByQueryAccess2<User> createFindByQueryAccess() {
        return createFindByQueryAccess(getPersistentClass(),
            getPersistentClass());
    }

    // convenience method
    protected <R> FindByQueryAccess2<R> createFindByQueryAccess(
        Class<R> resultType) {
        return createFindByQueryAccess(getPersistentClass(), resultType);
    }

    protected <T, R> FindByQueryAccess2<R> createFindByQueryAccess(
        Class<T> type, Class<R> resultType) {
        JpaFindByQueryAccessImplGeneric<T, R> ao =
            new JpaFindByQueryAccessImplGeneric<T, R>(type, resultType);

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected Class<User> getPersistentClass() {
        return User.class;
    }
}
