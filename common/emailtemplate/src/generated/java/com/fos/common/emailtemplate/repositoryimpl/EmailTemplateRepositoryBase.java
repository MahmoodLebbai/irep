package com.fos.common.emailtemplate.repositoryimpl;

import org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess;
import org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess2;
import org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess;
import org.fornax.cartridges.sculptor.framework.accessapi.SaveAccess;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaDeleteAccessImpl;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaFindAllAccessImplGeneric;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaFindByIdAccessImpl;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpa2.JpaSaveAccessImpl;

import org.springframework.orm.jpa.support.JpaDaoSupport;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.fos.common.emailtemplate.domain.EmailTemplate;
import com.fos.common.emailtemplate.repository.EmailTemplateRepository;

/**
 * Generated base class for implementation of Repository for EmailTemplate
 * <p>Make sure that subclass defines the following annotations:
 * <pre>
   @org.springframework.stereotype.Repository("emailTemplateRepository")
 * </pre>
 *
 */
public abstract class EmailTemplateRepositoryBase extends JpaDaoSupport
    implements EmailTemplateRepository {
    private EntityManager entityManager;

    public EmailTemplateRepositoryBase() {
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByIdAccess}
     */
    public EmailTemplate findById(Long id) {
        FindByIdAccess<EmailTemplate, Long> ao = createFindByIdAccess();

        ao.setId(id);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindAllAccess}
     */
    public List<EmailTemplate> findAll() {
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
    public EmailTemplate save(EmailTemplate entity) {
        SaveAccess<EmailTemplate> ao = createSaveAccess();

        ao.setEntity(entity);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.DeleteAccess}
     */
    public void delete(EmailTemplate entity) {
        DeleteAccess<EmailTemplate> ao = createDeleteAccess();

        ao.setEntity(entity);

        ao.execute();
    }

    public abstract List<EmailTemplate> getEmailTemplate(String countryCode,
        String languageCode, String templateId)
        throws com.fos.common.emailtemplate.exception.EmailTemplateNotFoundException;

    /**
     * Dependency injection
     */
    @PersistenceContext(unitName = "EmailTemplateAppEntityManagerFactory")
    protected void setEntityManagerDependency(EntityManager entityManager) {
        this.entityManager = entityManager;
        // for JpaDaoSupport, JpaTemplate
        setEntityManager(entityManager);
    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    protected FindByIdAccess<EmailTemplate, Long> createFindByIdAccess() {
        JpaFindByIdAccessImpl<EmailTemplate, Long> ao =
            new JpaFindByIdAccessImpl<EmailTemplate, Long>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    // convenience method
    protected FindAllAccess2<EmailTemplate> createFindAllAccess() {
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

    protected SaveAccess<EmailTemplate> createSaveAccess() {
        JpaSaveAccessImpl<EmailTemplate> ao =
            new JpaSaveAccessImpl<EmailTemplate>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected DeleteAccess<EmailTemplate> createDeleteAccess() {
        JpaDeleteAccessImpl<EmailTemplate> ao =
            new JpaDeleteAccessImpl<EmailTemplate>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected Class<EmailTemplate> getPersistentClass() {
        return EmailTemplate.class;
    }
}
