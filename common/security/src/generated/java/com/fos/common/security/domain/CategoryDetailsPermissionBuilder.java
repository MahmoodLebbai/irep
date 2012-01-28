package com.fos.common.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * Builder for CategoryDetailsPermission class.
  */
public class CategoryDetailsPermissionBuilder {
    private String categoryPermissionCode;
    private boolean createFlag;
    private boolean modifyFlag;
    private boolean deleteFlag;
    private boolean viewFlag;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private CategoryDetail categoryDetail;
    private List<UserCategoryPermission> userCategoryDetailPermissions =
        new ArrayList<UserCategoryPermission>();
    private List<UserGroupCategoryPermission> userGroupCategoryDetailPermissions =
        new ArrayList<UserGroupCategoryPermission>();

    public CategoryDetailsPermissionBuilder() {
    }

    /**
     * Static factor method for CategoryDetailsPermissionBuilder
     */
    public static CategoryDetailsPermissionBuilder categoryDetailsPermission() {
        return new CategoryDetailsPermissionBuilder();
    }

    public CategoryDetailsPermissionBuilder categoryPermissionCode(String val) {
        this.categoryPermissionCode = val;
        return this;
    }

    public CategoryDetailsPermissionBuilder createFlag(boolean val) {
        this.createFlag = val;
        return this;
    }

    public CategoryDetailsPermissionBuilder modifyFlag(boolean val) {
        this.modifyFlag = val;
        return this;
    }

    public CategoryDetailsPermissionBuilder deleteFlag(boolean val) {
        this.deleteFlag = val;
        return this;
    }

    public CategoryDetailsPermissionBuilder viewFlag(boolean val) {
        this.viewFlag = val;
        return this;
    }

    public CategoryDetailsPermissionBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public CategoryDetailsPermissionBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public CategoryDetailsPermissionBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public CategoryDetailsPermissionBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public CategoryDetailsPermissionBuilder categoryDetail(
        CategoryDetail categoryDetail) {
        this.categoryDetail = categoryDetail;
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserCategoryDetailPermissions}.
     */
    public CategoryDetailsPermissionBuilder addUserCategoryDetailPermission(
        UserCategoryPermission userCategoryDetailPermissionElement) {
        getUserCategoryDetailPermissions()
            .add(userCategoryDetailPermissionElement);
        return this;
    }

    /**
     * Adds an object to the to-many
     * association.
     * It is added the collection {@link #getUserGroupCategoryDetailPermissions}.
     */
    public CategoryDetailsPermissionBuilder addUserGroupCategoryDetailPermission(
        UserGroupCategoryPermission userGroupCategoryDetailPermissionElement) {
        getUserGroupCategoryDetailPermissions()
            .add(userGroupCategoryDetailPermissionElement);
        return this;
    }

    public String getCategoryPermissionCode() {
        return categoryPermissionCode;
    }

    public boolean isCreateFlag() {
        return createFlag;
    }

    public boolean isModifyFlag() {
        return modifyFlag;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public boolean isViewFlag() {
        return viewFlag;
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

    public CategoryDetail getCategoryDetail() {
        return categoryDetail;
    }

    public List<UserCategoryPermission> getUserCategoryDetailPermissions() {
        return userCategoryDetailPermissions;
    }

    public List<UserGroupCategoryPermission> getUserGroupCategoryDetailPermissions() {
        return userGroupCategoryDetailPermissions;
    }

    /**
     * @return new CategoryDetailsPermission instance constructed based on the values that have been set into this builder
     */
    public CategoryDetailsPermission build() {
        CategoryDetailsPermission obj = new CategoryDetailsPermission();

        obj.setCategoryPermissionCode(categoryPermissionCode);

        obj.setCreateFlag(createFlag);

        obj.setModifyFlag(modifyFlag);

        obj.setDeleteFlag(deleteFlag);

        obj.setViewFlag(viewFlag);

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.setCategoryDetail(categoryDetail);

        obj.getUserCategoryDetailPermissions()
           .addAll(userCategoryDetailPermissions);

        obj.getUserGroupCategoryDetailPermissions()
           .addAll(userGroupCategoryDetailPermissions);

        return obj;
    }
}
