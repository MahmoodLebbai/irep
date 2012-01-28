package com.fos.common.emailtemplate.domain;

import org.fornax.cartridges.sculptor.framework.domain.AbstractDomainObject;
import org.fornax.cartridges.sculptor.framework.domain.Auditable;
import org.fornax.cartridges.sculptor.framework.domain.Identifiable;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.validator.constraints.Length;

import java.lang.reflect.Field;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

/**
* Entity representing EmailTemplate.
*/
@Entity
@Table(name = "EMAIL_TEMPLATE", uniqueConstraints = @UniqueConstraint(columnNames =  {
    "EMAILTEMPLATEKEY_COUNTRY_CODE", "EMAILTEMPLATEKEY_LANG_CODE", "EMAILTEMPLATEKEY_TEMPLATE_ID"}
)
)
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class EmailTemplate extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "TEMPLATE_FILE_PATH", nullable = false, length = 100)
    @NotNull
    @Length(max = 100)
    private String ftlFilePath;
    @Column(name = "ACTIVE_FLAG", nullable = false)
    @NotNull
    private Boolean status;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "CREATEDDATE")
    private Date createdDate;
    @Column(name = "CREATEDBY", length = 50)
    private String createdBy;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "LASTUPDATED")
    private Date lastUpdated;
    @Column(name = "LASTUPDATEDBY", length = 50)
    private String lastUpdatedBy;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;
    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "country_code",column = @Column(name = "EMAILTEMPLATEKEY_COUNTRY_CODE",nullable = false,length = 2)
        )
        , @AttributeOverride(name = "lang_code",column = @Column(name = "EMAILTEMPLATEKEY_LANG_CODE",nullable = false,length = 2)
        )
        , @AttributeOverride(name = "template_id",column = @Column(name = "EMAILTEMPLATEKEY_TEMPLATE_ID",nullable = false,length = 50)
        )
    })
    @NotNull
    private EmailTemplateKey emailTemplateKey;

    protected EmailTemplate() {
    }

    public EmailTemplate(EmailTemplateKey emailTemplateKey) {
        super();
        this.emailTemplateKey = emailTemplateKey;
    }

    public Long getId() {
        return id;
    }

    /**
     * The id is not intended to be changed or assigned manually, but
     * for test purpose it is allowed to assign the id.
     */
    protected void setId(Long id) {
        if ((this.id != null) && !this.id.equals(id)) {
            throw new IllegalArgumentException(
                "Not allowed to change the id property.");
        }
        this.id = id;
    }

    public String getFtlFilePath() {
        return ftlFilePath;
    }

    public void setFtlFilePath(String ftlFilePath) {
        this.ftlFilePath = ftlFilePath;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public EmailTemplateKey getEmailTemplateKey() {
        return emailTemplateKey;
    }

    /**
     * This method is used by toString. It specifies what to
     * include in the toString result.
     * @return true if the field is to be included in toString
     */
    protected boolean acceptToString(Field field) {
        if (super.acceptToString(field)) {
            return true;
        } else {
            if (field.getName().equals("emailTemplateKey")) {
                return true;
            }
            return false;
        }
    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getEmailTemplateKey}
     */
    public Object getKey() {
        return getEmailTemplateKey();
    }

    // This comment was generated from SpecialCases.xpt 
}
