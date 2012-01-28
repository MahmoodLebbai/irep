package com.fos.common.security.domain;

import java.util.Date;

/**
  * Builder for UserCategoryPermission class.
  */
public class UserCategoryPermissionBuilder {
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private User user;
    private CategoryDetailsPermission categoryDetailPermissions;

    public UserCategoryPermissionBuilder() {
    }

    public UserCategoryPermissionBuilder(User user,
        CategoryDetailsPermission categoryDetailPermissions) {
        this.user = user;

        this.categoryDetailPermissions = categoryDetailPermissions;

    }

    /**
     * Static factor method for UserCategoryPermissionBuilder
     */
    public static UserCategoryPermissionBuilder userCategoryPermission() {
        return new UserCategoryPermissionBuilder();
    }

    public UserCategoryPermissionBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public UserCategoryPermissionBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public UserCategoryPermissionBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public UserCategoryPermissionBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public UserCategoryPermissionBuilder user(User user) {
        this.user = user;
        return this;
    }

    public UserCategoryPermissionBuilder categoryDetailPermissions(
        CategoryDetailsPermission categoryDetailPermissions) {
        this.categoryDetailPermissions = categoryDetailPermissions;
        return this;
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

    public User getUser() {
        return user;
    }

    public CategoryDetailsPermission getCategoryDetailPermissions() {
        return categoryDetailPermissions;
    }

    /**
     * @return new UserCategoryPermission instance constructed based on the values that have been set into this builder
     */
    public UserCategoryPermission build() {
        UserCategoryPermission obj =
            new UserCategoryPermission(getUser(), getCategoryDetailPermissions());

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        return obj;
    }
}
