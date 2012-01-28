package com.fos.common.security.domain;

import org.apache.commons.lang.Validate;

import org.fornax.cartridges.sculptor.framework.domain.AbstractDomainObject;
import org.fornax.cartridges.sculptor.framework.domain.Auditable;
import org.fornax.cartridges.sculptor.framework.domain.Identifiable;
import org.fornax.cartridges.sculptor.framework.util.EqualsHelper;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

/**
* Entity representing Applications.
*/
@Entity
@Table(name = "APPLICATION", uniqueConstraints = @UniqueConstraint(columnNames =  {
    "CODE", "NAME"}
)
)
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class Applications extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = false, length = 20)
    @NotNull
    @Length(max = 20)
    private String applicationCode;
    @Column(name = "NAME", nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private String applicationName;
    @Column(name = "DESC", length = 100)
    @Length(max = 100)
    private String applicationDesc;
    @Column(name = "ACTIVE", nullable = false)
    private boolean applicationStatus;
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
    @OneToMany(cascade = CascadeType.ALL)
    @ForeignKey(name = "FK_APP_ID_MODULE_APP_ID", inverseName = "FK_APP_ID_MODULE_MODULE")
    @NotNull
    private List<Modules> modules = new ArrayList<Modules>();
    @Transient
    private transient ApplicationsKey cachedApplicationsKey;

    protected Applications() {
    }

    public Applications(String applicationCode, String applicationName) {
        super();
        Validate.notNull(applicationCode,
            "Applications.applicationCode must not be null");
        this.applicationCode = applicationCode;
        Validate.notNull(applicationName,
            "Applications.applicationName must not be null");
        this.applicationName = applicationName;
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

    public String getApplicationCode() {
        return applicationCode;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getApplicationDesc() {
        return applicationDesc;
    }

    public void setApplicationDesc(String applicationDesc) {
        this.applicationDesc = applicationDesc;
    }

    public boolean isApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(boolean applicationStatus) {
        this.applicationStatus = applicationStatus;
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

    public List<Modules> getModules() {
        return modules;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getModules}
     * at this side and the association
     * {@link com.fos.common.security.domain.Modules#setApplication}
     * at the opposite side is set.
     */
    public void addModule(Modules moduleElement) {
        getModules().add(moduleElement);
        moduleElement.setApplication((Applications) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getModules}
     * at this side and the association
     * {@link com.fos.common.security.domain.Modules#setApplication}
     * at the opposite side is cleared (nulled).
     */
    public void removeModule(Modules moduleElement) {
        getModules().remove(moduleElement);

        moduleElement.setApplication(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getModules}
     * at this side and the association
     * {@link com.fos.common.security.domain.Modules#setApplication}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllModules() {
        for (Modules d : getModules()) {
            d.setApplication(null);
        }

        getModules().clear();

    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getApplicationsKey}
     */
    public Object getKey() {
        return getApplicationsKey();
    }

    /**
     * The natural key for the domain object is
     * a composite key consisting of several attributes.
     */
    public ApplicationsKey getApplicationsKey() {
        if (cachedApplicationsKey == null) {
            cachedApplicationsKey = new ApplicationsKey(getApplicationCode(),
                    getApplicationName());
        }
        return cachedApplicationsKey;
    }

    /**
     * This is the natural key for the domain object.
     * It is a composite key consisting of several
     * attributes.
     */
    public static class ApplicationsKey {
        private String applicationCode;
        private String applicationName;

        public ApplicationsKey(String applicationCode, String applicationName) {
            this.applicationCode = applicationCode;
            this.applicationName = applicationName;

        }

        public String getApplicationCode() {
            return applicationCode;
        }

        public String getApplicationName() {
            return applicationName;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplicationsKey)) {
                return false;
            }

            ApplicationsKey other = (ApplicationsKey) obj;

            if (!EqualsHelper.equals(getApplicationCode(),
                      other.getApplicationCode())) {
                return false;
            }
            if (!EqualsHelper.equals(getApplicationName(),
                      other.getApplicationName())) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 37 * result +
                EqualsHelper.computeHashCode(getApplicationCode());
            result = 37 * result +
                EqualsHelper.computeHashCode(getApplicationName());
            return result;
        }
    }

    // This comment was generated from SpecialCases.xpt 
}
