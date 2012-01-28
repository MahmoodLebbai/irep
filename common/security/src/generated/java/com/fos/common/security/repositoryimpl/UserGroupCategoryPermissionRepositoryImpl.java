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

import com.fos.common.security.domain.UserGroupCategoryPermission;
import com.fos.common.security.repository.UserGroupCategoryPermissionRepository;

/**
 * Repository implementation for UserGroupCategoryPermission
 */
@Repository("userGroupCategoryPermissionRepository")
public class UserGroupCategoryPermissionRepositoryImpl extends JpaDaoSupport
    implements UserGroupCategoryPermissionRepository {
    private EntityManager entityManager;

    public UserGroupCategoryPermissionRepositoryImpl() {
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess}
     */
    public UserGroupCategoryPermission findById(Long id) {
        FindByIdAccess<UserGroupCategoryPermission, Long> ao =
            createFindByIdAccess();

        ao.setId(id);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess}
     */
    public List<UserGroupCategoryPermission> findAll() {
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
    public UserGroupCategoryPermission save(UserGroupCategoryPermission entity) {
        SaveAccess<UserGroupCategoryPermission> ao = createSaveAccess();

        ao.setEntity(entity);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess}
     */
    public void delete(UserGroupCategoryPermission entity) {
        DeleteAccess<UserGroupCategoryPermission> ao = createDeleteAccess();

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

    protected FindByIdAccess<UserGroupCategoryPermission, Long> createFindByIdAccess() {
        JpaFindByIdAccessImpl<UserGroupCategoryPermission, Long> ao =
            new JpaFindByIdAccessImpl<UserGroupCategoryPermission, Long>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    // convenience method
    protected FindAllAccess2<UserGroupCategoryPermission> createFindAllAccess() {
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

    protected SaveAccess<UserGroupCategoryPermission> createSaveAccess() {
        JpaSaveAccessImpl<UserGroupCategoryPermission> ao =
            new JpaSaveAccessImpl<UserGroupCategoryPermission>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected DeleteAccess<UserGroupCategoryPermission> createDeleteAccess() {
        JpaDeleteAccessImpl<UserGroupCategoryPermission> ao =
            new JpaDeleteAccessImpl<UserGroupCategoryPermission>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected Class<UserGroupCategoryPermission> getPersistentClass() {
        return UserGroupCategoryPermission.class;
    }
}
