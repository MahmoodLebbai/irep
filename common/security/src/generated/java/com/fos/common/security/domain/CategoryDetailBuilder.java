package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * Builder for CategoryDetail class.
  */
public class CategoryDetailBuilder {
    private String name;
    private String desc;
    private boolean status;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Category category;
    private List<CategoryDetailsPermission> categoryDetailPermissions =
        new ArrayList<CategoryDetailsPermission>();

    public CategoryDetailBuilder() {
    }

    public CategoryDetailBuilder(Category category) {
        this.category = category;

    }

    /**
     * Static factor method for CategoryDetailBuilder
     */
    public static CategoryDetailBuilder categoryDetail() {
        return new CategoryDetailBuilder();
    }

    public CategoryDetailBuilder name(String val) {
        this.name = val;
        return this;
    }

    public CategoryDetailBuilder desc(String val) {
        this.desc = val;
        return this;
    }

    public CategoryDetailBuilder status(boolean val) {
        this.status = val;
        return this;
    }

    public CategoryDetailBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public CategoryDetailBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public CategoryDetailBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public CategoryDetailBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public CategoryDetailBuilder category(Category category) {
        this.category = category;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getCategoryDetailPermissions}.
     */
    public CategoryDetailBuilder addCategoryDetailPermission(
        CategoryDetailsPermission categoryDetailPermissionElement) {
        getCategoryDetailPermissions().add(categoryDetailPermissionElement);
        return this;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isStatus() {
        return status;
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

    public Category getCategory() {
        return category;
    }

    public List<CategoryDetailsPermission> getCategoryDetailPermissions() {
        return categoryDetailPermissions;
    }

    /**
     * @return new CategoryDetail instance constructed based on the values that have been set into this builder
     */
    public CategoryDetail build() {
        CategoryDetail obj = new CategoryDetail(getCategory());

        obj.setName(name);

        obj.setDesc(desc);

        obj.setStatus(status);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.getCategoryDetailPermissions().addAll(categoryDetailPermissions);

        return obj;
    }
}
