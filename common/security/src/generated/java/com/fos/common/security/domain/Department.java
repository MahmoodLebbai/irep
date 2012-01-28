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
* Entity representing Department.
*/
@Entity
@Table(name = "DEPARTMENT", uniqueConstraints = @UniqueConstraint(columnNames =  {
    "CODE", "NAME"}
)
)
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class Department extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = false, length = 20)
    @NotNull
    @Length(max = 20)
    private String departmentCode;
    @Column(name = "NAME", nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private String departmentName;
    @Column(name = "DESC", length = 100)
    @Length(max = 100)
    private String departmentDesc;
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
    @ForeignKey(name = "FK_DEPARTMENT_USER_DEPARTMENT", inverseName = "FK_DEPARTMENT_USER_USER")
    @NotNull
    private List<User> users = new ArrayList<User>();
    @Transient
    private transient DepartmentKey cachedDepartmentKey;

    protected Department() {
    }

    public Department(String departmentCode, String departmentName) {
        super();
        Validate.notNull(departmentCode,
            "Department.departmentCode must not be null");
        this.departmentCode = departmentCode;
        Validate.notNull(departmentName,
            "Department.departmentName must not be null");
        this.departmentName = departmentName;
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

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc;
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
     * {@link com.fos.common.security.domain.User#setDepartment}
     * at the opposite side is set.
     */
    public void addUser(User userElement) {
        getUsers().add(userElement);
        userElement.setDepartment((Department) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getUsers}
     * at this side and the association
     * {@link com.fos.common.security.domain.User#setDepartment}
     * at the opposite side is cleared (nulled).
     */
    public void removeUser(User userElement) {
        getUsers().remove(userElement);

        userElement.setDepartment(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getUsers}
     * at this side and the association
     * {@link com.fos.common.security.domain.User#setDepartment}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllUsers() {
        for (User d : getUsers()) {
            d.setDepartment(null);
        }

        getUsers().clear();

    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getDepartmentKey}
     */
    public Object getKey() {
        return getDepartmentKey();
    }

    /**
     * The natural key for the domain object is
     * a composite key consisting of several attributes.
     */
    public DepartmentKey getDepartmentKey() {
        if (cachedDepartmentKey == null) {
            cachedDepartmentKey = new DepartmentKey(getDepartmentCode(),
                    getDepartmentName());
        }
        return cachedDepartmentKey;
    }

    /**
     * This is the natural key for the domain object.
     * It is a composite key consisting of several
     * attributes.
     */
    public static class DepartmentKey {
        private String departmentCode;
        private String departmentName;

        public DepartmentKey(String departmentCode, String departmentName) {
            this.departmentCode = departmentCode;
            this.departmentName = departmentName;

        }

        public String getDepartmentCode() {
            return departmentCode;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DepartmentKey)) {
                return false;
            }

            DepartmentKey other = (DepartmentKey) obj;

            if (!EqualsHelper.equals(getDepartmentCode(),
                      other.getDepartmentCode())) {
                return false;
            }
            if (!EqualsHelper.equals(getDepartmentName(),
                      other.getDepartmentName())) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 37 * result +
                EqualsHelper.computeHashCode(getDepartmentCode());
            result = 37 * result +
                EqualsHelper.computeHashCode(getDepartmentName());
            return result;
        }
    }

    // This comment was generated from SpecialCases.xpt 
}
