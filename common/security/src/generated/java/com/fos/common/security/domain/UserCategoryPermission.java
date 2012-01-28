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
* Entity representing UserCategoryPermission.
*/
@Entity
@Table(name = "USER_CATEGORY", uniqueConstraints = @UniqueConstraint(columnNames =  {
    "USER_ID", "CATEGORYDETAIL_PERMISSION_ID"}
)
)
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class UserCategoryPermission extends AbstractDomainObject
    implements Auditable, Identifiable {
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
    private User user;
    @ManyToOne(optional = false)
    @NotNull
    private CategoryDetailsPermission categoryDetailPermissions;
    @Transient
    private transient UserCategoryPermissionKey cachedUserCategoryPermissionKey;

    protected UserCategoryPermission() {
    }

    public UserCategoryPermission(User user,
        CategoryDetailsPermission categoryDetailPermissions) {
        super();
        this.user = user;
        this.categoryDetailPermissions = categoryDetailPermissions;
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

    public CategoryDetailsPermission getCategoryDetailPermissions() {
        return categoryDetailPermissions;
    }

    /**
     * This reference can't be changed. Use constructor to assign value.
     * However, some tools need setter methods and sometimes the
     * referred object is not available at construction time. Therefore
     * this method is visible, but the actual reference can't be changed
     * once it is assigned.
     */
    public void setCategoryDetailPermissions(
        CategoryDetailsPermission categoryDetailPermissions) {

        // it must be possible to set null when deleting objects
        if ((categoryDetailPermissions != null) &&
              (this.categoryDetailPermissions != null) &&
              !this.categoryDetailPermissions.equals(categoryDetailPermissions)) {
            throw new IllegalArgumentException(
                "Not allowed to change the categoryDetailPermissions reference.");
        }
        this.categoryDetailPermissions = categoryDetailPermissions;
    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getUserCategoryPermissionKey}
     */
    public Object getKey() {
        return getUserCategoryPermissionKey();
    }

    /**
     * The natural key for the domain object is
     * a composite key consisting of several attributes.
     */
    public UserCategoryPermissionKey getUserCategoryPermissionKey() {
        if (cachedUserCategoryPermissionKey == null) {
            cachedUserCategoryPermissionKey = new UserCategoryPermissionKey(getUser(),
                    getCategoryDetailPermissions());
        }
        return cachedUserCategoryPermissionKey;
    }

    /**
     * This is the natural key for the domain object.
     * It is a composite key consisting of several
     * attributes.
     */
    public static class UserCategoryPermissionKey {
        private User user;
        private CategoryDetailsPermission categoryDetailPermissions;

        public UserCategoryPermissionKey(User user,
            CategoryDetailsPermission categoryDetailPermissions) {
            this.user = user;
            this.categoryDetailPermissions = categoryDetailPermissions;

        }

        public User getUser() {
            return user;
        }

        public CategoryDetailsPermission getCategoryDetailPermissions() {
            return categoryDetailPermissions;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserCategoryPermissionKey)) {
                return false;
            }

            UserCategoryPermissionKey other = (UserCategoryPermissionKey) obj;

            if (!EqualsHelper.equals(getUser(), other.getUser())) {
                return false;
            }
            if (!EqualsHelper.equals(getCategoryDetailPermissions(),
                      other.getCategoryDetailPermissions())) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 37 * result + EqualsHelper.computeHashCode(getUser());
            result = 37 * result +
                EqualsHelper.computeHashCode(getCategoryDetailPermissions());
            return result;
        }
    }

    // This comment was generated from SpecialCases.xpt 
}
