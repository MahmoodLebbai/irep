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
* Entity representing Role.
*/
@Entity
@Table(name = "ROLE", uniqueConstraints = @UniqueConstraint(columnNames =  {
    "CODE", "NAME"}
)
)
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class Role extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = false, length = 20)
    @NotNull
    @Length(max = 20)
    private String roleCode;
    @Column(name = "NAME", nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private String roleName;
    @Column(name = "DESC", length = 100)
    @Length(max = 100)
    private String roleDesc;
    @Column(name = "ACTIVE", nullable = false)
    private boolean roleStatus;
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
    @ForeignKey(name = "FK_ROLEPERMISSION_ROLE_ID_ROLE_ID", inverseName = "FK_ROLEPERMISSION_ROLE_ID_ROLEPERMISSION")
    @NotNull
    private List<RolePermission> rolePermissions =
        new ArrayList<RolePermission>();
    @OneToMany(cascade = CascadeType.ALL)
    @ForeignKey(name = "FK_ROLE_ID_USERROLE_ROLE_ID", inverseName = "FK_ROLE_ID_USERROLE_USERROLE")
    @NotNull
    private List<UserRole> userRoles = new ArrayList<UserRole>();
    @OneToMany(cascade = CascadeType.ALL)
    @ForeignKey(name = "FK_ROLE_ID_USERGROUPROLE_ROLE_ID", inverseName = "FK_ROLE_ID_USERGROUPROLE_USERGROUPROLE")
    @NotNull
    private List<UserGroupRole> userGroupRoles = new ArrayList<UserGroupRole>();
    @Transient
    private transient RoleKey cachedRoleKey;

    protected Role() {
    }

    public Role(String roleCode, String roleName) {
        super();
        Validate.notNull(roleCode, "Role.roleCode must not be null");
        this.roleCode = roleCode;
        Validate.notNull(roleName, "Role.roleName must not be null");
        this.roleName = roleName;
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

    public String getRoleCode() {
        return roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public boolean isRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(boolean roleStatus) {
        this.roleStatus = roleStatus;
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

    public List<RolePermission> getRolePermissions() {
        return rolePermissions;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getRolePermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.RolePermission#setRole}
     * at the opposite side is set.
     */
    public void addRolePermission(RolePermission rolePermissionElement) {
        getRolePermissions().add(rolePermissionElement);
        rolePermissionElement.setRole((Role) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getRolePermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.RolePermission#setRole}
     * at the opposite side is cleared (nulled).
     */
    public void removeRolePermission(RolePermission rolePermissionElement) {
        getRolePermissions().remove(rolePermissionElement);

        rolePermissionElement.setRole(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getRolePermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.RolePermission#setRole}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllRolePermissions() {
        for (RolePermission d : getRolePermissions()) {
            d.setRole(null);
        }

        getRolePermissions().clear();

    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getUserRoles}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserRole#setRole}
     * at the opposite side is set.
     */
    public void addUserRole(UserRole userRoleElement) {
        getUserRoles().add(userRoleElement);
        userRoleElement.setRole((Role) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getUserRoles}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserRole#setRole}
     * at the opposite side is cleared (nulled).
     */
    public void removeUserRole(UserRole userRoleElement) {
        getUserRoles().remove(userRoleElement);

        userRoleElement.setRole(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getUserRoles}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserRole#setRole}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllUserRoles() {
        for (UserRole d : getUserRoles()) {
            d.setRole(null);
        }

        getUserRoles().clear();

    }

    public List<UserGroupRole> getUserGroupRoles() {
        return userGroupRoles;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getUserGroupRoles}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserGroupRole#setRole}
     * at the opposite side is set.
     */
    public void addUserGroupRole(UserGroupRole userGroupRoleElement) {
        getUserGroupRoles().add(userGroupRoleElement);
        userGroupRoleElement.setRole((Role) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getUserGroupRoles}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserGroupRole#setRole}
     * at the opposite side is cleared (nulled).
     */
    public void removeUserGroupRole(UserGroupRole userGroupRoleElement) {
        getUserGroupRoles().remove(userGroupRoleElement);

        userGroupRoleElement.setRole(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getUserGroupRoles}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserGroupRole#setRole}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllUserGroupRoles() {
        for (UserGroupRole d : getUserGroupRoles()) {
            d.setRole(null);
        }

        getUserGroupRoles().clear();

    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getRoleKey}
     */
    public Object getKey() {
        return getRoleKey();
    }

    /**
     * The natural key for the domain object is
     * a composite key consisting of several attributes.
     */
    public RoleKey getRoleKey() {
        if (cachedRoleKey == null) {
            cachedRoleKey = new RoleKey(getRoleCode(), getRoleName());
        }
        return cachedRoleKey;
    }

    /**
     * This is the natural key for the domain object.
     * It is a composite key consisting of several
     * attributes.
     */
    public static class RoleKey {
        private String roleCode;
        private String roleName;

        public RoleKey(String roleCode, String roleName) {
            this.roleCode = roleCode;
            this.roleName = roleName;

        }

        public String getRoleCode() {
            return roleCode;
        }

        public String getRoleName() {
            return roleName;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoleKey)) {
                return false;
            }

            RoleKey other = (RoleKey) obj;

            if (!EqualsHelper.equals(getRoleCode(), other.getRoleCode())) {
                return false;
            }
            if (!EqualsHelper.equals(getRoleName(), other.getRoleName())) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 37 * result + EqualsHelper.computeHashCode(getRoleCode());
            result = 37 * result + EqualsHelper.computeHashCode(getRoleName());
            return result;
        }
    }

    // This comment was generated from SpecialCases.xpt 
}
