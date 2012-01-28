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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

/**
* Entity representing Permission.
*/
@Entity
@Table(name = "PERMISSION", uniqueConstraints = @UniqueConstraint(columnNames =  {
    "CODE", "OPERATION"}
)
)
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class Permission extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = false, length = 20)
    @NotNull
    @Length(max = 20)
    private String permissionCode;
    @Column(name = "CREATE_FLAG", nullable = false)
    private boolean createFlag;
    @Column(name = "MODIFY_FLAG", nullable = false)
    private boolean modifyFlag;
    @Column(name = "DELETE_FLAG", nullable = false)
    private boolean deleteFlag;
    @Column(name = "VIEW_FLAG", nullable = false)
    private boolean viewFlag;
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
    private Operation operation;
    @OneToMany(cascade = CascadeType.ALL)
    @ForeignKey(name = "FK_PERMISSION_ID_ROLEPERMISSION_PERMISSION_ID", inverseName = "FK_PERMISSION_ID_ROLEPERMISSION_ROLEPERMISSION")
    @NotNull
    private List<RolePermission> rolePermissions =
        new ArrayList<RolePermission>();
    @Transient
    private transient PermissionKey cachedPermissionKey;

    protected Permission() {
    }

    public Permission(String permissionCode, Operation operation) {
        super();
        Validate.notNull(permissionCode,
            "Permission.permissionCode must not be null");
        this.permissionCode = permissionCode;
        this.operation = operation;
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

    public String getPermissionCode() {
        return permissionCode;
    }

    public boolean isCreateFlag() {
        return createFlag;
    }

    public void setCreateFlag(boolean createFlag) {
        this.createFlag = createFlag;
    }

    public boolean isModifyFlag() {
        return modifyFlag;
    }

    public void setModifyFlag(boolean modifyFlag) {
        this.modifyFlag = modifyFlag;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public boolean isViewFlag() {
        return viewFlag;
    }

    public void setViewFlag(boolean viewFlag) {
        this.viewFlag = viewFlag;
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

    public Operation getOperation() {
        return operation;
    }

    /**
     * This reference can't be changed. Use constructor to assign value.
     * However, some tools need setter methods and sometimes the
     * referred object is not available at construction time. Therefore
     * this method is visible, but the actual reference can't be changed
     * once it is assigned.
     */
    public void setOperation(Operation operation) {

        // it must be possible to set null when deleting objects
        if ((operation != null) && (this.operation != null) &&
              !this.operation.equals(operation)) {
            throw new IllegalArgumentException(
                "Not allowed to change the operation reference.");
        }
        this.operation = operation;
    }

    public List<RolePermission> getRolePermissions() {
        return rolePermissions;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getRolePermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.RolePermission#setPermission}
     * at the opposite side is set.
     */
    public void addRolePermission(RolePermission rolePermissionElement) {
        getRolePermissions().add(rolePermissionElement);
        rolePermissionElement.setPermission((Permission) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getRolePermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.RolePermission#setPermission}
     * at the opposite side is cleared (nulled).
     */
    public void removeRolePermission(RolePermission rolePermissionElement) {
        getRolePermissions().remove(rolePermissionElement);

        rolePermissionElement.setPermission(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getRolePermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.RolePermission#setPermission}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllRolePermissions() {
        for (RolePermission d : getRolePermissions()) {
            d.setPermission(null);
        }

        getRolePermissions().clear();

    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getPermissionKey}
     */
    public Object getKey() {
        return getPermissionKey();
    }

    /**
     * The natural key for the domain object is
     * a composite key consisting of several attributes.
     */
    public PermissionKey getPermissionKey() {
        if (cachedPermissionKey == null) {
            cachedPermissionKey = new PermissionKey(getPermissionCode(),
                    getOperation());
        }
        return cachedPermissionKey;
    }

    /**
     * This is the natural key for the domain object.
     * It is a composite key consisting of several
     * attributes.
     */
    public static class PermissionKey {
        private String permissionCode;
        private Operation operation;

        public PermissionKey(String permissionCode, Operation operation) {
            this.permissionCode = permissionCode;
            this.operation = operation;

        }

        public String getPermissionCode() {
            return permissionCode;
        }

        public Operation getOperation() {
            return operation;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PermissionKey)) {
                return false;
            }

            PermissionKey other = (PermissionKey) obj;

            if (!EqualsHelper.equals(getPermissionCode(),
                      other.getPermissionCode())) {
                return false;
            }
            if (!EqualsHelper.equals(getOperation(), other.getOperation())) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 37 * result +
                EqualsHelper.computeHashCode(getPermissionCode());
            result = 37 * result +
                EqualsHelper.computeHashCode(getOperation());
            return result;
        }
    }

    // This comment was generated from SpecialCases.xpt 
}
