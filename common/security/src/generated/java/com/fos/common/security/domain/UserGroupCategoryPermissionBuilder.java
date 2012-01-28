package com.fos.common.security.domain;

import java.util.Date;

/**
  * Builder for UserGroupCategoryPermission class.
  */
public class UserGroupCategoryPermissionBuilder {
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private UserGroup userGroup;
    private CategoryDetailsPermission categoryDetailPermissions;

    public UserGroupCategoryPermissionBuilder() {
    }

    public UserGroupCategoryPermissionBuilder(UserGroup userGroup,
        CategoryDetailsPermission categoryDetailPermissions) {
        this.userGroup = userGroup;

        this.categoryDetailPermissions = categoryDetailPermissions;

    }

    /**
     * Static factor method for UserGroupCategoryPermissionBuilder
     */
    public static UserGroupCategoryPermissionBuilder userGroupCategoryPermission() {
        return new UserGroupCategoryPermissionBuilder();
    }

    public UserGroupCategoryPermissionBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public UserGroupCategoryPermissionBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public UserGroupCategoryPermissionBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public UserGroupCategoryPermissionBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public UserGroupCategoryPermissionBuilder userGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    public UserGroupCategoryPermissionBuilder categoryDetailPermissions(
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

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public CategoryDetailsPermission getCategoryDetailPermissions() {
        return categoryDetailPermissions;
    }

    /**
     * @return new UserGroupCategoryPermission instance constructed based on the values that have been set into this builder
     */
    public UserGroupCategoryPermission build() {
        UserGroupCategoryPermission obj =
            new UserGroupCategoryPermission(getUserGroup(),
                getCategoryDetailPermissions());

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        return obj;
    }
}
