package com.fos.common.security.domain;

import com.fos.common.security.dto.CategoryDetailsPermissionDTO;
import com.fos.common.security.dto.UserCategoryPermissionDTO;
import com.fos.common.security.dto.UserDTO;

/**
  * Builder for UserCategoryPermissionDTO class.
  */
public class UserCategoryPermissionDTOBuilder {
    private UserDTO user;
    private CategoryDetailsPermissionDTO userCategoryDetailPermission;

    public UserCategoryPermissionDTOBuilder() {
    }

    /**
     * Static factor method for UserCategoryPermissionDTOBuilder
     */
    public static UserCategoryPermissionDTOBuilder userCategoryPermissionDTO() {
        return new UserCategoryPermissionDTOBuilder();
    }

    public UserCategoryPermissionDTOBuilder user(UserDTO user) {
        this.user = user;
        return this;
    }

    public UserCategoryPermissionDTOBuilder userCategoryDetailPermission(
        CategoryDetailsPermissionDTO userCategoryDetailPermission) {
        this.userCategoryDetailPermission = userCategoryDetailPermission;
        return this;
    }

    public UserDTO getUser() {
        return user;
    }

    public CategoryDetailsPermissionDTO getUserCategoryDetailPermission() {
        return userCategoryDetailPermission;
    }

    /**
     * @return new UserCategoryPermissionDTO instance constructed based on the values that have been set into this builder
     */
    public UserCategoryPermissionDTO build() {
        UserCategoryPermissionDTO obj = new UserCategoryPermissionDTO();

        obj.setUser(user);

        obj.setUserCategoryDetailPermission(userCategoryDetailPermission);

        return obj;
    }
}
