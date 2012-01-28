package com.fos.common.security.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
* Data transfer object for UserGroupCategoryPermissionDTO.
*/
public class UserGroupCategoryPermissionDTO implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private UserGroupDTO userGroup;
    private CategoryDetailsPermissionDTO userCategoryDetailPermission;

    public UserGroupCategoryPermissionDTO() {
    }

    @XmlElement()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement()
    public UserGroupDTO getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroupDTO userGroup) {
        this.userGroup = userGroup;
    }

    @XmlElement()
    public CategoryDetailsPermissionDTO getUserCategoryDetailPermission() {
        return userCategoryDetailPermission;
    }

    public void setUserCategoryDetailPermission(
        CategoryDetailsPermissionDTO userCategoryDetailPermission) {
        this.userCategoryDetailPermission = userCategoryDetailPermission;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {

            // this shouldn't happen, since we are Cloneable
            throw new InternalError();
        }
    }
}
