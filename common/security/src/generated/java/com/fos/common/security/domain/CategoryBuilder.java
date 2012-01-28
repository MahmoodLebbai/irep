package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * Builder for Category class.
  */
public class CategoryBuilder {
    private String categoryID;
    private String categoryName;
    private String categoryDesc;
    private boolean categoryStatus;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private List<CategoryDetail> categoryDetails =
        new ArrayList<CategoryDetail>();

    public CategoryBuilder() {
    }

    public CategoryBuilder(String categoryID) {
        this.categoryID = categoryID;

    }

    /**
     * Static factor method for CategoryBuilder
     */
    public static CategoryBuilder category() {
        return new CategoryBuilder();
    }

    public CategoryBuilder categoryID(String val) {
        this.categoryID = val;
        return this;
    }

    public CategoryBuilder categoryName(String val) {
        this.categoryName = val;
        return this;
    }

    public CategoryBuilder categoryDesc(String val) {
        this.categoryDesc = val;
        return this;
    }

    public CategoryBuilder categoryStatus(boolean val) {
        this.categoryStatus = val;
        return this;
    }

    public CategoryBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public CategoryBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public CategoryBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public CategoryBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getCategoryDetails}.
     */
    public CategoryBuilder addCategoryDetail(
        CategoryDetail categoryDetailElement) {
        getCategoryDetails().add(categoryDetailElement);
        return this;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public boolean isCategoryStatus() {
        return categoryStatus;
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

    public List<CategoryDetail> getCategoryDetails() {
        return categoryDetails;
    }

    /**
     * @return new Category instance constructed based on the values that have been set into this builder
     */
    public Category build() {
        Category obj = new Category(getCategoryID());

        obj.setCategoryName(categoryName);

        obj.setCategoryDesc(categoryDesc);

        obj.setCategoryStatus(categoryStatus);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.getCategoryDetails().addAll(categoryDetails);

        return obj;
    }
}
