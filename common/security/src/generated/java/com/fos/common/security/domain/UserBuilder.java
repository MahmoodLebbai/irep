package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * Builder for User class.
  */
public class UserBuilder {
    private String userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private Date passwordExpiryDate;
    private Date dateOfBirth;
    private boolean userStatus;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Department department;
    private User reportingUser;
    private UserGroup userGroup;
    private List<UserCategoryPermission> userCategoryPermissions =
        new ArrayList<UserCategoryPermission>();
    private List<UserEmail> emails = new ArrayList<UserEmail>();
    private List<UserPhone> phones = new ArrayList<UserPhone>();
    private List<UserRole> userRoles = new ArrayList<UserRole>();
    private List<UserDelegation> userDelegations =
        new ArrayList<UserDelegation>();

    public UserBuilder() {
    }

    public UserBuilder(String userId) {
        this.userId = userId;

    }

    /**
     * Static factor method for UserBuilder
     */
    public static UserBuilder user() {
        return new UserBuilder();
    }

    public UserBuilder userId(String val) {
        this.userId = val;
        return this;
    }

    public UserBuilder firstName(String val) {
        this.firstName = val;
        return this;
    }

    public UserBuilder middleName(String val) {
        this.middleName = val;
        return this;
    }

    public UserBuilder lastName(String val) {
        this.lastName = val;
        return this;
    }

    public UserBuilder password(String val) {
        this.password = val;
        return this;
    }

    public UserBuilder passwordExpiryDate(Date val) {
        this.passwordExpiryDate = val;
        return this;
    }

    public UserBuilder dateOfBirth(Date val) {
        this.dateOfBirth = val;
        return this;
    }

    public UserBuilder userStatus(boolean val) {
        this.userStatus = val;
        return this;
    }

    public UserBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public UserBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public UserBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public UserBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public UserBuilder department(Department department) {
        this.department = department;
        return this;
    }

    public UserBuilder reportingUser(User reportingUser) {
        this.reportingUser = reportingUser;
        return this;
    }

    public UserBuilder userGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserCategoryPermissions}.
     */
    public UserBuilder addUserCategoryPermission(
        UserCategoryPermission userCategoryPermissionElement) {
        getUserCategoryPermissions().add(userCategoryPermissionElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getEmails}.
     */
    public UserBuilder addEmail(UserEmail emailElement) {
        getEmails().add(emailElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getPhones}.
     */
    public UserBuilder addPhone(UserPhone phoneElement) {
        getPhones().add(phoneElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserRoles}.
     */
    public UserBuilder addUserRole(UserRole userRoleElement) {
        getUserRoles().add(userRoleElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserDelegations}.
     */
    public UserBuilder addUserDelegation(UserDelegation userDelegationElement) {
        getUserDelegations().add(userDelegationElement);
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public Date getPasswordExpiryDate() {
        return passwordExpiryDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isUserStatus() {
        return userStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public Department getDepartment() {
        return department;
    }

    public User getReportingUser() {
        return reportingUser;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public List<UserCategoryPermission> getUserCategoryPermissions() {
        return userCategoryPermissions;
    }

    public List<UserEmail> getEmails() {
        return emails;
    }

    public List<UserPhone> getPhones() {
        return phones;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public List<UserDelegation> getUserDelegations() {
        return userDelegations;
    }

    /**
     * @return new User instance constructed based on the values that have been set into this builder
     */
    public User build() {
        User obj = new User(getUserId());

        obj.setFirstName(firstName);

        obj.setMiddleName(middleName);

        obj.setLastName(lastName);

        obj.setPassword(password);

        obj.setPasswordExpiryDate(passwordExpiryDate);

        obj.setDateOfBirth(dateOfBirth);

        obj.setUserStatus(userStatus);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.setDepartment(department);

        obj.setReportingUser(reportingUser);

        obj.setUserGroup(userGroup);

        obj.getUserCategoryPermissions().addAll(userCategoryPermissions);

        obj.getEmails().addAll(emails);

        obj.getPhones().addAll(phones);

        obj.getUserRoles().addAll(userRoles);

        obj.getUserDelegations().addAll(userDelegations);

        return obj;
    }
}
