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

import com.fos.common.security.domain.CategoryDetailsPermission;
import com.fos.common.security.repository.CategoryDetailsPermissionRepository;

/**
 * Repository implementation for CategoryDetailsPermission
 */
@Repository("categoryDetailsPermissionRepository")
public class CategoryDetailsPermissionRepositoryImpl extends JpaDaoSupport
    implements CategoryDetailsPermissionRepository {
    private EntityManager entityManager;

    public CategoryDetailsPermissionRepositoryImpl() {
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess}
     */
    public CategoryDetailsPermission findById(Long id) {
        FindByIdAccess<CategoryDetailsPermission, Long> ao =
            createFindByIdAccess();

        ao.setId(id);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess}
     */
    public List<CategoryDetailsPermission> findAll() {
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
    public CategoryDetailsPermission save(CategoryDetailsPermission entity) {
        SaveAccess<CategoryDetailsPermission> ao = createSaveAccess();

        ao.setEntity(entity);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess}
     */
    public void delete(CategoryDetailsPermission entity) {
        DeleteAccess<CategoryDetailsPermission> ao = createDeleteAccess();

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

    protected FindByIdAccess<CategoryDetailsPermission, Long> createFindByIdAccess() {
        JpaFindByIdAccessImpl<CategoryDetailsPermission, Long> ao =
            new JpaFindByIdAccessImpl<CategoryDetailsPermission, Long>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    // convenience method
    protected FindAllAccess2<CategoryDetailsPermission> createFindAllAccess() {
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

    protected SaveAccess<CategoryDetailsPermission> createSaveAccess() {
        JpaSaveAccessImpl<CategoryDetailsPermission> ao =
            new JpaSaveAccessImpl<CategoryDetailsPermission>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected DeleteAccess<CategoryDetailsPermission> createDeleteAccess() {
        JpaDeleteAccessImpl<CategoryDetailsPermission> ao =
            new JpaDeleteAccessImpl<CategoryDetailsPermission>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected Class<CategoryDetailsPermission> getPersistentClass() {
        return CategoryDetailsPermission.class;
    }
}
