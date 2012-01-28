package com.fos.irep.web.application.irepapplication.manager;

import java.util.List;

import com.fos.common.security.domain.Permission;
import com.fos.common.security.dto.ApplicationsDTO;
import com.fos.common.security.dto.CategoryDTO;
import com.fos.common.security.dto.CategoryDetailDTO;
import com.fos.common.security.dto.CategoryDetailsPermissionDTO;
import com.fos.common.security.dto.DepartmentDTO;
import com.fos.common.security.dto.ModulesDTO;
import com.fos.common.security.dto.OperationDTO;
import com.fos.common.security.dto.PermissionDTO;
import com.fos.common.security.dto.RoleDTO;
import com.fos.common.security.dto.UserDTO;
import com.fos.common.security.dto.UserDelegationDTO;
import com.fos.common.security.dto.UserGroupDTO;

/**
 * Generated interface for the Service SecurityManager.
 */
public interface SecurityManager {
    public static final String BEAN_ID = "securityManager";

    public ApplicationsDTO addApplication(ApplicationsDTO application)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ApplicationsDTO updateApplication(ApplicationsDTO application)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public List<ApplicationsDTO> findApplications()
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ApplicationsDTO findApplication(Long applicationId)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ApplicationsDTO findApplicationByCode(String applicationCode)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ApplicationsDTO findApplicationByName(String applicationName)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void removeApplication(ApplicationsDTO applicationDTO)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void removeAllApplication()
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ApplicationsDTO addModule(ModulesDTO module)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ApplicationsDTO addModules(List<ModulesDTO> modules)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ApplicationsDTO updateModule(ModulesDTO module)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ApplicationsDTO updateModules(List<ModulesDTO> modules)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deleteModule(ModulesDTO module)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deleteModules(List<ModulesDTO> modules)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ModulesDTO findModule(Long applicationId, Long moduleId)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ModulesDTO findModule(Long moduleId)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ModulesDTO findModuleByCode(String moduleCode)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ModulesDTO findModuleByName(String moduleName)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ApplicationsDTO addOperation(OperationDTO module)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ApplicationsDTO addOperations(List<OperationDTO> modules)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ApplicationsDTO updateOperation(OperationDTO module)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public ApplicationsDTO updateOperations(List<OperationDTO> modules)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deleteOperation(OperationDTO module)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deleteOperations(List<OperationDTO> modules)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public OperationDTO findOperation(Long applicationId, Long moduleId,
        Long operationId)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public OperationDTO findOperation(Long operationId)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public OperationDTO findOperationByCode(String operationCode)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public OperationDTO findOperationByName(String operationName)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public OperationDTO addPermissionToOperation(OperationDTO operation,
        List<PermissionDTO> permissions)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deletePermissionToOperation(OperationDTO operation,
        List<PermissionDTO> permissions)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public PermissionDTO addPermission(PermissionDTO permission)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public PermissionDTO modifyPermission(PermissionDTO permission)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deletePermission(PermissionDTO permission)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public RoleDTO addRole(RoleDTO role)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public RoleDTO modifyRole(RoleDTO role)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deleteRole(RoleDTO role)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public RoleDTO addOperationPermissionToRole(RoleDTO role,
        List<Permission> permissions)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public RoleDTO deleteOperationPermissionToRole(RoleDTO role,
        List<Permission> permissions)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public RoleDTO addOperationPermissionToRole(Long roleId,
        List<Permission> permissions)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public RoleDTO deleteOperationPermissionToRole(Long roleId,
        List<Permission> permissions)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public RoleDTO addOperationPermissionToRole(String roleCode,
        List<Permission> permissions)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public RoleDTO deleteOperationPermissionToRole(String roleCode,
        List<Permission> permissions)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public List<RoleDTO> findAllRoles()
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public RoleDTO findRole(long roleId)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public RoleDTO findRoleByCode(String roleCode)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public RoleDTO findRoleByName(String roleName)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public CategoryDTO addCategory(CategoryDTO category)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public CategoryDTO modifyCategory(CategoryDTO category)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deleteCategory(CategoryDTO category)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public CategoryDTO addCategoryDetails(
        List<CategoryDetailDTO> categoryDetail)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public CategoryDTO modifyCategoryDetails(
        List<CategoryDetailDTO> categoryDetail)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public CategoryDTO deleteCategoryDetails(
        List<CategoryDetailDTO> categoryDetail)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public CategoryDetailDTO addCategoryDetailsPermission(
        List<CategoryDetailsPermissionDTO> categoryDetailPermissions)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public CategoryDetailDTO modifyCategoryDetailsPermission(
        List<CategoryDetailsPermissionDTO> categoryDetailPermissions)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deleteCategoryDetailsPermission(
        List<CategoryDetailsPermissionDTO> categoryDetailPermissions)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserDelegationDTO addUserDelegation(UserDelegationDTO userDelegation)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserDelegationDTO modifyUserDelegation(
        UserDelegationDTO userDelegation)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deleteUserDelegation(UserDelegationDTO userDelegation)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserDTO createUser(UserDTO user)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserDTO modifyUser(UserDTO user)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deleteUser(UserDTO user)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserDTO addRoleToUser(UserDTO user, List<RoleDTO> roles)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserDTO deleteRoleToUser(UserDTO user, List<RoleDTO> roles)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserDTO addCategoryDetailPermissionToUser(UserDTO user,
        List<CategoryDetailsPermissionDTO> categoryDetailPermission)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserDTO deleteCategoryDetailPermissionToUser(UserDTO user,
        List<CategoryDetailsPermissionDTO> categoryDetailPermission)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public List<UserDTO> findAllUsers()
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public List<UserDTO> findUsersByRole(long roleId)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public List<UserDTO> findUsersByRoleCode(String roleCode)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public List<UserDTO> findUsersByRoleName(String roleName)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public List<UserDTO> findUserByGroupId(long userGroupId)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserDTO findUserByUserId(String userId)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserDTO findUser(String userId, String password)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserDTO findUserById(long userId)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public DepartmentDTO createDepartment(DepartmentDTO department)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public DepartmentDTO modifyDepartment(DepartmentDTO department)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deleteDepartment(DepartmentDTO department)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserGroupDTO createUserGroup(UserGroupDTO userGroup)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserGroupDTO modifyUserGroup(UserGroupDTO userGroup)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public void deleteUserGroup(UserGroupDTO userGroup)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserGroupDTO addRoleToUserGroup(UserGroupDTO userGroup,
        List<RoleDTO> roles)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserGroupDTO deleteRoleToUserGroup(UserGroupDTO userGroup,
        List<RoleDTO> roles)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserGroupDTO addCategoryDetailPermissionToUserGroup(
        UserGroupDTO user,
        List<CategoryDetailsPermissionDTO> categoryDetailPermission)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserGroupDTO deleteCategoryDetailPermissionToUserGroup(
        UserGroupDTO user,
        List<CategoryDetailsPermissionDTO> categoryDetailPermission)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public List<UserGroupDTO> findAllUserGroups()
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserGroupDTO findUserGroupByName(String userGroupName)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

    public UserGroupDTO findUserGroupById(long userGroupId)
        throws com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;
}
