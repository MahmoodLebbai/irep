package com.fos.common.security.domain;

import org.fornax.cartridges.sculptor.framework.domain.AbstractDomainObject;
import org.fornax.cartridges.sculptor.framework.domain.Auditable;
import org.fornax.cartridges.sculptor.framework.domain.Identifiable;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

/**
* Entity representing CategoryDetailsPermission.
*/
@Entity
@Table(name = "CATEGORYDETAIL_PERMISSION")
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class CategoryDetailsPermission extends AbstractDomainObject
    implements Auditable, Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CATEGORY_PERMISSION_CODE", nullable = false, length = 20)
    @NotNull
    @Length(max = 20)
    private String categoryPermissionCode;
    @Column(name = "CREATE_FLAG", nullable = false)
    private boolean createFlag;
    @Column(name = "MODIFY_FLAG", nullable = false)
    private boolean modifyFlag;
    @Column(name = "DELETE_FLAG", nullable = false)
    private boolean deleteFlag;
    @Column(name = "VIEW_FLAG", nullable = false)
    private boolean viewFlag;
    @Column(name = "UUID", nullable = false, length = 36, unique = true)
    private String uuid;
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
    private CategoryDetail categoryDetail;
    @OneToMany(cascade = CascadeType.ALL)
    @ForeignKey(name = "FK_CATEGORYDETAIL_PERMISSION_ID_USERCATEGORYDETAILPERMISSION_C01", inverseName = "FK_CATEGORYDETAIL_PERMISSION_ID_USERCATEGORYDETAILPERMISSION_U37")
    @NotNull
    private List<UserCategoryPermission> userCategoryDetailPermissions =
        new ArrayList<UserCategoryPermission>();
    @OneToMany(cascade = CascadeType.ALL)
    @ForeignKey(name = "FK_CATEGORYDETAIL_PERMISSION_ID_USERGROUPCATEGORYDETAILPERMISS70", inverseName = "FK_CATEGORYDETAIL_PERMISSION_ID_USERGROUPCATEGORYDETAILPERMISS93")
    @NotNull
    private List<UserGroupCategoryPermission> userGroupCategoryDetailPermissions =
        new ArrayList<UserGroupCategoryPermission>();

    public CategoryDetailsPermission() {
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

    public String getCategoryPermissionCode() {
        return categoryPermissionCode;
    }

    public void setCategoryPermissionCode(String categoryPermissionCode) {
        this.categoryPermissionCode = categoryPermissionCode;
    }

    public boolean isCreateFlag() {
        return createFlag;
    }

    public void setCreateFlag(boolean createFlag) {
        this.createFlag = createFlag;
    }

    public boolean isModifyFlag() {
        return modifyFlag;
    }

    public void setModifyFlag(boolean modifyFlag) {
        this.modifyFlag = modifyFlag;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public boolean isViewFlag() {
        return viewFlag;
    }

    public void setViewFlag(boolean viewFlag) {
        this.viewFlag = viewFlag;
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

    /**
     * This domain object doesn't have a natural key
     * and this random generated identifier is the
     * unique identifier for this domain object.
     */
    public String getUuid() {

        // lazy init of UUID
        if (uuid == null) {
            uuid = java.util.UUID.randomUUID().toString();
        }
        return uuid;
    }

    public CategoryDetail getCategoryDetail() {
        return categoryDetail;
    }

    public void setCategoryDetail(CategoryDetail categoryDetail) {
        this.categoryDetail = categoryDetail;
    }

    public List<UserCategoryPermission> getUserCategoryDetailPermissions() {
        return userCategoryDetailPermissions;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getUserCategoryDetailPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserCategoryPermission#setCategoryDetailPermissions}
     * at the opposite side is set.
     */
    public void addUserCategoryDetailPermission(
        UserCategoryPermission userCategoryDetailPermissionElement) {
        getUserCategoryDetailPermissions()
            .add(userCategoryDetailPermissionElement);
        userCategoryDetailPermissionElement.setCategoryDetailPermissions((CategoryDetailsPermission) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getUserCategoryDetailPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserCategoryPermission#setCategoryDetailPermissions}
     * at the opposite side is cleared (nulled).
     */
    public void removeUserCategoryDetailPermission(
        UserCategoryPermission userCategoryDetailPermissionElement) {
        getUserCategoryDetailPermissions()
            .remove(userCategoryDetailPermissionElement);

        userCategoryDetailPermissionElement.setCategoryDetailPermissions(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getUserCategoryDetailPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserCategoryPermission#setCategoryDetailPermissions}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllUserCategoryDetailPermissions() {
        for (UserCategoryPermission d : getUserCategoryDetailPermissions()) {
            d.setCategoryDetailPermissions(null);
        }

        getUserCategoryDetailPermissions().clear();

    }

    public List<UserGroupCategoryPermission> getUserGroupCategoryDetailPermissions() {
        return userGroupCategoryDetailPermissions;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getUserGroupCategoryDetailPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserGroupCategoryPermission#setCategoryDetailPermissions}
     * at the opposite side is set.
     */
    public void addUserGroupCategoryDetailPermission(
        UserGroupCategoryPermission userGroupCategoryDetailPermissionElement) {
        getUserGroupCategoryDetailPermissions()
            .add(userGroupCategoryDetailPermissionElement);
        userGroupCategoryDetailPermissionElement.setCategoryDetailPermissions((CategoryDetailsPermission) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getUserGroupCategoryDetailPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserGroupCategoryPermission#setCategoryDetailPermissions}
     * at the opposite side is cleared (nulled).
     */
    public void removeUserGroupCategoryDetailPermission(
        UserGroupCategoryPermission userGroupCategoryDetailPermissionElement) {
        getUserGroupCategoryDetailPermissions()
            .remove(userGroupCategoryDetailPermissionElement);

        userGroupCategoryDetailPermissionElement.setCategoryDetailPermissions(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getUserGroupCategoryDetailPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.UserGroupCategoryPermission#setCategoryDetailPermissions}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllUserGroupCategoryDetailPermissions() {
        for (UserGroupCategoryPermission d : getUserGroupCategoryDetailPermissions()) {
            d.setCategoryDetailPermissions(null);
        }

        getUserGroupCategoryDetailPermissions().clear();

    }

    @PrePersist
    protected void prePersist() {
        getUuid();
    }

    /**
     * This method is used by equals and hashCode.
     * @return {{@link #getUuid}
     */
    public Object getKey() {
        return getUuid();
    }

    // This comment was generated from SpecialCases.xpt 
}
