package com.fos.common.security.domain;

import org.apache.commons.lang.Validate;

import org.fornax.cartridges.sculptor.framework.domain.AbstractDomainObject;
import org.fornax.cartridges.sculptor.framework.domain.Auditable;
import org.fornax.cartridges.sculptor.framework.domain.Identifiable;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

/**
* Entity representing Modules.
*/
@Entity
@Table(name = "MODULE")
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class Modules extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = false, length = 20, unique = true)
    @NotNull
    @Length(max = 20)
    private String moduleCode;
    @Column(name = "NAME", nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private String moduleName;
    @Column(name = "DESC", length = 100)
    @Length(max = 100)
    private String moduleDesc;
    @Column(name = "ACTIVE", nullable = false)
    private boolean moduleStatus;
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
    @ManyToOne(optional = false)
    @NotNull
    private Applications application;
    @OneToMany(cascade = CascadeType.ALL)
    @ForeignKey(name = "FK_MODULE_ID_OPERATION_MODULE_ID", inverseName = "FK_MODULE_ID_OPERATION_OPERATION")
    @NotNull
    private List<Operation> operations = new ArrayList<Operation>();

    protected Modules() {
    }

    public Modules(String moduleCode) {
        super();
        Validate.notNull(moduleCode, "Modules.moduleCode must not be null");
        this.moduleCode = moduleCode;
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

    public String getModuleCode() {
        return moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleDesc() {
        return moduleDesc;
    }

    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc;
    }

    public boolean isModuleStatus() {
        return moduleStatus;
    }

    public void setModuleStatus(boolean moduleStatus) {
        this.moduleStatus = moduleStatus;
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

    public Applications getApplication() {
        return application;
    }

    public void setApplication(Applications application) {
        this.application = application;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getOperations}
     * at this side and the association
     * {@link com.fos.common.security.domain.Operation#setModule}
     * at the opposite side is set.
     */
    public void addOperation(Operation operationElement) {
        getOperations().add(operationElement);
        operationElement.setModule((Modules) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getOperations}
     * at this side and the association
     * {@link com.fos.common.security.domain.Operation#setModule}
     * at the opposite side is cleared (nulled).
     */
    public void removeOperation(Operation operationElement) {
        getOperations().remove(operationElement);

        operationElement.setModule(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getOperations}
     * at this side and the association
     * {@link com.fos.common.security.domain.Operation#setModule}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllOperations() {
        for (Operation d : getOperations()) {
            d.setModule(null);
        }

        getOperations().clear();

    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getModuleCode}
     */
    public Object getKey() {
        return getModuleCode();
    }

    // This comment was generated from SpecialCases.xpt 
}
