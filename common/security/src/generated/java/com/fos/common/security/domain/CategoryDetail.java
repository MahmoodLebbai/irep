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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

/**
* Entity representing CategoryDetail.
*/
@Entity
@Table(name = "CATEGORYDETAIL")
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class CategoryDetail extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME", nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private String name;
    @Column(name = "DESC", nullable = false, length = 100)
    @NotNull
    @Length(max = 100)
    private String desc;
    @Column(name = "ACTIVE", nullable = false)
    private boolean status;
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
    private Category category;
    @OneToMany(cascade = CascadeType.ALL)
    @ForeignKey(name = "FK_CATEGORYDETAILPERMISSION_CATEGORY_DETAIL_CATEGORY_DETAIL", inverseName = "FK_CATEGORYDETAILPERMISSION_CATEGORY_DETAIL_CATEGORYDETAILPERM16")
    @NotNull
    private List<CategoryDetailsPermission> categoryDetailPermissions =
        new ArrayList<CategoryDetailsPermission>();

    protected CategoryDetail() {
    }

    public CategoryDetail(Category category) {
        super();
        this.category = category;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public Category getCategory() {
        return category;
    }

    /**
     * This reference can't be changed. Use constructor to assign value.
     * However, some tools need setter methods and sometimes the
     * referred object is not available at construction time. Therefore
     * this method is visible, but the actual reference can't be changed
     * once it is assigned.
     */
    public void setCategory(Category category) {

        // it must be possible to set null when deleting objects
        if ((category != null) && (this.category != null) &&
              !this.category.equals(category)) {
            throw new IllegalArgumentException(
                "Not allowed to change the category reference.");
        }
        this.category = category;
    }

    public List<CategoryDetailsPermission> getCategoryDetailPermissions() {
        return categoryDetailPermissions;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getCategoryDetailPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.CategoryDetailsPermission#setCategoryDetail}
     * at the opposite side is set.
     */
    public void addCategoryDetailPermission(
        CategoryDetailsPermission categoryDetailPermissionElement) {
        getCategoryDetailPermissions().add(categoryDetailPermissionElement);
        categoryDetailPermissionElement.setCategoryDetail((CategoryDetail) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getCategoryDetailPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.CategoryDetailsPermission#setCategoryDetail}
     * at the opposite side is cleared (nulled).
     */
    public void removeCategoryDetailPermission(
        CategoryDetailsPermission categoryDetailPermissionElement) {
        getCategoryDetailPermissions().remove(categoryDetailPermissionElement);

        categoryDetailPermissionElement.setCategoryDetail(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getCategoryDetailPermissions}
     * at this side and the association
     * {@link com.fos.common.security.domain.CategoryDetailsPermission#setCategoryDetail}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllCategoryDetailPermissions() {
        for (CategoryDetailsPermission d : getCategoryDetailPermissions()) {
            d.setCategoryDetail(null);
        }

        getCategoryDetailPermissions().clear();

    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getCategory}
     */
    public Object getKey() {
        return getCategory();
    }

    // This comment was generated from SpecialCases.xpt 
}
