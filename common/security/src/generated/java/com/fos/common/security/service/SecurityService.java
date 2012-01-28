package com.fos.common.security.service;

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
 * Generated interface for the Service SecurityService.
 */
public interface SecurityService {
    public static final String BEAN_ID = "securityService";

    public ApplicationsDTO addApplication(ApplicationsDTO application)
        throws com.fos.common.security.exception.SecurityException;

    public ApplicationsDTO updateApplication(ApplicationsDTO application)
        throws com.fos.common.security.exception.SecurityException;

    public List<ApplicationsDTO> findApplications()
        throws com.fos.common.security.exception.SecurityException;

    public ApplicationsDTO findApplication(Long applicationId)
        throws com.fos.common.security.exception.SecurityException;

    public ApplicationsDTO findApplicationByCode(String applicationCode)
        throws com.fos.common.security.exception.SecurityException;

    public ApplicationsDTO findApplicationByName(String applicationName)
        throws com.fos.common.security.exception.SecurityException;

    public void removeApplication(ApplicationsDTO applicationDTO)
        throws com.fos.common.security.exception.SecurityException;

    public void removeAllApplication()
        throws com.fos.common.security.exception.SecurityException;

    public ApplicationsDTO addModule(ModulesDTO module)
        throws com.fos.common.security.exception.SecurityException;

    public ApplicationsDTO addModules(List<ModulesDTO> modules)
        throws com.fos.common.security.exception.SecurityException;

    public ApplicationsDTO updateModule(ModulesDTO module)
        throws com.fos.common.security.exception.SecurityException;

    public ApplicationsDTO updateModules(List<ModulesDTO> modules)
        throws com.fos.common.security.exception.SecurityException;

    public void deleteModule(ModulesDTO module)
        throws com.fos.common.security.exception.SecurityException;

    public void deleteModules(List<ModulesDTO> modules)
        throws com.fos.common.security.exception.SecurityException;

    public ModulesDTO findModule(Long applicationId, Long moduleId)
        throws com.fos.common.security.exception.SecurityException;

    public ModulesDTO findModule(Long moduleId)
        throws com.fos.common.security.exception.SecurityException;

    public ModulesDTO findModuleByCode(String moduleCode)
        throws com.fos.common.security.exception.SecurityException;

    public ModulesDTO findModuleByName(String moduleName)
        throws com.fos.common.security.exception.SecurityException;

    public ApplicationsDTO addOperation(OperationDTO module)
        throws com.fos.common.security.exception.SecurityException;

    public ApplicationsDTO addOperations(List<OperationDTO> modules)
        throws com.fos.common.security.exception.SecurityException;

    public ApplicationsDTO updateOperation(OperationDTO module)
        throws com.fos.common.security.exception.SecurityException;

    public ApplicationsDTO updateOperations(List<OperationDTO> modules)
        throws com.fos.common.security.exception.SecurityException;

    public void deleteOperation(OperationDTO module)
        throws com.fos.common.security.exception.SecurityException;

    public void deleteOperations(List<OperationDTO> modules)
        throws com.fos.common.security.exception.SecurityException;

    public OperationDTO findOperation(Long applicationId, Long moduleId,
        Long operationId)
        throws com.fos.common.security.exception.SecurityException;

    public OperationDTO findOperation(Long operationId)
        throws com.fos.common.security.exception.SecurityException;

    public OperationDTO findOperationByCode(String operationCode)
        throws com.fos.common.security.exception.SecurityException;

    public OperationDTO findOperationByName(String operationName)
        throws com.fos.common.security.exception.SecurityException;

    public OperationDTO addPermissionToOperation(OperationDTO operation,
        List<PermissionDTO> permissions)
        throws com.fos.common.security.exception.SecurityException;

    public void deletePermissionToOperation(OperationDTO operation,
        List<PermissionDTO> permissions)
        throws com.fos.common.security.exception.SecurityException;

    public PermissionDTO addPermission(PermissionDTO permission)
        throws com.fos.common.security.exception.SecurityException;

    public PermissionDTO modifyPermission(PermissionDTO permission)
        throws com.fos.common.security.exception.SecurityException;

    public void deletePermission(PermissionDTO permission)
        throws com.fos.common.security.exception.SecurityException;

    public RoleDTO addRole(RoleDTO role)
        throws com.fos.common.security.exception.SecurityException;

    public RoleDTO modifyRole(RoleDTO role)
        throws com.fos.common.security.exception.SecurityException;

    public void deleteRole(RoleDTO role)
        throws com.fos.common.security.exception.SecurityException;

    public RoleDTO addOperationPermissionToRole(RoleDTO role,
        List<Permission> permissions)
        throws com.fos.common.security.exception.SecurityException;

    public RoleDTO deleteOperationPermissionToRole(RoleDTO role,
        List<Permission> permissions)
        throws com.fos.common.security.exception.SecurityException;

    public RoleDTO addOperationPermissionToRole(Long roleId,
        List<Permission> permissions)
        throws com.fos.common.security.exception.SecurityException;

    public RoleDTO deleteOperationPermissionToRole(Long roleId,
        List<Permission> permissions)
        throws com.fos.common.security.exception.SecurityException;

    public RoleDTO addOperationPermissionToRole(String roleCode,
        List<Permission> permissions)
        throws com.fos.common.security.exception.SecurityException;

    public RoleDTO deleteOperationPermissionToRole(String roleCode,
        List<Permission> permissions)
        throws com.fos.common.security.exception.SecurityException;

    public List<RoleDTO> findAllRoles()
        throws com.fos.common.security.exception.SecurityException;

    public RoleDTO findRole(long roleId)
        throws com.fos.common.security.exception.SecurityException;

    public RoleDTO findRoleByCode(String roleCode)
        throws com.fos.common.security.exception.SecurityException;

    public RoleDTO findRoleByName(String roleName)
        throws com.fos.common.security.exception.SecurityException;

    public CategoryDTO addCategory(CategoryDTO category)
        throws com.fos.common.security.exception.SecurityException;

    public CategoryDTO modifyCategory(CategoryDTO category)
        throws com.fos.common.security.exception.SecurityException;

    public void deleteCategory(CategoryDTO category)
        throws com.fos.common.security.exception.SecurityException;

    public CategoryDTO addCategoryDetails(
        List<CategoryDetailDTO> categoryDetail)
        throws com.fos.common.security.exception.SecurityException;

    public CategoryDTO modifyCategoryDetails(
        List<CategoryDetailDTO> categoryDetail)
        throws com.fos.common.security.exception.SecurityException;

    public CategoryDTO deleteCategoryDetails(
        List<CategoryDetailDTO> categoryDetail)
        throws com.fos.common.security.exception.SecurityException;

    public CategoryDetailDTO addCategoryDetailsPermission(
        List<CategoryDetailsPermissionDTO> categoryDetailPermissions)
        throws com.fos.common.security.exception.SecurityException;

    public CategoryDetailDTO modifyCategoryDetailsPermission(
        List<CategoryDetailsPermissionDTO> categoryDetailPermissions)
        throws com.fos.common.security.exception.SecurityException;

    public void deleteCategoryDetailsPermission(
        List<CategoryDetailsPermissionDTO> categoryDetailPermissions)
        throws com.fos.common.security.exception.SecurityException;

    public UserDelegationDTO addUserDelegation(UserDelegationDTO userDelegation)
        throws com.fos.common.security.exception.SecurityException;

    public UserDelegationDTO modifyUserDelegation(
        UserDelegationDTO userDelegation)
        throws com.fos.common.security.exception.SecurityException;

    public void deleteUserDelegation(UserDelegationDTO userDelegation)
        throws com.fos.common.security.exception.SecurityException;

    public UserDTO createUser(UserDTO user)
        throws com.fos.common.security.exception.SecurityException;

    public UserDTO modifyUser(UserDTO user)
        throws com.fos.common.security.exception.SecurityException;

    public void deleteUser(UserDTO user)
        throws com.fos.common.security.exception.SecurityException;

    public UserDTO addRoleToUser(UserDTO user, List<RoleDTO> roles)
        throws com.fos.common.security.exception.SecurityException;

    public UserDTO deleteRoleToUser(UserDTO user, List<RoleDTO> roles)
        throws com.fos.common.security.exception.SecurityException;

    public UserDTO addCategoryDetailPermissionToUser(UserDTO user,
        List<CategoryDetailsPermissionDTO> categoryDetailPermission)
        throws com.fos.common.security.exception.SecurityException;

    public UserDTO deleteCategoryDetailPermissionToUser(UserDTO user,
        List<CategoryDetailsPermissionDTO> categoryDetailPermission)
        throws com.fos.common.security.exception.SecurityException;

    public List<UserDTO> findAllUsers()
        throws com.fos.common.security.exception.SecurityException;

    public List<UserDTO> findUsersByRole(long roleId)
        throws com.fos.common.security.exception.SecurityException;

    public List<UserDTO> findUsersByRoleCode(String roleCode)
        throws com.fos.common.security.exception.SecurityException;

    public List<UserDTO> findUsersByRoleName(String roleName)
        throws com.fos.common.security.exception.SecurityException;

    public List<UserDTO> findUserByGroupId(long userGroupId)
        throws com.fos.common.security.exception.SecurityException;

    public UserDTO findUserByUserId(String userId)
        throws com.fos.common.security.exception.SecurityException;

    public UserDTO findUser(String userId, String password)
        throws com.fos.common.security.exception.SecurityException;

    public UserDTO findUserById(long userId)
        throws com.fos.common.security.exception.SecurityException;

    public DepartmentDTO createDepartment(DepartmentDTO department)
        throws com.fos.common.security.exception.SecurityException;

    public DepartmentDTO modifyDepartment(DepartmentDTO department)
        throws com.fos.common.security.exception.SecurityException;

    public void deleteDepartment(DepartmentDTO department)
        throws com.fos.common.security.exception.SecurityException;

    public UserGroupDTO createUserGroup(UserGroupDTO userGroup)
        throws com.fos.common.security.exception.SecurityException;

    public UserGroupDTO modifyUserGroup(UserGroupDTO userGroup)
        throws com.fos.common.security.exception.SecurityException;

    public void deleteUserGroup(UserGroupDTO userGroup)
        throws com.fos.common.security.exception.SecurityException;

    public UserGroupDTO addRoleToUserGroup(UserGroupDTO userGroup,
        List<RoleDTO> roles)
        throws com.fos.common.security.exception.SecurityException;

    public UserGroupDTO deleteRoleToUserGroup(UserGroupDTO userGroup,
        List<RoleDTO> roles)
        throws com.fos.common.security.exception.SecurityException;

    public UserGroupDTO addCategoryDetailPermissionToUserGroup(
        UserGroupDTO user,
        List<CategoryDetailsPermissionDTO> categoryDetailPermission)
        throws com.fos.common.security.exception.SecurityException;

    public UserGroupDTO deleteCategoryDetailPermissionToUserGroup(
        UserGroupDTO user,
        List<CategoryDetailsPermissionDTO> categoryDetailPermission)
        throws com.fos.common.security.exception.SecurityException;

    public List<UserGroupDTO> findAllUserGroups()
        throws com.fos.common.security.exception.SecurityException;

    public UserGroupDTO findUserGroupByName(String userGroupName)
        throws com.fos.common.security.exception.SecurityException;

    public UserGroupDTO findUserGroupById(long userGroupId)
        throws com.fos.common.security.exception.SecurityException;
}
