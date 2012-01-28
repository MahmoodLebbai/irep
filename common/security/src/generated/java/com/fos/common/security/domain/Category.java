package com.fos.common.security.domain;

import org.apache.commons.lang.Validate;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

/**
* Entity representing Category.
*/
@Entity
@Table(name = "CATEGORY")
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class Category extends AbstractDomainObject implements Auditable,
    Identifiable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = false, length = 20, unique = true)
    @NotNull
    @Length(max = 20)
    private String categoryID;
    @Column(name = "NAME", nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private String categoryName;
    @Column(name = "DESC", nullable = false, length = 100)
    @NotNull
    @Length(max = 100)
    private String categoryDesc;
    @Column(name = "ACTIVE", nullable = false)
    private boolean categoryStatus;
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
    @ForeignKey(name = "FK_CATEGORY_CATEGORYDETAIL_CATEGORY", inverseName = "FK_CATEGORY_CATEGORYDETAIL_CATEGORYDETAIL")
    @NotNull
    private List<CategoryDetail> categoryDetails =
        new ArrayList<CategoryDetail>();

    protected Category() {
    }

    public Category(String categoryID) {
        super();
        Validate.notNull(categoryID, "Category.categoryID must not be null");
        this.categoryID = categoryID;
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

    public String getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public boolean isCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
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

    public List<CategoryDetail> getCategoryDetails() {
        return categoryDetails;
    }

    /**
     * Adds an object to the bidirectional many-to-one
     * association in both ends.
     * It is added the collection {@link #getCategoryDetails}
     * at this side and the association
     * {@link com.fos.common.security.domain.CategoryDetail#setCategory}
     * at the opposite side is set.
     */
    public void addCategoryDetail(CategoryDetail categoryDetailElement) {
        getCategoryDetails().add(categoryDetailElement);
        categoryDetailElement.setCategory((Category) this);
    }

    /**
     * Removes an object from the bidirectional many-to-one
     * association in both ends.
     * It is removed from the collection {@link #getCategoryDetails}
     * at this side and the association
     * {@link com.fos.common.security.domain.CategoryDetail#setCategory}
     * at the opposite side is cleared (nulled).
     */
    public void removeCategoryDetail(CategoryDetail categoryDetailElement) {
        getCategoryDetails().remove(categoryDetailElement);

        categoryDetailElement.setCategory(null);

    }

    /**
     * Removes all object from the bidirectional
     * many-to-one association in both ends.
     * All elements are removed from the collection {@link #getCategoryDetails}
     * at this side and the association
     * {@link com.fos.common.security.domain.CategoryDetail#setCategory}
     * at the opposite side is cleared (nulled).
     */
    public void removeAllCategoryDetails() {
        for (CategoryDetail d : getCategoryDetails()) {
            d.setCategory(null);
        }

        getCategoryDetails().clear();

    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getCategoryID}
     */
    public Object getKey() {
        return getCategoryID();
    }

    // This comment was generated from SpecialCases.xpt 
}
