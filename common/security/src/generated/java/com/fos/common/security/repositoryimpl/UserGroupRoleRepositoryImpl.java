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

import com.fos.common.security.domain.UserGroupRole;
import com.fos.common.security.repository.UserGroupRoleRepository;

/**
 * Repository implementation for UserGroupRole
 */
@Repository("userGroupRoleRepository")
public class UserGroupRoleRepositoryImpl extends JpaDaoSupport
    implements UserGroupRoleRepository {
    private EntityManager entityManager;

    public UserGroupRoleRepositoryImpl() {
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess}
     */
    public UserGroupRole findById(Long id) {
        FindByIdAccess<UserGroupRole, Long> ao = createFindByIdAccess();

        ao.setId(id);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess}
     */
    public List<UserGroupRole> findAll() {
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
    public UserGroupRole save(UserGroupRole entity) {
        SaveAccess<UserGroupRole> ao = createSaveAccess();

        ao.setEntity(entity);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess}
     */
    public void delete(UserGroupRole entity) {
        DeleteAccess<UserGroupRole> ao = createDeleteAccess();

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

    protected FindByIdAccess<UserGroupRole, Long> createFindByIdAccess() {
        JpaFindByIdAccessImpl<UserGroupRole, Long> ao =
            new JpaFindByIdAccessImpl<UserGroupRole, Long>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    // convenience method
    protected FindAllAccess2<UserGroupRole> createFindAllAccess() {
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

    protected SaveAccess<UserGroupRole> createSaveAccess() {
        JpaSaveAccessImpl<UserGroupRole> ao =
            new JpaSaveAccessImpl<UserGroupRole>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected DeleteAccess<UserGroupRole> createDeleteAccess() {
        JpaDeleteAccessImpl<UserGroupRole> ao =
            new JpaDeleteAccessImpl<UserGroupRole>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected Class<UserGroupRole> getPersistentClass() {
        return UserGroupRole.class;
    }
}
