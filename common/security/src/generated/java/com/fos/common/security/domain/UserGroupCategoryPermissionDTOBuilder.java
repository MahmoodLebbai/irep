package com.fos.common.security.domain;

import com.fos.common.security.dto.CategoryDetailsPermissionDTO;
import com.fos.common.security.dto.UserGroupCategoryPermissionDTO;
import com.fos.common.security.dto.UserGroupDTO;

/**
  * Builder for UserGroupCategoryPermissionDTO class.
  */
public class UserGroupCategoryPermissionDTOBuilder {
    private UserGroupDTO userGroup;
    private CategoryDetailsPermissionDTO userCategoryDetailPermission;

    public UserGroupCategoryPermissionDTOBuilder() {
    }

    /**
     * Static factor method for UserGroupCategoryPermissionDTOBuilder
     */
    public static UserGroupCategoryPermissionDTOBuilder userGroupCategoryPermissionDTO() {
        return new UserGroupCategoryPermissionDTOBuilder();
    }

    public UserGroupCategoryPermissionDTOBuilder userGroup(
        UserGroupDTO userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    public UserGroupCategoryPermissionDTOBuilder userCategoryDetailPermission(
        CategoryDetailsPermissionDTO userCategoryDetailPermission) {
        this.userCategoryDetailPermission = userCategoryDetailPermission;
        return this;
    }

    public UserGroupDTO getUserGroup() {
        return userGroup;
    }

    public CategoryDetailsPermissionDTO getUserCategoryDetailPermission() {
        return userCategoryDetailPermission;
    }

    /**
     * @return new UserGroupCategoryPermissionDTO instance constructed based on the values that have been set into this builder
     */
    public UserGroupCategoryPermissionDTO build() {
        UserGroupCategoryPermissionDTO obj =
            new UserGroupCategoryPermissionDTO();

        obj.setUserGroup(userGroup);

        obj.setUserCategoryDetailPermission(userCategoryDetailPermission);

        return obj;
    }
}
