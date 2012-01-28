package com.fos.irep.web.application.irepapplication.manager;


/**
 * Definition of test methods to implement.
 */
public interface SecurityManagerTestBase {
    public void testAddApplication() throws Exception;

    public void testUpdateApplication() throws Exception;

    public void testFindApplications() throws Exception;

    public void testFindApplication() throws Exception;

    public void testFindApplicationByCode() throws Exception;

    public void testFindApplicationByName() throws Exception;

    public void testRemoveApplication() throws Exception;

    public void testRemoveAllApplication() throws Exception;

    public void testAddModule() throws Exception;

    public void testAddModules() throws Exception;

    public void testUpdateModule() throws Exception;

    public void testUpdateModules() throws Exception;

    public void testDeleteModule() throws Exception;

    public void testDeleteModules() throws Exception;

    public void testFindModule() throws Exception;

    public void testFindModuleByCode() throws Exception;

    public void testFindModuleByName() throws Exception;

    public void testAddOperation() throws Exception;

    public void testAddOperations() throws Exception;

    public void testUpdateOperation() throws Exception;

    public void testUpdateOperations() throws Exception;

    public void testDeleteOperation() throws Exception;

    public void testDeleteOperations() throws Exception;

    public void testFindOperation() throws Exception;

    public void testFindOperationByCode() throws Exception;

    public void testFindOperationByName() throws Exception;

    public void testAddPermissionToOperation() throws Exception;

    public void testDeletePermissionToOperation() throws Exception;

    public void testAddPermission() throws Exception;

    public void testModifyPermission() throws Exception;

    public void testDeletePermission() throws Exception;

    public void testAddRole() throws Exception;

    public void testModifyRole() throws Exception;

    public void testDeleteRole() throws Exception;

    public void testAddOperationPermissionToRole() throws Exception;

    public void testDeleteOperationPermissionToRole() throws Exception;

    public void testFindAllRoles() throws Exception;

    public void testFindRole() throws Exception;

    public void testFindRoleByCode() throws Exception;

    public void testFindRoleByName() throws Exception;

    public void testAddCategory() throws Exception;

    public void testModifyCategory() throws Exception;

    public void testDeleteCategory() throws Exception;

    public void testAddCategoryDetails() throws Exception;

    public void testModifyCategoryDetails() throws Exception;

    public void testDeleteCategoryDetails() throws Exception;

    public void testAddCategoryDetailsPermission() throws Exception;

    public void testModifyCategoryDetailsPermission() throws Exception;

    public void testDeleteCategoryDetailsPermission() throws Exception;

    public void testAddUserDelegation() throws Exception;

    public void testModifyUserDelegation() throws Exception;

    public void testDeleteUserDelegation() throws Exception;

    public void testCreateUser() throws Exception;

    public void testModifyUser() throws Exception;

    public void testDeleteUser() throws Exception;

    public void testAddRoleToUser() throws Exception;

    public void testDeleteRoleToUser() throws Exception;

    public void testAddCategoryDetailPermissionToUser() throws Exception;

    public void testDeleteCategoryDetailPermissionToUser() throws Exception;

    public void testFindAllUsers() throws Exception;

    public void testFindUsersByRole() throws Exception;

    public void testFindUsersByRoleCode() throws Exception;

    public void testFindUsersByRoleName() throws Exception;

    public void testFindUserByGroupId() throws Exception;

    public void testFindUserByUserId() throws Exception;

    public void testFindUser() throws Exception;

    public void testFindUserById() throws Exception;

    public void testCreateDepartment() throws Exception;

    public void testModifyDepartment() throws Exception;

    public void testDeleteDepartment() throws Exception;

    public void testCreateUserGroup() throws Exception;

    public void testModifyUserGroup() throws Exception;

    public void testDeleteUserGroup() throws Exception;

    public void testAddRoleToUserGroup() throws Exception;

    public void testDeleteRoleToUserGroup() throws Exception;

    public void testAddCategoryDetailPermissionToUserGroup() throws Exception;

    public void testDeleteCategoryDetailPermissionToUserGroup()
        throws Exception;

    public void testFindAllUserGroups() throws Exception;

    public void testFindUserGroupByName() throws Exception;

    public void testFindUserGroupById() throws Exception;
}
