package com.fos.common.security.domain;

import org.apache.commons.lang.Validate;

import org.fornax.cartridges.sculptor.framework.domain.AbstractDomainObject;
import org.fornax.cartridges.sculptor.framework.domain.Auditable;
import org.fornax.cartridges.sculptor.framework.domain.Identifiable;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

/**
* Entity representing User.
*/
@Entity
@Table(name = "USER")
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class User extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "USER_ID", nullable = false, length = 100, unique = true)
    @NotNull
    @Length(max = 100)
    private String userId;
    @Column(name = "FIRST_NAME", nullable = false, length = 100)
    @NotNull
    @Length(max = 100)
    private String firstName;
    @Column(name = "MIDDLE_NAME", length = 100)
    @Length(max = 100)
    private String middleName;
    @Column(name = "LAST_NAME", length = 100)
    @Length(max = 100)
    private String lastName;
    @Column(name = "PASSWORD", nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private String password;
    @Column(name = "PASSWORD_EXPIRY_DATE", nullable = false)
    @Type(type = "date")
    @NotNull
    private Date passwordExpiryDate;
    @Column(name = "DOB", nullable = false)
    @Type(type = "date")
    @NotNull
    private Date dateOfBirth;
    @Column(name = "ACTIVE", nullable = false)
    private boolean userStatus;
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
    private Department department;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "REPORTING_USER")
    @ForeignKey(name = "FK_USER_REPORTING_USER")
    private User reportingUser;
    @ManyToOne(optional = false)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @NotNull
    private UserGroup userGroup;
    @OneToMany(cascade =  {
        CascadeType.ALL}
    )
    @ForeignKey(name = "FK_USERCATEGORYPERMISSION_USER_ID_USER_ID", inverseName = "FK_USERCATEGORYPERMISSION_USER_ID_USERCATEGORYPERMISSION")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE
    })
    @NotNull
    private List<UserCategoryPermission> userCategoryPermissions =
        new ArrayList<UserCategoryPermission>();
    @OneToMany(cascade =  {
        CascadeType.ALL}
    , orphanRemoval = true, fetch = FetchType.EAGER)
    @ForeignKey(name = "FK_EMAIL_USER_ID_USER_ID", inverseName = "FK_EMAIL_USER_ID_EMAIL")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE
    })
    @NotNull
    private List<UserEmail> emails = new ArrayList<UserEmail>();
    @OneToMany(cascade =  {
        CascadeType.ALL}
    , orphanRemoval = true, fetch = FetchType.EAGER)
    @ForeignKey(name = "FK_PHONE_USER_ID_USER_ID", inverseName = "FK_PHONE_USER_ID_PHONE")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE
    })
    @NotNull
    private List<UserPhone> phones = new ArrayList<UserPhone>();
    @OneToMany(cascade =  {
        CascadeType.ALL}
    )
    @ForeignKey(name = "FK_USERROLE_USER_ID_USER_ID", inverseName = "FK_USERROLE_USER_ID_USERROLE")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE
    })
    @NotNull
    private List<UserRole> userRoles = new ArrayList<UserRole>();
    @OneToMany(cascade =  {
        CascadeType.ALL}
    )
    @ForeignKey(name = "FK_USERDELEGATION_USER_ID_USER_ID", inverseName = "FK_USERDELEGATION_USER_ID_USERDELEGATION")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE
    })
    @NotNull
    private List<UserDelegation> userDelegations =
        new ArrayList<UserDelegation>();

    protected User() {
    }

    public User(String userId) {
        super();
        Validate.notNull(userId, "User.userId must not be null");
        this.userId = userId;
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

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getPasswordExpiryDate() {
        return passwordExpiryDate;
    }

    public void setPasswordExpiryDate(Date passwordExpiryDate) {
        this.passwordExpiryDate = passwordExpiryDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isUserStatus() {
        return userStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public User getReportingUser() {
        return reportingUser;
    }

    public void setReportingUser(User reportingUser) {
        this.reportingUser = reportingUser;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    public List<UserCategoryPermission> getUserCategoryPermissions() {
        return userCategoryPermissions;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getUserCategoryPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserCategoryPermission#setUser}
     * at the opposite side is set.
     */
    public void addUserCategoryPermission(
        UserCategoryPermission userCategoryPermissionElement) {
        getUserCategoryPermissions().add(userCategoryPermissionElement);
        userCategoryPermissionElement.setUser((User) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getUserCategoryPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserCategoryPermission#setUser}
     * at the opposite side is cleared (nulled).
     */
    public void removeUserCategoryPermission(
        UserCategoryPermission userCategoryPermissionElement) {
        getUserCategoryPermissions().remove(userCategoryPermissionElement);

        userCategoryPermissionElement.setUser(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getUserCategoryPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserCategoryPermission#setUser}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllUserCategoryPermissions() {
        for (UserCategoryPermission d : getUserCategoryPermissions()) {
            d.setUser(null);
        }

        getUserCategoryPermissions().clear();

    }

    public List<UserEmail> getEmails() {
        return emails;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getEmails}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserEmail#setUser}
     * at the opposite side is set.
     */
    public void addEmail(UserEmail emailElement) {
        getEmails().add(emailElement);
        emailElement.setUser((User) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getEmails}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserEmail#setUser}
     * at the opposite side is cleared (nulled).
     */
    public void removeEmail(UserEmail emailElement) {
        getEmails().remove(emailElement);

        emailElement.setUser(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getEmails}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserEmail#setUser}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllEmails() {
        for (UserEmail d : getEmails()) {
            d.setUser(null);
        }

        getEmails().clear();

    }

    public List<UserPhone> getPhones() {
        return phones;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getPhones}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserPhone#setUser}
     * at the opposite side is set.
     */
    public void addPhone(UserPhone phoneElement) {
        getPhones().add(phoneElement);
        phoneElement.setUser((User) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getPhones}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserPhone#setUser}
     * at the opposite side is cleared (nulled).
     */
    public void removePhone(UserPhone phoneElement) {
        getPhones().remove(phoneElement);

        phoneElement.setUser(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getPhones}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserPhone#setUser}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllPhones() {
        for (UserPhone d : getPhones()) {
            d.setUser(null);
        }

        getPhones().clear();

    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getUserRoles}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserRole#setUser}
     * at the opposite side is set.
     */
    public void addUserRole(UserRole userRoleElement) {
        getUserRoles().add(userRoleElement);
        userRoleElement.setUser((User) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getUserRoles}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserRole#setUser}
     * at the opposite side is cleared (nulled).
     */
    public void removeUserRole(UserRole userRoleElement) {
        getUserRoles().remove(userRoleElement);

        userRoleElement.setUser(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getUserRoles}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserRole#setUser}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllUserRoles() {
        for (UserRole d : getUserRoles()) {
            d.setUser(null);
        }

        getUserRoles().clear();

    }

    public List<UserDelegation> getUserDelegations() {
        return userDelegations;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getUserDelegations}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserDelegation#setUser}
     * at the opposite side is set.
     */
    public void addUserDelegation(UserDelegation userDelegationElement) {
        getUserDelegations().add(userDelegationElement);
        userDelegationElement.setUser((User) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getUserDelegations}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserDelegation#setUser}
     * at the opposite side is cleared (nulled).
     */
    public void removeUserDelegation(UserDelegation userDelegationElement) {
        getUserDelegations().remove(userDelegationElement);

        userDelegationElement.setUser(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getUserDelegations}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserDelegation#setUser}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllUserDelegations() {
        for (UserDelegation d : getUserDelegations()) {
            d.setUser(null);
        }

        getUserDelegations().clear();

    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getUserId}
     */
    public Object getKey() {
        return getUserId();
    }

    // This comment was generated from SpecialCases.xpt 
}
