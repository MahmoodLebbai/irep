package com.fos.irep.web.application.irepapplication.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.fos.common.security.service.SecurityService;
import com.fos.irep.web.application.irepapplication.exception.SecurityManagerException;

/**
 * Implementation of SecurityManager.
 */
@Service("securityManager")
public class SecurityManagerImpl extends SecurityManagerImplBase {
	
	
	@Autowired
	SecurityService securityService;
	
	
	
    public SecurityManagerImpl() {
    }



	/**
	 * @return the securityService
	 */
	public SecurityService getSecurityService() {
		return securityService;
	}



	/**
	 * @param securityService the securityService to set
	 */
	public void setSecurityService(SecurityService securityService) {
		this.securityService = securityService;
	}



	@Override
	public ApplicationsDTO addApplication(ApplicationsDTO application)
			throws SecurityManagerException {
		ApplicationsDTO addedApplication = null;
		try
		{
			addedApplication = this.getSecurityService().addApplication(application);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding the application. Error Message = " , ex);
		}
		return addedApplication;
	}



	@Override
	public ApplicationsDTO updateApplication(ApplicationsDTO application)
			throws SecurityManagerException {
		ApplicationsDTO updatedApplication = null;
		try
		{
			updatedApplication = this.getSecurityService().updateApplication(application);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while update the application. Error Message = " , ex);
		}
		return updatedApplication;
	}



	@Override
	public List<ApplicationsDTO> findApplications()
			throws SecurityManagerException {
		
		List<ApplicationsDTO> findApplicationList = null;
		try
		{
			findApplicationList = this.getSecurityService().findApplications();
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reterving the application. Error Message = " , ex);
		}
		return findApplicationList;
	}



	@Override
	public ApplicationsDTO findApplication(Long applicationId)
			throws SecurityManagerException {

	    ApplicationsDTO findApplication = null;
		try
		{
			findApplication = this.getSecurityService().findApplication(applicationId);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reterving the application. Error Message = " , ex);
		}
		return findApplication;
	}



	@Override
	public ApplicationsDTO findApplicationByCode(String applicationCode)
			throws SecurityManagerException {
		ApplicationsDTO findApplication = null;
		try
		{
			findApplication = this.getSecurityService().findApplicationByCode(applicationCode);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reterving the application. Error Message = " , ex);
		}
		return findApplication;
	}



	@Override
	public ApplicationsDTO findApplicationByName(String applicationName)
			throws SecurityManagerException {
		ApplicationsDTO findApplication = null;
		try
		{
			findApplication = this.getSecurityService().findApplicationByName(applicationName);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reterving the application. Error Message = " , ex);
		}
		return findApplication;
	}



	@Override
	public void removeApplication(ApplicationsDTO applicationDTO)
			throws SecurityManagerException {
		try
		{
			this.getSecurityService().removeApplication(applicationDTO);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while removing the application. Error Message = " , ex);
		}
		
	}



	@Override
	public void removeAllApplication() throws SecurityManagerException {
		try
		{
			this.getSecurityService().removeAllApplication();
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while removing the application. Error Message = " , ex);
		}
		
	}



	@Override
	public ApplicationsDTO addModule(ModulesDTO module)
			throws SecurityManagerException {
		ApplicationsDTO addedApplicationModule = null;
		try
		{
			addedApplicationModule = this.getSecurityService().addModule(module);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding Module to the application. Error Message = " , ex);
		}
		return addedApplicationModule;
	}



	@Override
	public ApplicationsDTO addModules(List<ModulesDTO> modules)
			throws SecurityManagerException {
		ApplicationsDTO addedApplicationModules = null;
		try
		{
			addedApplicationModules = this.getSecurityService().addModules(modules);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding Modules to the application. Error Message = " , ex);
		}
		return addedApplicationModules;
	}



	@Override
	public ApplicationsDTO updateModule(ModulesDTO module)
			throws SecurityManagerException {
		ApplicationsDTO updateApplicationModule = null;
		try
		{
			updateApplicationModule = this.getSecurityService().updateModule(module);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while updating Module to the application. Error Message = " , ex);
		}
		return updateApplicationModule;
	}



	@Override
	public ApplicationsDTO updateModules(List<ModulesDTO> modules)
			throws SecurityManagerException {
		ApplicationsDTO updateApplicationModules = null;
		try
		{
			updateApplicationModules = this.getSecurityService().updateModules(modules);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while updating Modules to the application. Error Message = " , ex);
		}
		return updateApplicationModules;
	}



	@Override
	public void deleteModule(ModulesDTO module) throws SecurityManagerException {
		
		try
		{
			this.getSecurityService().deleteModule(module);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while delete Module to the application. Error Message = " , ex);
		}
		
		
	}



	@Override
	public void deleteModules(List<ModulesDTO> modules)
			throws SecurityManagerException {
		try
		{
			this.getSecurityService().deleteModules(modules);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while delete Modules to the application. Error Message = " , ex);
		}
		
	}



	@Override
	public ModulesDTO findModule(Long applicationId, Long moduleId)
			throws SecurityManagerException {
		
		ModulesDTO findModule = null;
		try
		{
			findModule = this.getSecurityService().findModule(applicationId,moduleId);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reterving the application to the Module. Error Message = " , ex);
		}
		return findModule;
	}



	@Override
	public ModulesDTO findModule(Long moduleId) throws SecurityManagerException {
		ModulesDTO findModule = null;
		try
		{
			findModule = this.getSecurityService().findModule(moduleId);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reterving the application to the Module. Error Message = " , ex);
		}
		return findModule;
	}



	@Override
	public ModulesDTO findModuleByCode(String moduleCode)
			throws SecurityManagerException {
		ModulesDTO findModule = null;
		try
		{
			findModule = this.getSecurityService().findModuleByCode(moduleCode);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reterving the application to the Module. Error Message = " , ex);
		}
		return findModule;
	}



	@Override
	public ModulesDTO findModuleByName(String moduleName)
			throws SecurityManagerException {
		ModulesDTO findModule = null;
		try
		{
			findModule = this.getSecurityService().findModuleByName(moduleName);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reterving the application to the Module. Error Message = " , ex);
		}
		return findModule;
	}



	@Override
	public ApplicationsDTO addOperation(OperationDTO operation)
			throws SecurityManagerException {
		ApplicationsDTO addedOperation = null;
		try
		{
			addedOperation = this.getSecurityService().addOperation(operation);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding Operation to the Module. Error Message = " , ex);
		}
		return addedOperation;
	}



	@Override
	public ApplicationsDTO addOperations(List<OperationDTO> operations)
			throws SecurityManagerException {
		ApplicationsDTO addedOperation = null;
		try
		{
			addedOperation = this.getSecurityService().addOperations(operations);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding Operations to the Module. Error Message = " , ex);
		}
		return addedOperation;
	}



	@Override
	public ApplicationsDTO updateOperation(OperationDTO operation)
			throws SecurityManagerException {
		ApplicationsDTO updatedOperation = null;
		try
		{
			updatedOperation = this.getSecurityService().updateOperation(operation);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while Updating Operations to the Module. Error Message = " , ex);
		}
		return updatedOperation;
	}



	@Override
	public ApplicationsDTO updateOperations(List<OperationDTO> operations)
			throws SecurityManagerException {
		ApplicationsDTO updatedOperations = null;
		try
		{
			updatedOperations = this.getSecurityService().updateOperations(operations);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while Updating Operations to the Module. Error Message = " , ex);
		}
		return updatedOperations;
	}



	@Override
	public void deleteOperation(OperationDTO operation)
			throws SecurityManagerException {
		try
		{
			this.getSecurityService().deleteOperation(operation);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while Deleting Operations to the Module. Error Message = " , ex);
		}
		
	}



	@Override
	public void deleteOperations(List<OperationDTO> operations)
			throws SecurityManagerException {
		try
		{
			this.getSecurityService().deleteOperations(operations);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while Deleting Operations to the Module. Error Message = " , ex);
		}
		
	}



	@Override
	public OperationDTO findOperation(Long applicationId, Long moduleId,
			Long operationId) throws SecurityManagerException {
		OperationDTO findOperation = null;
		try
		{
			findOperation = this.getSecurityService().findOperation(applicationId,moduleId,operationId);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reterving the operation from the Module. Error Message = " , ex);
		}
		return findOperation;
	}



	@Override
	public OperationDTO findOperation(Long operationId)
			throws SecurityManagerException {
		OperationDTO findOperation = null;
		try
		{
			findOperation = this.getSecurityService().findOperation(operationId);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reterving the operation from the Module. Error Message = " , ex);
		}
		return findOperation;
	}



	@Override
	public OperationDTO findOperationByCode(String operationCode)
			throws SecurityManagerException {
		OperationDTO findOperation = null;
		try
		{
			findOperation = this.getSecurityService().findOperationByCode(operationCode);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reterving the operation from the Module. Error Message = " , ex);
		}
		return findOperation;
	}



	@Override
	public OperationDTO findOperationByName(String operationName)
			throws SecurityManagerException {
		OperationDTO findOperation = null;
		try
		{
			findOperation = this.getSecurityService().findOperationByName(operationName);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reterving the operation from the Module. Error Message = " , ex);
		}
		return findOperation;
	}



	@Override
	public OperationDTO addPermissionToOperation(OperationDTO operation,
			List<PermissionDTO> permissions) throws SecurityManagerException  {
		OperationDTO addedPermissionsToOperation = null;
		try
		{
			addedPermissionsToOperation = this.getSecurityService().addPermissionToOperation(operation,permissions);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding permission to the operation. Error Message = " , ex);
		}
		return addedPermissionsToOperation;
	}



	@Override
	public void deletePermissionToOperation(OperationDTO operation,
			List<PermissionDTO> permissions) throws SecurityManagerException {
		try
		{
			this.getSecurityService().deletePermissionToOperation(operation,permissions);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting permission to the operation. Error Message = " , ex);
		}
		
	}



	@Override
	public PermissionDTO addPermission(PermissionDTO permission)
			throws SecurityManagerException {
		PermissionDTO addedPermission = null;
		try
		{
			addedPermission = this.getSecurityService().addPermission(permission);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding permission for an operation. Error Message = " , ex);
		}
		return addedPermission;
	}



	@Override
	public PermissionDTO modifyPermission(PermissionDTO permission)
			throws SecurityManagerException {
		PermissionDTO modifiedPermission = null;
		try
		{
			modifiedPermission = this.getSecurityService().modifyPermission(permission);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while updating permission for an operation. Error Message = " , ex);
		}
		return modifiedPermission;
	}



	@Override
	public void deletePermission(PermissionDTO permission)
			throws SecurityManagerException {
		try
		{
			this.getSecurityService().deletePermission(permission);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting permission for an operation. Error Message = " , ex);
		}
		
	}



	@Override
	public RoleDTO addRole(RoleDTO role) throws SecurityManagerException {
		RoleDTO addedRole = null;
		try
		{
			addedRole = this.getSecurityService().addRole(role);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding role. Error Message = " , ex);
		}
		return addedRole;
	}



	@Override
	public RoleDTO modifyRole(RoleDTO role) throws SecurityManagerException {
		RoleDTO modifiedRole = null;
		try
		{
			modifiedRole = this.getSecurityService().modifyRole(role);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while Modifying role. Error Message = " , ex);
		}
		return modifiedRole;
	}



	@Override
	public void deleteRole(RoleDTO role) throws SecurityManagerException {
		try
		{
			this.getSecurityService().deleteRole(role);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while Deleting role. Error Message = " , ex);
		}
		
	}



	@Override
	public RoleDTO addOperationPermissionToRole(RoleDTO role,
			List<Permission> permissions) throws SecurityManagerException {
		RoleDTO addedOperationPermissionToRole = null;
		try
		{
			addedOperationPermissionToRole = this.getSecurityService().addOperationPermissionToRole(role , permissions);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding permissions to role. Error Message = " , ex);
		}
		return addedOperationPermissionToRole;
	}



	@Override
	public RoleDTO deleteOperationPermissionToRole(RoleDTO role,
			List<Permission> permissions) throws SecurityManagerException {
		
		RoleDTO deletedOperationPermissionToRole = null;
		
		try
		{
			deletedOperationPermissionToRole = this.getSecurityService().deleteOperationPermissionToRole(role , permissions);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting permissions to role. Error Message = " , ex);
		}
		
		return deletedOperationPermissionToRole;
		
	}



	@Override
	public RoleDTO addOperationPermissionToRole(Long roleId,
			List<Permission> permissions) throws SecurityManagerException {
		RoleDTO addedOperationPermissionToRole = null;
		try
		{
			addedOperationPermissionToRole = this.getSecurityService().addOperationPermissionToRole(roleId , permissions);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding permissions to role. Error Message = " , ex);
		}
		return addedOperationPermissionToRole;
	}



	@Override
	public RoleDTO deleteOperationPermissionToRole(Long roleId,
			List<Permission> permissions) throws SecurityManagerException {
		RoleDTO deletedOperationPermissionToRole = null;
		
		try
		{
			deletedOperationPermissionToRole = this.getSecurityService().deleteOperationPermissionToRole(roleId , permissions);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting permissions to role. Error Message = " , ex);
		}
		
		return deletedOperationPermissionToRole;
	}



	@Override
	public RoleDTO addOperationPermissionToRole(String roleCode,
			List<Permission> permissions) throws SecurityManagerException {
		RoleDTO addedOperationPermissionToRole = null;
		try
		{
			addedOperationPermissionToRole = this.getSecurityService().addOperationPermissionToRole(roleCode , permissions);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding permissions to role. Error Message = " , ex);
		}
		return addedOperationPermissionToRole;
	}



	@Override
	public RoleDTO deleteOperationPermissionToRole(String roleCode,
			List<Permission> permissions) throws SecurityManagerException {
		RoleDTO deletedOperationPermissionToRole = null;
		
		try
		{
			deletedOperationPermissionToRole = this.getSecurityService().deleteOperationPermissionToRole(roleCode , permissions);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting permissions to role. Error Message = " , ex);
		}
		
		return deletedOperationPermissionToRole;
	}



	@Override
	public List<RoleDTO> findAllRoles() throws SecurityManagerException {
		List<RoleDTO> findRoles = null;
		
		try
		{
			findRoles = this.getSecurityService().findAllRoles();
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  role. Error Message = " , ex);
		}
		
		return findRoles;
	}



	@Override
	public RoleDTO findRole(long roleId) throws SecurityManagerException {
		RoleDTO findRole = null;
		
		try
		{
			findRole = this.getSecurityService().findRole(roleId);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  role. Error Message = " , ex);
		}
		
		return findRole;
	}



	@Override
	public RoleDTO findRoleByCode(String roleCode)
			throws SecurityManagerException {
		RoleDTO findRole = null;
		
		try
		{
			findRole = this.getSecurityService().findRoleByCode(roleCode);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  role. Error Message = " , ex);
		}
		
		return findRole;
	}



	@Override
	public RoleDTO findRoleByName(String roleName)
			throws SecurityManagerException {
		RoleDTO findRole = null;
		
		try
		{
			findRole = this.getSecurityService().findRoleByName(roleName);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  role. Error Message = " , ex);
		}
		
		return findRole;
	}



	@Override
	public CategoryDTO addCategory(CategoryDTO category)
			throws SecurityManagerException {
		CategoryDTO addedCategory = null;
		try
		{
			addedCategory = this.getSecurityService().addCategory(category);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding category. Error Message = " , ex);
		}
		return addedCategory;
	}



	@Override
	public CategoryDTO modifyCategory(CategoryDTO category)
			throws SecurityManagerException {
		CategoryDTO modifiedCategory = null;
		try
		{
			modifiedCategory = this.getSecurityService().modifyCategory(category);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while modifing category. Error Message = " , ex);
		}
		return modifiedCategory;
	}



	@Override
	public void deleteCategory(CategoryDTO category)
			throws SecurityManagerException {
		
		try
		{
			this.getSecurityService().deleteCategory(category);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting category. Error Message = " , ex);
		}
		
		
	}



	@Override
	public CategoryDTO addCategoryDetails(List<CategoryDetailDTO> categoryDetails)
			throws SecurityManagerException {
		CategoryDTO addedCategoryDetails = null;
		try
		{
			addedCategoryDetails = this.getSecurityService().addCategoryDetails(categoryDetails);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding category details to category. Error Message = " , ex);
		}
		return addedCategoryDetails;
	}



	@Override
	public CategoryDTO modifyCategoryDetails(
			List<CategoryDetailDTO> categoryDetails)
			throws SecurityManagerException {
		CategoryDTO modifiedCategoryDetails = null;
		try
		{
			modifiedCategoryDetails = this.getSecurityService().modifyCategoryDetails(categoryDetails);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while modifying modifying details to category. Error Message = " , ex);
		}
		return modifiedCategoryDetails;
	}



	@Override
	public CategoryDTO deleteCategoryDetails(
			List<CategoryDetailDTO> categoryDetails)
			throws SecurityManagerException {
		CategoryDTO deletedCategoryDetails = null;
		try
		{
			deletedCategoryDetails = this.getSecurityService().deleteCategoryDetails(categoryDetails);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting modifying details to category. Error Message = " , ex);
		}
		return deletedCategoryDetails;
	}



	@Override
	public CategoryDetailDTO addCategoryDetailsPermission(
			List<CategoryDetailsPermissionDTO> categoryDetailPermissions)
			throws SecurityManagerException {
		CategoryDetailDTO addedCategoryDetailsPermission = null;
		try
		{
			addedCategoryDetailsPermission = this.getSecurityService().addCategoryDetailsPermission(categoryDetailPermissions);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding category details to Category Permission. Error Message = " , ex);
		}
		return addedCategoryDetailsPermission;
	}



	@Override
	public CategoryDetailDTO modifyCategoryDetailsPermission(
			List<CategoryDetailsPermissionDTO> categoryDetailPermissions)
			throws SecurityManagerException {
		CategoryDetailDTO modifiedCategoryDetailsPermission = null;
		try
		{
			modifiedCategoryDetailsPermission = this.getSecurityService().modifyCategoryDetailsPermission(categoryDetailPermissions);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while modifying category details to Category Permission. Error Message = " , ex);
		}
		return modifiedCategoryDetailsPermission;
	}



	@Override
	public void deleteCategoryDetailsPermission(
			List<CategoryDetailsPermissionDTO> categoryDetailPermissions)
			throws SecurityManagerException {
		try
		{
			this.getSecurityService().deleteCategoryDetailsPermission(categoryDetailPermissions);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting category details to Category Permission. Error Message = " , ex);
		}
		
		
	}



	@Override
	public UserDelegationDTO addUserDelegation(UserDelegationDTO userDelegation)
			throws SecurityManagerException {
		UserDelegationDTO addedUserDelegation = null;
		try
		{
			addedUserDelegation = this.getSecurityService().	addUserDelegation(userDelegation);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding UserDlegation. Error Message = " , ex);
		}
		return addedUserDelegation;
	}



	@Override
	public UserDelegationDTO modifyUserDelegation(
			UserDelegationDTO userDelegation) throws SecurityManagerException {
		UserDelegationDTO modifiedUserDelegation = null;
		try
		{
			modifiedUserDelegation = this.getSecurityService().	modifyUserDelegation(userDelegation);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while modifing UserDlegation. Error Message = " , ex);
		}
		return modifiedUserDelegation;
	}



	@Override
	public void deleteUserDelegation(UserDelegationDTO userDelegation)
			throws SecurityManagerException {
		try
		{
			this.getSecurityService().	deleteUserDelegation(userDelegation);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting UserDlegation. Error Message = " , ex);
		}
		
	}



	@Override
	public UserDTO createUser(UserDTO user) throws SecurityManagerException {
		UserDTO addUser = null;
		try
		{
			addUser = this.getSecurityService().	createUser(user);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding User. Error Message = " , ex);
		}
		return addUser;
	}



	@Override
	public UserDTO modifyUser(UserDTO user) throws SecurityManagerException {
		UserDTO updateUser = null;
		try
		{
			updateUser = this.getSecurityService().	modifyUser(user);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while Modifying User. Error Message = " , ex);
		}
		return updateUser;
	}



	@Override
	public void deleteUser(UserDTO user) throws SecurityManagerException {
		try
		{
			this.getSecurityService().	deleteUser(user);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while Deleting User. Error Message = " , ex);
		}
		
	}



	@Override
	public UserDTO addRoleToUser(UserDTO user, List<RoleDTO> roles)
			throws SecurityManagerException {
		
		UserDTO addedRoleToUser = null;
		try
		{
			addedRoleToUser = this.getSecurityService().	addRoleToUser(user , roles);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding role to user. Error Message = " , ex);
		}
		return addedRoleToUser;
		
	}



	@Override
	public UserDTO deleteRoleToUser(UserDTO user, List<RoleDTO> roles)
			throws SecurityManagerException {
		UserDTO deleteRolesToUser = null;
		try
		{
			deleteRolesToUser = this.getSecurityService().	deleteRoleToUser(user , roles);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting role to user. Error Message = " , ex);
		}
		return deleteRolesToUser;
	}



	@Override
	public UserDTO addCategoryDetailPermissionToUser(UserDTO user,
			List<CategoryDetailsPermissionDTO> categoryDetailPermission)
			throws SecurityManagerException {
		UserDTO addedCategoryDetailPermissionToUser = null;
		try
		{
			addedCategoryDetailPermissionToUser = this.getSecurityService().	addCategoryDetailPermissionToUser(user , categoryDetailPermission);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding category detail permission to user. Error Message = " , ex);
		}
		return addedCategoryDetailPermissionToUser;
	}



	@Override
	public UserDTO deleteCategoryDetailPermissionToUser(UserDTO user,
			List<CategoryDetailsPermissionDTO> categoryDetailPermission)
			throws SecurityManagerException {
		UserDTO deleteCategoryDetailPermissionToUser = null;
		try
		{
			deleteCategoryDetailPermissionToUser = this.getSecurityService().	deleteCategoryDetailPermissionToUser(user , categoryDetailPermission);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting category detail permission to user. Error Message = " , ex);
		}
		return deleteCategoryDetailPermissionToUser;
	}



	@Override
	public List<UserDTO> findAllUsers() throws SecurityManagerException {
		List<UserDTO> findUsers = null;
		try
		{
			findUsers = this.getSecurityService().	findAllUsers();
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  users. Error Message = " , ex);
		}
		return findUsers;
	}



	@Override
	public List<UserDTO> findUsersByRole(long roleId)
			throws SecurityManagerException {
		List<UserDTO> findUsers = null;
		try
		{
			findUsers = this.getSecurityService().	findUsersByRole(roleId);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  users by RoleId. Error Message = " , ex);
		}
		return findUsers;
	}



	@Override
	public List<UserDTO> findUsersByRoleCode(String roleCode)
			throws SecurityManagerException {
		List<UserDTO> findUsers = null;
		try
		{
			findUsers = this.getSecurityService().	findUsersByRoleCode(roleCode);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  users by RoleCode. Error Message = " , ex);
		}
		return findUsers;
	}



	@Override
	public List<UserDTO> findUsersByRoleName(String roleName)
			throws SecurityManagerException {
		List<UserDTO> findUsers = null;
		try
		{
			findUsers = this.getSecurityService().	findUsersByRoleName(roleName);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  users by RoleName. Error Message = " , ex);
		}
		return findUsers;
	}



	@Override
	public List<UserDTO> findUserByGroupId(long userGroupId)
			throws SecurityManagerException {
		List<UserDTO> findUsers = null;
		try
		{
			findUsers = this.getSecurityService().	findUserByGroupId(userGroupId);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  users by UserGroupId. Error Message = " , ex);
		}
		return findUsers;
	}



	@Override
	public UserDTO findUserByUserId(String userId)
			throws SecurityManagerException {
		UserDTO findUser = null;
		try
		{
			findUser = this.getSecurityService().	findUserByUserId(userId);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  users by UserId. Error Message = " , ex);
		}
		return findUser;
	}



	@Override
	public UserDTO findUser(String userId, String password)
			throws SecurityManagerException {
		UserDTO findUser = null;
		try
		{
			findUser = this.getSecurityService().	findUser(userId, password);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  users by UserId. Error Message = " , ex);
		}
		return findUser;
	}



	@Override
	public UserDTO findUserById(long userId) throws SecurityManagerException {
		UserDTO findUser = null;
		try
		{
			findUser = this.getSecurityService().	findUserById(userId);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  users by findUserById. Error Message = " , ex);
		}
		return findUser;
	}



	@Override
	public DepartmentDTO createDepartment(DepartmentDTO department)
			throws SecurityManagerException {
		DepartmentDTO addedDepartment = null;
		try
		{
			addedDepartment = this.getSecurityService().	createDepartment(department);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding Department. Error Message = " , ex);
		}
		return addedDepartment;
	}



	@Override
	public DepartmentDTO modifyDepartment(DepartmentDTO department)
			throws SecurityManagerException {
		DepartmentDTO modifiedDepartment = null;
		try
		{
			modifiedDepartment = this.getSecurityService().	modifyDepartment(department);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while modified Department. Error Message = " , ex);
		}
		return modifiedDepartment;
	}



	@Override
	public void deleteDepartment(DepartmentDTO department)
			throws SecurityManagerException {
		try
		{
			this.getSecurityService().	deleteDepartment(department);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleted Department. Error Message = " , ex);
		}
		
	}



	@Override
	public UserGroupDTO createUserGroup(UserGroupDTO userGroup)
			throws SecurityManagerException {
		UserGroupDTO addUserGroup = null;
		try
		{
			addUserGroup = this.getSecurityService().	createUserGroup(userGroup);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding UserGroup. Error Message = " , ex);
		}
		return addUserGroup;
	}



	@Override
	public UserGroupDTO modifyUserGroup(UserGroupDTO userGroup)
			throws SecurityManagerException {
		UserGroupDTO modifyUserGroup = null;
		try
		{
			modifyUserGroup = this.getSecurityService().	modifyUserGroup(userGroup);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while modifying UserGroup. Error Message = " , ex);
		}
		return modifyUserGroup;
	}



	@Override
	public void deleteUserGroup(UserGroupDTO userGroup)
			throws SecurityManagerException {
		try
		{
			this.getSecurityService().	deleteUserGroup(userGroup);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while modifying UserGroup. Error Message = " , ex);
		}
	}



	@Override
	public UserGroupDTO addRoleToUserGroup(UserGroupDTO userGroup,
			List<RoleDTO> roles) throws SecurityManagerException {
		UserGroupDTO addUserGroupToRoles = null;
		try
		{
			addUserGroupToRoles = this.getSecurityService().	addRoleToUserGroup(userGroup , roles);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding UserGroup To Roles. Error Message = " , ex);
		}
		return addUserGroupToRoles;
	}



	@Override
	public UserGroupDTO deleteRoleToUserGroup(UserGroupDTO userGroup,
			List<RoleDTO> roles) throws SecurityManagerException {
		UserGroupDTO deleteUserGroupToRoles = null;
		try
		{
			deleteUserGroupToRoles = this.getSecurityService().	deleteRoleToUserGroup(userGroup , roles);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting UserGroup To Roles. Error Message = " , ex);
		}
		return deleteUserGroupToRoles;
	}



	@Override
	public UserGroupDTO addCategoryDetailPermissionToUserGroup(
			UserGroupDTO userGroup,
			List<CategoryDetailsPermissionDTO> categoryDetailPermission)
			throws SecurityManagerException {
		UserGroupDTO addCategoryDetailPermissionToUserGroup = null;
		try
		{
			addCategoryDetailPermissionToUserGroup = this.getSecurityService().	addCategoryDetailPermissionToUserGroup(userGroup , categoryDetailPermission);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while adding Category Detail Permission  To UserGroup. Error Message = " , ex);
		}
		return addCategoryDetailPermissionToUserGroup;
	}



	@Override
	public UserGroupDTO deleteCategoryDetailPermissionToUserGroup(
			UserGroupDTO userGroup,
			List<CategoryDetailsPermissionDTO> categoryDetailPermission)
			throws SecurityManagerException {
		UserGroupDTO deleteCategoryDetailPermissionToUserGroup = null;
		try
		{
			deleteCategoryDetailPermissionToUserGroup = this.getSecurityService().	deleteCategoryDetailPermissionToUserGroup(userGroup , categoryDetailPermission);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while deleting Category Detail Permission  To UserGroup. Error Message = " , ex);
		}
		return deleteCategoryDetailPermissionToUserGroup;
	}



	@Override
	public List<UserGroupDTO> findAllUserGroups()
			throws SecurityManagerException {
		List<UserGroupDTO> findUserGroups = null;
		try
		{
			findUserGroups = this.getSecurityService().	findAllUserGroups();
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  usergroup. Error Message = " , ex);
		}
		return findUserGroups;
	}



	@Override
	public UserGroupDTO findUserGroupByName(String userGroupName)
			throws SecurityManagerException {
		UserGroupDTO findUserGroup = null;
		try
		{
			findUserGroup = this.getSecurityService().	findUserGroupByName(userGroupName);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  usergroup by userGroupName. Error Message = " , ex);
		}
		return findUserGroup;
	}



	@Override
	public UserGroupDTO findUserGroupById(long userGroupId)
			throws SecurityManagerException {
		UserGroupDTO findUserGroup = null;
		try
		{
			findUserGroup = this.getSecurityService().	findUserGroupById(userGroupId);
		}
		catch(SecurityException ex)
		{
			throw new SecurityManagerException(ex.getMessage() , ex);
		}
		catch(Exception ex)
		{
			throw new SecurityManagerException("Unknown Exception occured while reteriving  usergroup by UserGroupById. Error Message = " , ex);
		}
		return findUserGroup;
	}






	


}
