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

import com.fos.common.security.domain.CategoryDetail;
import com.fos.common.security.repository.CategoryDetailRepository;

/**
 * Repository implementation for CategoryDetail
 */
@Repository("categoryDetailRepository")
public class CategoryDetailRepositoryImpl extends JpaDaoSupport
    implements CategoryDetailRepository {
    private EntityManager entityManager;

    public CategoryDetailRepositoryImpl() {
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess}
     */
    public CategoryDetail findById(Long id) {
        FindByIdAccess<CategoryDetail, Long> ao = createFindByIdAccess();

        ao.setId(id);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess}
     */
    public List<CategoryDetail> findAll() {
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
    public CategoryDetail save(CategoryDetail entity) {
        SaveAccess<CategoryDetail> ao = createSaveAccess();

        ao.setEntity(entity);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess}
     */
    public void delete(CategoryDetail entity) {
        DeleteAccess<CategoryDetail> ao = createDeleteAccess();

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

    protected FindByIdAccess<CategoryDetail, Long> createFindByIdAccess() {
        JpaFindByIdAccessImpl<CategoryDetail, Long> ao =
            new JpaFindByIdAccessImpl<CategoryDetail, Long>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    // convenience method
    protected FindAllAccess2<CategoryDetail> createFindAllAccess() {
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

    protected SaveAccess<CategoryDetail> createSaveAccess() {
        JpaSaveAccessImpl<CategoryDetail> ao =
            new JpaSaveAccessImpl<CategoryDetail>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected DeleteAccess<CategoryDetail> createDeleteAccess() {
        JpaDeleteAccessImpl<CategoryDetail> ao =
            new JpaDeleteAccessImpl<CategoryDetail>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected Class<CategoryDetail> getPersistentClass() {
        return CategoryDetail.class;
    }
}
