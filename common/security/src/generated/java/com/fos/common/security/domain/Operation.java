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
* Entity representing Operation.
*/
@Entity
@Table(name = "OPERATION")
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class Operation extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = false, length = 20, unique = true)
    @NotNull
    @Length(max = 20)
    private String functionCode;
    @Column(name = "NAME", nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private String functionName;
    @Column(name = "DESC", length = 100)
    @Length(max = 100)
    private String functionDesc;
    @Column(name = "ACTIVE", nullable = false)
    private boolean functionStatus;
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
    private Modules module;
    @OneToMany(cascade = CascadeType.ALL)
    @ForeignKey(name = "FK_OPERATION_PERMISSION_OPERATION", inverseName = "FK_OPERATION_PERMISSION_PERMISSION")
    @NotNull
    private List<Permission> permissions = new ArrayList<Permission>();

    protected Operation() {
    }

    public Operation(String functionCode) {
        super();
        Validate.notNull(functionCode, "Operation.functionCode must not be null");
        this.functionCode = functionCode;
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

    public String getFunctionCode() {
        return functionCode;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionDesc() {
        return functionDesc;
    }

    public void setFunctionDesc(String functionDesc) {
        this.functionDesc = functionDesc;
    }

    public boolean isFunctionStatus() {
        return functionStatus;
    }

    public void setFunctionStatus(boolean functionStatus) {
        this.functionStatus = functionStatus;
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

    public Modules getModule() {
        return module;
    }

    public void setModule(Modules module) {
        this.module = module;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.Permission#setOperation}
     * at the opposite side is set.
     */
    public void addPermission(Permission permissionElement) {
        getPermissions().add(permissionElement);
        permissionElement.setOperation((Operation) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.Permission#setOperation}
     * at the opposite side is cleared (nulled).
     */
    public void removePermission(Permission permissionElement) {
        getPermissions().remove(permissionElement);

        permissionElement.setOperation(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.Permission#setOperation}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllPermissions() {
        for (Permission d : getPermissions()) {
            d.setOperation(null);
        }

        getPermissions().clear();

    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getFunctionCode}
     */
    public Object getKey() {
        return getFunctionCode();
    }

    // This comment was generated from SpecialCases.xpt 
}
