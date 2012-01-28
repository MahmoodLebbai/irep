package com.fos.common.security.domain;

import org.apache.commons.lang.Validate;

import org.fornax.cartridges.sculptor.framework.domain.AbstractDomainObject;
import org.fornax.cartridges.sculptor.framework.domain.Auditable;
import org.fornax.cartridges.sculptor.framework.domain.Identifiable;
import org.fornax.cartridges.sculptor.framework.util.EqualsHelper;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.Type;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

/**
* Entity representing UserDelegation.
*/
@Entity
@Table(name = "USERDELEGATION", uniqueConstraints = @UniqueConstraint(columnNames =  {
    "ACTIVE", "START_DATE", "USER_ID", "USER_DELEGATION_ID"}
)
)
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class UserDelegation extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ACTIVE", nullable = false)
    private boolean delegationStatus;
    @Column(name = "START_DATE", nullable = false)
    @Type(type = "date")
    @NotNull
    private Date startDate;
    @Column(name = "END_DATE", nullable = false)
    @Type(type = "date")
    @NotNull
    private Date endDate;
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
    private User user;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_DELEGATION_ID", nullable = false)
    @ForeignKey(name = "FK_USERDELEGATION_USER_DELEGATION_ID")
    @NotNull
    private User delegatedUser;
    @Transient
    private transient UserDelegationKey cachedUserDelegationKey;

    protected UserDelegation() {
    }

    public UserDelegation(boolean delegationStatus, Date startDate, User user,
        User delegatedUser) {
        super();
        this.delegationStatus = delegationStatus;
        Validate.notNull(startDate, "UserDelegation.startDate must not be null");
        this.startDate = startDate;
        this.user = user;
        this.delegatedUser = delegatedUser;
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

    public boolean isDelegationStatus() {
        return delegationStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public User getDelegatedUser() {
        return delegatedUser;
    }

    /**
     * This reference can't be changed. Use constructor to assign value.
     * However, some tools need setter methods and sometimes the
     * referred object is not available at construction time. Therefore
     * this method is visible, but the actual reference can't be changed
     * once it is assigned.
     */
    public void setDelegatedUser(User delegatedUser) {

        // it must be possible to set null when deleting objects
        if ((delegatedUser != null) && (this.delegatedUser != null) &&
              !this.delegatedUser.equals(delegatedUser)) {
            throw new IllegalArgumentException(
                "Not allowed to change the delegatedUser reference.");
        }
        this.delegatedUser = delegatedUser;
    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getUserDelegationKey}
     */
    public Object getKey() {
        return getUserDelegationKey();
    }

    /**
     * The natural key for the domain object is
     * a composite key consisting of several attributes.
     */
    public UserDelegationKey getUserDelegationKey() {
        if (cachedUserDelegationKey == null) {
            cachedUserDelegationKey = new UserDelegationKey(isDelegationStatus(),
                    getStartDate(), getUser(), getDelegatedUser());
        }
        return cachedUserDelegationKey;
    }

    /**
     * This is the natural key for the domain object.
     * It is a composite key consisting of several
     * attributes.
     */
    public static class UserDelegationKey {
        private boolean delegationStatus;
        private Date startDate;
        private User user;
        private User delegatedUser;

        public UserDelegationKey(boolean delegationStatus, Date startDate,
            User user, User delegatedUser) {
            this.delegationStatus = delegationStatus;
            this.startDate = startDate;
            this.user = user;
            this.delegatedUser = delegatedUser;

        }

        public boolean isDelegationStatus() {
            return delegationStatus;
        }

        public Date getStartDate() {
            return startDate;
        }

        public User getUser() {
            return user;
        }

        public User getDelegatedUser() {
            return delegatedUser;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserDelegationKey)) {
                return false;
            }

            UserDelegationKey other = (UserDelegationKey) obj;

            if (isDelegationStatus() != other.isDelegationStatus()) {
                return false;
            }
            if (!EqualsHelper.equals(getStartDate(), other.getStartDate())) {
                return false;
            }
            if (!EqualsHelper.equals(getUser(), other.getUser())) {
                return false;
            }
            if (!EqualsHelper.equals(getDelegatedUser(),
                      other.getDelegatedUser())) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 37 * result +
                EqualsHelper.computeHashCode(isDelegationStatus());
            result = 37 * result +
                EqualsHelper.computeHashCode(getStartDate());
            result = 37 * result + EqualsHelper.computeHashCode(getUser());
            result = 37 * result +
                EqualsHelper.computeHashCode(getDelegatedUser());
            return result;
        }
    }

    // This comment was generated from SpecialCases.xpt 
}
