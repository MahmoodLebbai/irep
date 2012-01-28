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
* Entity representing UserRole.
*/
@Entity
@Table(name = "USER_ROLE", uniqueConstraints = @UniqueConstraint(columnNames =  {
    "ROLE_ID", "USER_ID"}
)
)
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class UserRole extends AbstractDomainObject implements Auditable,
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
    private Role role;
    @ManyToOne(optional = false)
    @NotNull
    private User user;
    @Transient
    private transient UserRoleKey cachedUserRoleKey;

    protected UserRole() {
    }

    public UserRole(Role role, User user) {
        super();
        this.role = role;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    /**
     * This reference can't be changed. Use constructor to assign value.
     * However, some tools need setter methods and sometimes the
     * referred object is not available at construction time. Therefore
     * this method is visible, but the actual reference can't be changed
     * once it is assigned.
     */
    public void setUser(User user) {

        // it must be possible to set null when deleting objects
        if ((user != null) && (this.user != null) && !this.user.equals(user)) {
            throw new IllegalArgumentException(
                "Not allowed to change the user reference.");
        }
        this.user = user;
    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getUserRoleKey}
     */
    public Object getKey() {
        return getUserRoleKey();
    }

    /**
     * The natural key for the domain object is
     * a composite key consisting of several attributes.
     */
    public UserRoleKey getUserRoleKey() {
        if (cachedUserRoleKey == null) {
            cachedUserRoleKey = new UserRoleKey(getRole(), getUser());
        }
        return cachedUserRoleKey;
    }

    /**
     * This is the natural key for the domain object.
     * It is a composite key consisting of several
     * attributes.
     */
    public static class UserRoleKey {
        private Role role;
        private User user;

        public UserRoleKey(Role role, User user) {
            this.role = role;
            this.user = user;

        }

        public Role getRole() {
            return role;
        }

        public User getUser() {
            return user;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserRoleKey)) {
                return false;
            }

            UserRoleKey other = (UserRoleKey) obj;

            if (!EqualsHelper.equals(getRole(), other.getRole())) {
                return false;
            }
            if (!EqualsHelper.equals(getUser(), other.getUser())) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 37 * result + EqualsHelper.computeHashCode(getRole());
            result = 37 * result + EqualsHelper.computeHashCode(getUser());
            return result;
        }
    }

    // This comment was generated from SpecialCases.xpt 
}
