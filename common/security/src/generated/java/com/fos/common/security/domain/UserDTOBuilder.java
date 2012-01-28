package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;

import com.fos.common.security.dto.DepartmentDTO;
import com.fos.common.security.dto.UserCategoryPermissionDTO;
import com.fos.common.security.dto.UserDTO;
import com.fos.common.security.dto.UserDelegationDTO;
import com.fos.common.security.dto.UserEmailDTO;
import com.fos.common.security.dto.UserGroupDTO;
import com.fos.common.security.dto.UserPhoneDTO;
import com.fos.common.security.dto.UserRoleDTO;

/**
  * Builder for UserDTO class.
  */
public class UserDTOBuilder {
    private String userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private Date passwordExpiryDate;
    private Date dateOfBirth;
    private boolean userStatus;
    private DepartmentDTO department;
    private UserDTO reportingUserId;
    private UserGroupDTO userGroup;
    private List<UserEmailDTO> emails = new ArrayList<UserEmailDTO>();
    private List<UserPhoneDTO> phones = new ArrayList<UserPhoneDTO>();
    private List<UserRoleDTO> userRoles = new ArrayList<UserRoleDTO>();
    private List<UserCategoryPermissionDTO> userCategoryPermissions =
        new ArrayList<UserCategoryPermissionDTO>();
    private List<UserDelegationDTO> userDelegations =
        new ArrayList<UserDelegationDTO>();

    public UserDTOBuilder() {
    }

    /**
     * Static factor method for UserDTOBuilder
     */
    public static UserDTOBuilder userDTO() {
        return new UserDTOBuilder();
    }

    public UserDTOBuilder userId(String val) {
        this.userId = val;
        return this;
    }

    public UserDTOBuilder firstName(String val) {
        this.firstName = val;
        return this;
    }

    public UserDTOBuilder middleName(String val) {
        this.middleName = val;
        return this;
    }

    public UserDTOBuilder lastName(String val) {
        this.lastName = val;
        return this;
    }

    public UserDTOBuilder password(String val) {
        this.password = val;
        return this;
    }

    public UserDTOBuilder passwordExpiryDate(Date val) {
        this.passwordExpiryDate = val;
        return this;
    }

    public UserDTOBuilder dateOfBirth(Date val) {
        this.dateOfBirth = val;
        return this;
    }

    public UserDTOBuilder userStatus(boolean val) {
        this.userStatus = val;
        return this;
    }

    public UserDTOBuilder department(DepartmentDTO department) {
        this.department = department;
        return this;
    }

    public UserDTOBuilder reportingUserId(UserDTO reportingUserId) {
        this.reportingUserId = reportingUserId;
        return this;
    }

    public UserDTOBuilder userGroup(UserGroupDTO userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getEmails}.
     */
    public UserDTOBuilder addEmail(UserEmailDTO emailElement) {
        getEmails().add(emailElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getPhones}.
     */
    public UserDTOBuilder addPhone(UserPhoneDTO phoneElement) {
        getPhones().add(phoneElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserRoles}.
     */
    public UserDTOBuilder addUserRole(UserRoleDTO userRoleElement) {
        getUserRoles().add(userRoleElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserCategoryPermissions}.
     */
    public UserDTOBuilder addUserCategoryPermission(
        UserCategoryPermissionDTO userCategoryPermissionElement) {
        getUserCategoryPermissions().add(userCategoryPermissionElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserDelegations}.
     */
    public UserDTOBuilder addUserDelegation(
        UserDelegationDTO userDelegationElement) {
        getUserDelegations().add(userDelegationElement);
        return this;
    }

    @XmlElement()
    public String getUserId() {
        return userId;
    }

    @XmlElement()
    public String getFirstName() {
        return firstName;
    }

    @XmlElement()
    public String getMiddleName() {
        return middleName;
    }

    @XmlElement()
    public String getLastName() {
        return lastName;
    }

    @XmlElement()
    public String getPassword() {
        return password;
    }

    @XmlElement()
    @XmlSchemaType(name = "date")
    public Date getPasswordExpiryDate() {
        return passwordExpiryDate;
    }

    @XmlElement()
    @XmlSchemaType(name = "date")
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @XmlElement()
    public boolean isUserStatus() {
        return userStatus;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public UserDTO getReportingUserId() {
        return reportingUserId;
    }

    public UserGroupDTO getUserGroup() {
        return userGroup;
    }

    public List<UserEmailDTO> getEmails() {
        return emails;
    }

    public List<UserPhoneDTO> getPhones() {
        return phones;
    }

    public List<UserRoleDTO> getUserRoles() {
        return userRoles;
    }

    public List<UserCategoryPermissionDTO> getUserCategoryPermissions() {
        return userCategoryPermissions;
    }

    public List<UserDelegationDTO> getUserDelegations() {
        return userDelegations;
    }

    /**
     * @return new UserDTO instance constructed based on the values that have been set into this builder
     */
    public UserDTO build() {
        UserDTO obj = new UserDTO();

        obj.setUserId(userId);

        obj.setFirstName(firstName);

        obj.setMiddleName(middleName);

        obj.setLastName(lastName);

        obj.setPassword(password);

        obj.setPasswordExpiryDate(passwordExpiryDate);

        obj.setDateOfBirth(dateOfBirth);

        obj.setUserStatus(userStatus);

        obj.setDepartment(department);

        obj.setReportingUserId(reportingUserId);

        obj.setUserGroup(userGroup);

        obj.getEmails().addAll(emails);

        obj.getPhones().addAll(phones);

        obj.getUserRoles().addAll(userRoles);

        obj.getUserCategoryPermissions().addAll(userCategoryPermissions);

        obj.getUserDelegations().addAll(userDelegations);

        return obj;
    }
}
