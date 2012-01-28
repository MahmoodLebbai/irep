package com.fos.common.security.dto;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSchemaType;

/**
* Data transfer object for UserDTO.
*/
public class UserDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
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

    public UserDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @XmlElement()
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement()
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @XmlElement()
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement()
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement()
    @XmlSchemaType(name = "date")
    public Date getPasswordExpiryDate() {
        return passwordExpiryDate;
    }

    public void setPasswordExpiryDate(Date passwordExpiryDate) {
        this.passwordExpiryDate = passwordExpiryDate;
    }

    @XmlElement()
    @XmlSchemaType(name = "date")
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @XmlElement()
    public boolean isUserStatus() {
        return userStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }

    @XmlElement()
    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    @XmlElement()
    public UserDTO getReportingUserId() {
        return reportingUserId;
    }

    public void setReportingUserId(UserDTO reportingUserId) {
        this.reportingUserId = reportingUserId;
    }

    @XmlElement()
    public UserGroupDTO getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroupDTO userGroup) {
        this.userGroup = userGroup;
    }

    @XmlElementWrapper(name = "emails")
    @XmlElement(name = "email")
    public List<UserEmailDTO> getEmails() {
        return emails;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getEmails}.
     */
    public void addEmail(UserEmailDTO emailElement) {
        getEmails().add(emailElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getEmails}.
     */
    public void removeEmail(UserEmailDTO emailElement) {
        getEmails().remove(emailElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getEmails}.
     */
    public void removeAllEmails() {
        getEmails().clear();
    }

    @XmlElementWrapper(name = "phones")
    @XmlElement(name = "phone")
    public List<UserPhoneDTO> getPhones() {
        return phones;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getPhones}.
     */
    public void addPhone(UserPhoneDTO phoneElement) {
        getPhones().add(phoneElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getPhones}.
     */
    public void removePhone(UserPhoneDTO phoneElement) {
        getPhones().remove(phoneElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getPhones}.
     */
    public void removeAllPhones() {
        getPhones().clear();
    }

    @XmlElementWrapper(name = "userRoles")
    @XmlElement(name = "userRole")
    public List<UserRoleDTO> getUserRoles() {
        return userRoles;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getUserRoles}.
     */
    public void addUserRole(UserRoleDTO userRoleElement) {
        getUserRoles().add(userRoleElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getUserRoles}.
     */
    public void removeUserRole(UserRoleDTO userRoleElement) {
        getUserRoles().remove(userRoleElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getUserRoles}.
     */
    public void removeAllUserRoles() {
        getUserRoles().clear();
    }

    @XmlElementWrapper(name = "userCategoryPermissions")
    @XmlElement(name = "userCategoryPermission")
    public List<UserCategoryPermissionDTO> getUserCategoryPermissions() {
        return userCategoryPermissions;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getUserCategoryPermissions}.
     */
    public void addUserCategoryPermission(
        UserCategoryPermissionDTO userCategoryPermissionElement) {
        getUserCategoryPermissions().add(userCategoryPermissionElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getUserCategoryPermissions}.
     */
    public void removeUserCategoryPermission(
        UserCategoryPermissionDTO userCategoryPermissionElement) {
        getUserCategoryPermissions().remove(userCategoryPermissionElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getUserCategoryPermissions}.
     */
    public void removeAllUserCategoryPermissions() {
        getUserCategoryPermissions().clear();
    }

    @XmlElementWrapper(name = "userDelegations")
    @XmlElement(name = "userDelegation")
    public List<UserDelegationDTO> getUserDelegations() {
        return userDelegations;
    }

    /**
     * Adds an object to the unidirectional to-many
     * association.
     * It is added the collection {@link #getUserDelegations}.
     */
    public void addUserDelegation(UserDelegationDTO userDelegationElement) {
        getUserDelegations().add(userDelegationElement);
    }

    /**
     * Removes an object from the unidirectional to-many
     * association.
     * It is removed from the collection {@link #getUserDelegations}.
     */
    public void removeUserDelegation(UserDelegationDTO userDelegationElement) {
        getUserDelegations().remove(userDelegationElement);
    }

    /**
     * Removes all object from the unidirectional
     * to-many association.
     * All elements are removed from the collection {@link #getUserDelegations}.
     */
    public void removeAllUserDelegations() {
        getUserDelegations().clear();
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {

            // this shouldn't happen, since we are Cloneable
            throw new InternalError();
        }
    }
}
