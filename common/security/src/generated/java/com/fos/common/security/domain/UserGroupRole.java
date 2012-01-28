package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.AbstractDomainObject;
import org.fornax.cartridges.sculptor.framework.domain.Auditable;
import org.fornax.cartridges.sculptor.framework.domain.Identifiable;
import org.fornax.cartridges.sculptor.framework.util.EqualsHelper;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

/**
* Entity representing UserGroupRole.
*/
@Entity
@Table(name = "USERGROUP_ROLE", uniqueConstraints = @UniqueConstraint(columnNames =  {
    "USER_GROUP_ID", "ROLE_ID"}
)
)
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class UserGroupRole extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
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
    private UserGroup userGroup;
    @ManyToOne(optional = false)
    @NotNull
    private Role role;
    @Transient
    private transient UserGroupRoleKey cachedUserGroupRoleKey;

    protected UserGroupRole() {
    }

    public UserGroupRole(UserGroup userGroup, Role role) {
        super();
        this.userGroup = userGroup;
        this.role = role;
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

    public UserGroup getUserGroup() {
        return userGroup;
    }

    /**
     * This reference can't be changed. Use constructor to assign value.
     * However, some tools need setter methods and sometimes the
     * referred object is not available at construction time. Therefore
     * this method is visible, but the actual reference can't be changed
     * once it is assigned.
     */
    public void setUserGroup(UserGroup userGroup) {

        // it must be possible to set null when deleting objects
        if ((userGroup != null) && (this.userGroup != null) &&
              !this.userGroup.equals(userGroup)) {
            throw new IllegalArgumentException(
                "Not allowed to change the userGroup reference.");
        }
        this.userGroup = userGroup;
    }

    public Role getRole() {
        return role;
    }

    /**
     * This reference can't be changed. Use constructor to assign value.
     * However, some tools need setter methods and sometimes the
     * referred object is not available at construction time. Therefore
     * this method is visible, but the actual reference can't be changed
     * once it is assigned.
     */
    public void setRole(Role role) {

        // it must be possible to set null when deleting objects
        if ((role != null) && (this.role != null) && !this.role.equals(role)) {
            throw new IllegalArgumentException(
                "Not allowed to change the role reference.");
        }
        this.role = role;
    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getUserGroupRoleKey}
     */
    public Object getKey() {
        return getUserGroupRoleKey();
    }

    /**
     * The natural key for the domain object is
     * a composite key consisting of several attributes.
     */
    public UserGroupRoleKey getUserGroupRoleKey() {
        if (cachedUserGroupRoleKey == null) {
            cachedUserGroupRoleKey = new UserGroupRoleKey(getUserGroup(),
                    getRole());
        }
        return cachedUserGroupRoleKey;
    }

    /**
     * This is the natural key for the domain object.
     * It is a composite key consisting of several
     * attributes.
     */
    public static class UserGroupRoleKey {
        private UserGroup userGroup;
        private Role role;

        public UserGroupRoleKey(UserGroup userGroup, Role role) {
            this.userGroup = userGroup;
            this.role = role;

        }

        public UserGroup getUserGroup() {
            return userGroup;
        }

        public Role getRole() {
            return role;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserGroupRoleKey)) {
                return false;
            }

            UserGroupRoleKey other = (UserGroupRoleKey) obj;

            if (!EqualsHelper.equals(getUserGroup(), other.getUserGroup())) {
                return false;
            }
            if (!EqualsHelper.equals(getRole(), other.getRole())) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 37 * result +
                EqualsHelper.computeHashCode(getUserGroup());
            result = 37 * result + EqualsHelper.computeHashCode(getRole());
            return result;
        }
    }

    // This comment was generated from SpecialCases.xpt 
}
