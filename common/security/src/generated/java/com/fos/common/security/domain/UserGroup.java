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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

/**
* Entity representing UserGroup.
*/
@Entity
@Table(name = "USERGROUP", uniqueConstraints = @UniqueConstraint(columnNames =  {
    "CODE", "USERGROUP_NAME"}
)
)
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class UserGroup extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = false, length = 10)
    @NotNull
    @Length(max = 10)
    private String userGroupCode;
    @Column(name = "USERGROUP_NAME", nullable = false, length = 100)
    @NotNull
    @Length(max = 100)
    private String userGroupName;
    @Column(name = "USERGROUP_DESC", length = 100)
    @Length(max = 100)
    private String userGroupDesc;
    @Column(name = "ACTIVE", nullable = false)
    private boolean userGroupStatus;
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
    @JoinColumn(name = "USERGROUP")
    @ForeignKey(name = "FK_USERGROUP_USER")
    @NotNull
    private List<User> users = new ArrayList<User>();
    @OneToMany(cascade = CascadeType.ALL)
    @ForeignKey(name = "FK_USERGROUPROLE_USER_GROUP_ID_USER_GROUP_ID", inverseName = "FK_USERGROUPROLE_USER_GROUP_ID_USERGROUPROLE")
    @NotNull
    private List<UserGroupRole> userGroupRoles = new ArrayList<UserGroupRole>();
    @OneToMany(cascade = CascadeType.ALL)
    @ForeignKey(name = "FK_USERGROUPCATEGORYPERMISSION_USERGROUP_ID_USERGROUP_ID", inverseName = "FK_USERGROUPCATEGORYPERMISSION_USERGROUP_ID_USERGROUPCATEGORYP70")
    @NotNull
    private List<UserGroupCategoryPermission> userGroupCategoryPermissions =
        new ArrayList<UserGroupCategoryPermission>();
    @Transient
    private transient UserGroupKey cachedUserGroupKey;

    protected UserGroup() {
    }

    public UserGroup(String userGroupCode, String userGroupName) {
        super();
        Validate.notNull(userGroupCode,
            "UserGroup.userGroupCode must not be null");
        this.userGroupCode = userGroupCode;
        Validate.notNull(userGroupName,
            "UserGroup.userGroupName must not be null");
        this.userGroupName = userGroupName;
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

    public String getUserGroupCode() {
        return userGroupCode;
    }

    public String getUserGroupName() {
        return userGroupName;
    }

    public String getUserGroupDesc() {
        return userGroupDesc;
    }

    public void setUserGroupDesc(String userGroupDesc) {
        this.userGroupDesc = userGroupDesc;
    }

    public boolean isUserGroupStatus() {
        return userGroupStatus;
    }

    public void setUserGroupStatus(boolean userGroupStatus) {
        this.userGroupStatus = userGroupStatus;
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

    public List<User> getUsers() {
        return users;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getUsers}
     * at this side and the association
     * {@link com.fos.common.security.domain.User#setUserGroup}
     * at the opposite side is set.
     */
    public void addUser(User userElement) {
        getUsers().add(userElement);
        userElement.setUserGroup((UserGroup) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getUsers}
     * at this side and the association
     * {@link com.fos.common.security.domain.User#setUserGroup}
     * at the opposite side is cleared (nulled).
     */
    public void removeUser(User userElement) {
        getUsers().remove(userElement);

        userElement.setUserGroup(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getUsers}
     * at this side and the association
     * {@link com.fos.common.security.domain.User#setUserGroup}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllUsers() {
        for (User d : getUsers()) {
            d.setUserGroup(null);
        }

        getUsers().clear();

    }

    public List<UserGroupRole> getUserGroupRoles() {
        return userGroupRoles;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getUserGroupRoles}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserGroupRole#setUserGroup}
     * at the opposite side is set.
     */
    public void addUserGroupRole(UserGroupRole userGroupRoleElement) {
        getUserGroupRoles().add(userGroupRoleElement);
        userGroupRoleElement.setUserGroup((UserGroup) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getUserGroupRoles}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserGroupRole#setUserGroup}
     * at the opposite side is cleared (nulled).
     */
    public void removeUserGroupRole(UserGroupRole userGroupRoleElement) {
        getUserGroupRoles().remove(userGroupRoleElement);

        userGroupRoleElement.setUserGroup(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getUserGroupRoles}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserGroupRole#setUserGroup}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllUserGroupRoles() {
        for (UserGroupRole d : getUserGroupRoles()) {
            d.setUserGroup(null);
        }

        getUserGroupRoles().clear();

    }

    public List<UserGroupCategoryPermission> getUserGroupCategoryPermissions() {
        return userGroupCategoryPermissions;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getUserGroupCategoryPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserGroupCategoryPermission#setUserGroup}
     * at the opposite side is set.
     */
    public void addUserGroupCategoryPermission(
        UserGroupCategoryPermission userGroupCategoryPermissionElement) {
        getUserGroupCategoryPermissions().add(userGroupCategoryPermissionElement);
        userGroupCategoryPermissionElement.setUserGroup((UserGroup) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getUserGroupCategoryPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserGroupCategoryPermission#setUserGroup}
     * at the opposite side is cleared (nulled).
     */
    public void removeUserGroupCategoryPermission(
        UserGroupCategoryPermission userGroupCategoryPermissionElement) {
        getUserGroupCategoryPermissions()
            .remove(userGroupCategoryPermissionElement);

        userGroupCategoryPermissionElement.setUserGroup(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getUserGroupCategoryPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserGroupCategoryPermission#setUserGroup}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllUserGroupCategoryPermissions() {
        for (UserGroupCategoryPermission d : getUserGroupCategoryPermissions()) {
            d.setUserGroup(null);
        }

        getUserGroupCategoryPermissions().clear();

    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getUserGroupKey}
     */
    public Object getKey() {
        return getUserGroupKey();
    }

    /**
     * The natural key for the domain object is
     * a composite key consisting of several attributes.
     */
    public UserGroupKey getUserGroupKey() {
        if (cachedUserGroupKey == null) {
            cachedUserGroupKey = new UserGroupKey(getUserGroupCode(),
                    getUserGroupName());
        }
        return cachedUserGroupKey;
    }

    /**
     * This is the natural key for the domain object.
     * It is a composite key consisting of several
     * attributes.
     */
    public static class UserGroupKey {
        private String userGroupCode;
        private String userGroupName;

        public UserGroupKey(String userGroupCode, String userGroupName) {
            this.userGroupCode = userGroupCode;
            this.userGroupName = userGroupName;

        }

        public String getUserGroupCode() {
            return userGroupCode;
        }

        public String getUserGroupName() {
            return userGroupName;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserGroupKey)) {
                return false;
            }

            UserGroupKey other = (UserGroupKey) obj;

            if (!EqualsHelper.equals(getUserGroupCode(),
                      other.getUserGroupCode())) {
                return false;
            }
            if (!EqualsHelper.equals(getUserGroupName(),
                      other.getUserGroupName())) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 37 * result +
                EqualsHelper.computeHashCode(getUserGroupCode());
            result = 37 * result +
                EqualsHelper.computeHashCode(getUserGroupName());
            return result;
        }
    }

    // This comment was generated from SpecialCases.xpt 
}
