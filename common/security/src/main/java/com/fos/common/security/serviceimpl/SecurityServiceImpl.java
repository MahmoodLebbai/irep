package com.fos.common.security.serviceimpl;

import java.util.List;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fos.common.crypto.service.CryptoService;
import com.fos.common.security.SecurityConstants;
import com.fos.common.security.SecurityErrorCodes;
import com.fos.common.security.domain.Applications;
import com.fos.common.security.domain.Category;
import com.fos.common.security.domain.CategoryDetail;
import com.fos.common.security.domain.CategoryDetailsPermission;
import com.fos.common.security.domain.Department;
import com.fos.common.security.domain.Modules;
import com.fos.common.security.domain.Operation;
import com.fos.common.security.domain.Permission;
import com.fos.common.security.domain.Role;
import com.fos.common.security.domain.RolePermission;
import com.fos.common.security.domain.User;
import com.fos.common.security.domain.UserCategoryPermission;
import com.fos.common.security.domain.UserDelegation;
import com.fos.common.security.domain.UserEmail;
import com.fos.common.security.domain.UserGroup;
import com.fos.common.security.domain.UserGroupCategoryPermission;
import com.fos.common.security.domain.UserGroupRole;
import com.fos.common.security.domain.UserPhone;
import com.fos.common.security.domain.UserRole;
import com.fos.common.security.dto.ApplicationsDTO;
import com.fos.common.security.dto.CategoryDTO;
import com.fos.common.security.dto.CategoryDetailDTO;
import com.fos.common.security.dto.CategoryDetailsPermissionDTO;
import com.fos.common.security.dto.DepartmentDTO;
import com.fos.common.security.dto.ModulesDTO;
import com.fos.common.security.dto.OperationDTO;
import com.fos.common.security.dto.PermissionDTO;
import com.fos.common.security.dto.RoleDTO;
import com.fos.common.security.dto.RolePermissionDTO;
import com.fos.common.security.dto.UserCategoryPermissionDTO;
import com.fos.common.security.dto.UserDTO;
import com.fos.common.security.dto.UserDelegationDTO;
import com.fos.common.security.dto.UserEmailDTO;
import com.fos.common.security.dto.UserGroupCategoryPermissionDTO;
import com.fos.common.security.dto.UserGroupDTO;
import com.fos.common.security.dto.UserGroupRoleDTO;
import com.fos.common.security.dto.UserPhoneDTO;
import com.fos.common.security.dto.UserRoleDTO;
import com.fos.common.security.service.ApplicationsService;
import com.fos.common.security.service.CategoryDetailService;
import com.fos.common.security.service.CategoryDetailsPermissionService;
import com.fos.common.security.service.CategoryService;
import com.fos.common.security.service.ModulesService;
import com.fos.common.security.service.OperationService;
import com.fos.common.security.service.PermissionService;
import com.fos.common.security.service.RolePermissionService;
import com.fos.common.security.service.RoleService;
import com.fos.common.security.service.UserCategoryPermissionService;
import com.fos.common.security.service.UserDelegationService;
import com.fos.common.security.service.UserGroupCategoryPermissionService;
import com.fos.common.security.service.UserGroupRoleService;
import com.fos.common.security.service.UserGroupService;
import com.fos.common.security.service.UserRoleService;
import com.fos.common.security.service.UserService;
import com.fos.common.security.exception.SecurityException;;

/**
 * Implementation of SecurityService.
 */
@Service("securityService")
public class SecurityServiceImpl extends SecurityServiceImplBase {
	
	
	@Autowired
	ApplicationsService applicationsService;
	
	
	@Autowired
	CategoryService categoryService;
	
	
	@Autowired
	CategoryDetailService categoryDetailService;
	
	@Autowired
	CategoryDetailsPermissionService categoryDetailsPermissionService;
	
	
	@Autowired
	ModulesService modulesService;
	
	
	@Autowired
	OperationService operationService;
	
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	PermissionService permissionService;
	
	
	@Autowired
	RolePermissionService rolePermissionService;
	
	
	@Autowired
	UserService userService;
	
	
	@Autowired
	UserGroupService userGroupService;
	
	@Autowired
	UserRoleService userRoleService;
	
	@Autowired
	UserGroupRoleService userGroupRoleService;
	
	@Autowired
	UserDelegationService userDelegationService;
	
	
	@Autowired
	UserCategoryPermissionService userCategoryPermissionService;
	
	
	@Autowired
	UserGroupCategoryPermissionService userGroupCategoryPermissionService;
	
	
	@Autowired
	CryptoService cryptoService;
	
	
	/* securityMapperFactory MapperFactory */
	MapperFactory securityMapperFactory;
	
	
	
	/* Security Service Contructor - Builds Mapping between Security Domain Objects and Security DTO */
    public SecurityServiceImpl() {
      	buildSecurityMapper();
    }
    
    
    private void buildSecurityMapper()
    {
    	
    	if(securityMapperFactory == null)
    		securityMapperFactory = new ma.glasnost.orika.impl.DefaultMapperFactory.Builder().build();
    	
    	
    	// Application - Mapping
    	ClassMapBuilder<Applications , ApplicationsDTO> applicationMapBuilder = ClassMapBuilder.map(Applications.class, ApplicationsDTO.class);
    	applicationMapBuilder.fieldMap("modules").aInverse("application").add();
    	securityMapperFactory.registerClassMap(applicationMapBuilder.byDefault().toClassMap());
    	
    	//Module Mapping
    	ClassMapBuilder<Modules , ModulesDTO> moduleMapBuilder = ClassMapBuilder.map(Modules.class, ModulesDTO.class);
    	moduleMapBuilder.fieldMap("operations").aInverse("module").add();
    	securityMapperFactory.registerClassMap(moduleMapBuilder.byDefault().toClassMap());
    	
    	
    	//Operations Mapping
    	ClassMapBuilder<Operation , OperationDTO> operationMapBuilder = ClassMapBuilder.map(Operation.class, OperationDTO.class);
    	operationMapBuilder.fieldMap("permissions").aInverse("operation").add();
    	securityMapperFactory.registerClassMap(operationMapBuilder.byDefault().toClassMap());
    	
    	
    	//Permission Mapping
    	ClassMapBuilder<Permission , PermissionDTO> permissionMapBuilder = ClassMapBuilder.map(Permission.class, PermissionDTO.class);
    	securityMapperFactory.registerClassMap(permissionMapBuilder.byDefault().toClassMap());
    	
    	
    	//Role Mapping
    	ClassMapBuilder<Role , RoleDTO> roleMapBuilder = ClassMapBuilder.map(Role.class, RoleDTO.class);
    	roleMapBuilder.fieldMap("rolePermissions").aInverse("role").add();
    	roleMapBuilder.fieldMap("userRoles").aInverse("role").add();
    	roleMapBuilder.fieldMap("userGroupRoles").aInverse("role").add();
    	securityMapperFactory.registerClassMap(roleMapBuilder.byDefault().toClassMap());
    	
    	
    	//RolePermission
    	ClassMapBuilder<RolePermission , RolePermissionDTO> rolePermissionMapBuilder = ClassMapBuilder.map(RolePermission.class, RolePermissionDTO.class);
    	securityMapperFactory.registerClassMap(rolePermissionMapBuilder.byDefault().toClassMap());
    	
    	
    	//UserRole
    	ClassMapBuilder<UserRole , UserRoleDTO> userRoleMapBuilder = ClassMapBuilder.map(UserRole.class, UserRoleDTO.class);
       	securityMapperFactory.registerClassMap(userRoleMapBuilder.byDefault().toClassMap());
    	
    	
    	//Department
    	ClassMapBuilder<Department , DepartmentDTO> departmentMapBuilder = ClassMapBuilder.map(Department.class, DepartmentDTO.class);
    	departmentMapBuilder.fieldMap("users").aInverse("department").add();
    	securityMapperFactory.registerClassMap(departmentMapBuilder.byDefault().toClassMap());
    	
    	
    	//User Mapping
    	ClassMapBuilder<User , UserDTO> userMapBuilder = ClassMapBuilder.map(User.class, UserDTO.class);
    	userMapBuilder.fieldMap("phones").bInverse("user").add();
    	userMapBuilder.fieldMap("emails").bInverse("user").add();
    	userMapBuilder.fieldMap("userRoles").bInverse("user").add();
    	userMapBuilder.fieldMap("userCategoryPermissions").bInverse("user").add();
    	userMapBuilder.fieldMap("userDelegations").bInverse("user").add();
		securityMapperFactory.registerClassMap(userMapBuilder.byDefault().toClassMap());
    	
    	//UserGroup
		ClassMapBuilder<UserGroup , UserGroupDTO> userGroupMapBuilder = ClassMapBuilder.map(UserGroup.class, UserGroupDTO.class);
		userGroupMapBuilder.fieldMap("users").bInverse("userGroup").add();
		userGroupMapBuilder.fieldMap("userGroupRoles").bInverse("userGroup").add();
		userGroupMapBuilder.fieldMap("userGroupCategoryPermissions").bInverse("userGroup").add();
		securityMapperFactory.registerClassMap(userGroupMapBuilder.byDefault().toClassMap());
		
		//UserGroupRole
		ClassMapBuilder<UserGroupRole , UserGroupRoleDTO> userGroupRoleMapBuilder = ClassMapBuilder.map(UserGroupRole.class, UserGroupRoleDTO.class);
		securityMapperFactory.registerClassMap(userGroupRoleMapBuilder.byDefault().toClassMap());
		
		
		//UserDelegation
		ClassMapBuilder<UserDelegation , UserDelegationDTO> userDelegationMapBuilder = ClassMapBuilder.map(UserDelegation.class, UserDelegationDTO.class);
		securityMapperFactory.registerClassMap(userDelegationMapBuilder.byDefault().toClassMap());
		
		
		//UserEmail
		ClassMapBuilder<UserEmail , UserEmailDTO> userEmailMapBuilder = ClassMapBuilder.map(UserEmail.class, UserEmailDTO.class);
		securityMapperFactory.registerClassMap(userEmailMapBuilder.byDefault().toClassMap());
		
		//UserPhone
		ClassMapBuilder<UserPhone , UserPhoneDTO> userPhoneMapBuilder = ClassMapBuilder.map(UserPhone.class, UserPhoneDTO.class);
		securityMapperFactory.registerClassMap(userPhoneMapBuilder.byDefault().toClassMap());
		
		//Category
		ClassMapBuilder<Category , CategoryDTO> categoryMapBuilder = ClassMapBuilder.map(Category.class, CategoryDTO.class);
		categoryMapBuilder.fieldMap("categoryDetails").bInverse("category").add();
		securityMapperFactory.registerClassMap(categoryMapBuilder.byDefault().toClassMap());
	
	
		//CategoryDetails
		ClassMapBuilder<CategoryDetail , CategoryDetailDTO> categoryDetailMapBuilder = ClassMapBuilder.map(CategoryDetail.class, CategoryDetailDTO.class);
		categoryDetailMapBuilder.fieldMap("categoryDetailPermissions").bInverse("categoryDetail").add();
		securityMapperFactory.registerClassMap(categoryDetailMapBuilder.byDefault().toClassMap());
		
		
		//CategoryDetailsPermission
		ClassMapBuilder<CategoryDetailsPermission , CategoryDetailsPermissionDTO> categoryDetailsPermissionMapBuilder = ClassMapBuilder.map(CategoryDetailsPermission.class, CategoryDetailsPermissionDTO.class);
		securityMapperFactory.registerClassMap(categoryDetailsPermissionMapBuilder.byDefault().toClassMap());
		

		//UserCategoryPermission
		ClassMapBuilder<UserCategoryPermission , UserCategoryPermissionDTO> userCategoryPermissionMapBuilder = ClassMapBuilder.map(UserCategoryPermission.class, UserCategoryPermissionDTO.class);
		securityMapperFactory.registerClassMap(userCategoryPermissionMapBuilder.byDefault().toClassMap());
	
		
		//UserGroupCategoryPermission
		ClassMapBuilder<UserGroupCategoryPermission , UserGroupCategoryPermissionDTO> userGroupCategoryPermissionMapBuilder = ClassMapBuilder.map(UserGroupCategoryPermission.class, UserGroupCategoryPermissionDTO.class);
		securityMapperFactory.registerClassMap(userGroupCategoryPermissionMapBuilder.byDefault().toClassMap());
		
		
		
	
    	
    }

   /*
    * (non-Javadoc)
    * @see com.fos.common.security.service.SecurityService#createUser(com.fos.common.security.dto.UserDTO)
    */
    public UserDTO createUser(UserDTO userDTO) throws SecurityException {
    	
    	
    	User user = this.getSecurityMapperFactory().getMapperFacade().map(userDTO, User.class);
    	
    	
    	User createdUser = null;
    	createdUser = this.getUserService().findUser(user.getUserId());
    	
    	// Check Whether the User Object passed from the service is corrupted
    	if(user.getId() != 0)
    		throw new SecurityException(SecurityErrorCodes.SEC_OBJECT_CORRUPTED , "Unable to create the user since the modified user object has been passed.");

    	
    	// Check whether user is already exists
    	if(createdUser != null)
    		throw new SecurityException(SecurityErrorCodes.SEC_USER_USERID_ALREADY_EXISTS , "UserId = " + user.getUserId() + " Already Exists");

    	//Check Email Already Exists
    	List<UserEmail> userEmails = user.getEmails();
    	for(UserEmail userEmail : userEmails)
    	{
    		String emailAddress = userEmail.getEmailId();
    		if(emailAddress == null)
    			throw new SecurityException(SecurityErrorCodes.SEC_USER_EMA1LADDRESS_EMPTY , "Unable to create the user since the user email id is empty.");
    		
    		//Check for Email
    		createdUser = this.getUserService().findUserByEmail(emailAddress);
    		
    		// Check whether user is already exists
        	if(createdUser != null)
        		throw new SecurityException(SecurityErrorCodes.SEC_USER_EMAIL_ALREADY_EXISTS , "EmailId = " + emailAddress + " Already Exists");

    	}
    	
    	
    	
    	String encryptedPassword = "";
    	try
    	{
    		encryptedPassword = this.getCryptoService().encrypt(user.getPassword());
    		
    		if(encryptedPassword.equals("") )
    			throw new SecurityException(SecurityErrorCodes.SEC_CRYPTO_ERROR_ENCRYPT , "Unknown Error while Encrypting User Password" );
    			
    		user.setPassword(encryptedPassword);
    	}
    	catch(Exception ex)
    	{
    		throw new SecurityException(SecurityErrorCodes.SEC_CRYPTO_ERROR_ENCRYPT , "Error Encrypting User Password" + ".Error Message = " + ex.getMessage());
    	}
    	
    	
    	// Create the user
    	try
    	{
    		createdUser = this.getUserService().save(user);
    		
    		//createdUser.setPassword(this.getCryptoService().decrypt(createdUser.getPassword()));
    	}
    	catch(Exception ex)
    	{
    		throw new SecurityException(SecurityErrorCodes.SEC_USER_CREATE_ERROR , "Error while saving user in to database" + ".Error Message = " + ex.getMessage());
    	}
    	
    	
    	UserDTO createdUserDTO = this.getSecurityMapperFactory().getMapperFacade().map(createdUser, UserDTO.class);
    	
    	return createdUserDTO;
    }
    
    

   

	/**
	 * @return the applicationsService
	 */
	public ApplicationsService getApplicationsService() {
		return applicationsService;
	}

	/**
	 * @param applicationsService the applicationsService to set
	 */
	public void setApplicationsService(ApplicationsService applicationsService) {
		this.applicationsService = applicationsService;
	}

	/**
	 * @return the categoryService
	 */
	public CategoryService getCategoryService() {
		return categoryService;
	}

	/**
	 * @param categoryService the categoryService to set
	 */
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	/**
	 * @return the categoryDetailService
	 */
	public CategoryDetailService getCategoryDetailService() {
		return categoryDetailService;
	}

	/**
	 * @param categoryDetailService the categoryDetailService to set
	 */
	public void setCategoryDetailService(CategoryDetailService categoryDetailService) {
		this.categoryDetailService = categoryDetailService;
	}

	/**
	 * @return the categoryDetailsPermissionService
	 */
	public CategoryDetailsPermissionService getCategoryDetailsPermissionService() {
		return categoryDetailsPermissionService;
	}

	/**
	 * @param categoryDetailsPermissionService the categoryDetailsPermissionService to set
	 */
	public void setCategoryDetailsPermissionService(
			CategoryDetailsPermissionService categoryDetailsPermissionService) {
		this.categoryDetailsPermissionService = categoryDetailsPermissionService;
	}

	/**
	 * @return the modulesService
	 */
	public ModulesService getModulesService() {
		return modulesService;
	}

	/**
	 * @param modulesService the modulesService to set
	 */
	public void setModulesService(ModulesService modulesService) {
		this.modulesService = modulesService;
	}

	/**
	 * @return the operationService
	 */
	public OperationService getOperationService() {
		return operationService;
	}

	/**
	 * @param operationService the operationService to set
	 */
	public void setOperationService(OperationService operationService) {
		this.operationService = operationService;
	}

	/**
	 * @return the roleService
	 */
	public RoleService getRoleService() {
		return roleService;
	}

	/**
	 * @param roleService the roleService to set
	 */
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	/**
	 * @return the permissionService
	 */
	public PermissionService getPermissionService() {
		return permissionService;
	}

	/**
	 * @param permissionService the permissionService to set
	 */
	public void setPermissionService(PermissionService permissionService) {
		this.permissionService = permissionService;
	}

	/**
	 * @return the rolePermissionService
	 */
	public RolePermissionService getRolePermissionService() {
		return rolePermissionService;
	}

	/**
	 * @param rolePermissionService the rolePermissionService to set
	 */
	public void setRolePermissionService(RolePermissionService rolePermissionService) {
		this.rolePermissionService = rolePermissionService;
	}

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * @return the userGroupService
	 */
	public UserGroupService getUserGroupService() {
		return userGroupService;
	}

	/**
	 * @param userGroupService the userGroupService to set
	 */
	public void setUserGroupService(UserGroupService userGroupService) {
		this.userGroupService = userGroupService;
	}

	/**
	 * @return the userRoleService
	 */
	public UserRoleService getUserRoleService() {
		return userRoleService;
	}

	/**
	 * @param userRoleService the userRoleService to set
	 */
	public void setUserRoleService(UserRoleService userRoleService) {
		this.userRoleService = userRoleService;
	}

	/**
	 * @return the userGroupRoleService
	 */
	public UserGroupRoleService getUserGroupRoleService() {
		return userGroupRoleService;
	}

	/**
	 * @param userGroupRoleService the userGroupRoleService to set
	 */
	public void setUserGroupRoleService(UserGroupRoleService userGroupRoleService) {
		this.userGroupRoleService = userGroupRoleService;
	}

	/**
	 * @return the userDelegationService
	 */
	public UserDelegationService getUserDelegationService() {
		return userDelegationService;
	}

	/**
	 * @param userDelegationService the userDelegationService to set
	 */
	public void setUserDelegationService(UserDelegationService userDelegationService) {
		this.userDelegationService = userDelegationService;
	}

	/**
	 * @return the userCategoryPermissionService
	 */
	public UserCategoryPermissionService getUserCategoryPermissionService() {
		return userCategoryPermissionService;
	}

	/**
	 * @param userCategoryPermissionService the userCategoryPermissionService to set
	 */
	public void setUserCategoryPermissionService(
			UserCategoryPermissionService userCategoryPermissionService) {
		this.userCategoryPermissionService = userCategoryPermissionService;
	}

	/**
	 * @return the userGroupCategoryPermissionService
	 */
	public UserGroupCategoryPermissionService getUserGroupCategoryPermissionService() {
		return userGroupCategoryPermissionService;
	}

	/**
	 * @param userGroupCategoryPermissionService the userGroupCategoryPermissionService to set
	 */
	public void setUserGroupCategoryPermissionService(
			UserGroupCategoryPermissionService userGroupCategoryPermissionService) {
		this.userGroupCategoryPermissionService = userGroupCategoryPermissionService;
	}

	/*
	 * (non-Javadoc)
	 * @see com.fos.common.security.service.SecurityService#modifyUser(com.fos.common.security.dto.UserDTO)
	 */
	public UserDTO modifyUser(UserDTO userDTO) throws SecurityException {
		

    	User user = this.getSecurityMapperFactory().getMapperFacade().map(userDTO, User.class);
    	
    	if(user == null)
    		throw new SecurityException(SecurityErrorCodes.SEC_USER_MAPPER_ERROR , "Error while mapping User DTO to User Domain Object");
    	
    	if(user.getId() == 0)
    		throw new SecurityException(SecurityErrorCodes.SEC_OBJECT_CORRUPTED , "Unable to Modify the user since the modified user object does not have Id.");

    	

		User updatedUser = null;
		
		updatedUser = this.getUserService().findUser(user.getUserId());
    	
    	// Check whether user is already exists
    	if(updatedUser == null)
    		throw new SecurityException(SecurityErrorCodes.SEC_USER_USERID_DOESNOT_EXISTS , "UserId = " + user.getUserId() + " Does Not  Exists");
    	
    	// Require Password Encryption
    	if(!user.getPassword().equals(updatedUser.getPassword()))
    	{
    		
        	String encryptedPassword = "";
        	try
        	{
        		encryptedPassword = this.getCryptoService().encrypt(user.getPassword());
        		
        		if(encryptedPassword.equals("") )
        			throw new SecurityException(SecurityErrorCodes.SEC_CRYPTO_ERROR_ENCRYPT , "Unknown Error while Encrypting User Password" );
        			
        		user.setPassword(encryptedPassword);
        	}
        	catch(Exception ex)
        	{
        		throw new SecurityException(SecurityErrorCodes.SEC_CRYPTO_ERROR_ENCRYPT , "Error Encrypting User Password" + ".Error Message = " + ex.getMessage());
        	}
    	}
    	
    	// Modify the user
    	try
    	{
    		updatedUser = this.getUserService().save(user);
    	}
    	catch(Exception ex)
    	{
    		throw new SecurityException(SecurityErrorCodes.SEC_USER_MODIFY_ERROR , "Error while Modifying user in to database" + ".Error Message = " + ex.getMessage());
    	}
    	
    	UserDTO updatedUserDTO = this.getSecurityMapperFactory().getMapperFacade().map(updatedUser, UserDTO.class);
    	
    	if(updatedUserDTO == null)
    		throw new SecurityException(SecurityErrorCodes.SEC_USER_MAPPER_ERROR , "Error while mapping User Domain Object to User DTO ");
    	
    	
    	return updatedUserDTO;
    	
    	

	}

	@Override
	public void deleteUser(UserDTO userDTO) throws SecurityException {
		

    	User user = this.getSecurityMapperFactory().getMapperFacade().map(userDTO, User.class);
    	
		
    	User deletedUser = null;
    	deletedUser = this.getUserService().findUser(user.getUserId());
    	
    	// Check Whether the User Object passed from the service is corrupted
    	if(user.getId() != 0)
    		throw new SecurityException(SecurityErrorCodes.SEC_OBJECT_CORRUPTED , "Unable to delete the user since the modified user object has been passed.");
    	
    	// Check whether user is already exists
    	if(deletedUser == null)
    		throw new SecurityException(SecurityErrorCodes.SEC_USER_USERID_ALREADY_EXISTS , "UserId = " + user.getUserId() + " is not  Exists");

    	try
    	{
    		this.getUserService().delete(user);
    	}
    	catch(Exception ex)
    	{
    		throw new SecurityException(SecurityErrorCodes.SEC_USER_DELETE_ERROR , "Error while Deleteing user in to database" + ".Error Message = " + ex.getMessage());
    	}
     	
		
	}

	

	/**
	 * @return the cryptoService
	 */
	public CryptoService getCryptoService() {
		return cryptoService;
	}

	/**
	 * @param cryptoService the cryptoService to set
	 */
	public void setCryptoService(CryptoService cryptoService) {
		this.cryptoService = cryptoService;
	}

	@Override
	public UserGroupDTO createUserGroup(UserGroupDTO userGroup)
			throws SecurityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserGroupDTO modifyUserGroup(UserGroupDTO userGroup)
			throws SecurityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserGroup(UserGroupDTO userGroup)
			throws SecurityException {
		// TODO Auto-generated method stub
		
	}


	/**
	 * @return the securityMapperFactory
	 */
	public MapperFactory getSecurityMapperFactory() {
		return securityMapperFactory;
	}


	/**
	 * @param securityMapperFactory the securityMapperFactory to set
	 */
	public void setSecurityMapperFactory(MapperFactory securityMapperFactory) {
		this.securityMapperFactory = securityMapperFactory;
	}


	@Override
	public ApplicationsDTO addApplication(ApplicationsDTO application)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ApplicationsDTO updateApplication(ApplicationsDTO application)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ApplicationsDTO> findApplications()
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ApplicationsDTO findApplication(Long applicationId)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ApplicationsDTO findApplicationByCode(String applicationCode)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ApplicationsDTO findApplicationByName(String applicationName)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void removeApplication(ApplicationsDTO applicationDTO)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeAllApplication()
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public ApplicationsDTO addModule(ModulesDTO module)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ApplicationsDTO addModules(List<ModulesDTO> modules)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ApplicationsDTO updateModule(ModulesDTO module)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ApplicationsDTO updateModules(List<ModulesDTO> modules)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteModule(ModulesDTO module)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteModules(List<ModulesDTO> modules)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public ModulesDTO findModule(Long applicationId, Long moduleId)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ModulesDTO findModule(Long moduleId)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ModulesDTO findModuleByCode(String moduleCode)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ModulesDTO findModuleByName(String moduleName)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ApplicationsDTO addOperation(OperationDTO module)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ApplicationsDTO addOperations(List<OperationDTO> modules)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ApplicationsDTO updateOperation(OperationDTO module)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ApplicationsDTO updateOperations(List<OperationDTO> modules)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteOperation(OperationDTO module)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteOperations(List<OperationDTO> modules)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public OperationDTO findOperation(Long applicationId, Long moduleId,
			Long operationId)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public OperationDTO findOperation(Long operationId)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public OperationDTO findOperationByCode(String operationCode)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public OperationDTO findOperationByName(String operationName)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public OperationDTO addPermissionToOperation(OperationDTO operation,
			List<PermissionDTO> permissions)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deletePermissionToOperation(OperationDTO operation,
			List<PermissionDTO> permissions)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public PermissionDTO addPermission(PermissionDTO permission)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PermissionDTO modifyPermission(PermissionDTO permission)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deletePermission(PermissionDTO permission)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public RoleDTO addRole(RoleDTO role)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public RoleDTO modifyRole(RoleDTO role)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteRole(RoleDTO role)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public RoleDTO addOperationPermissionToRole(RoleDTO role,
			List<Permission> permissions)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public RoleDTO deleteOperationPermissionToRole(RoleDTO role,
			List<Permission> permissions)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public RoleDTO addOperationPermissionToRole(Long roleId,
			List<Permission> permissions)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public RoleDTO deleteOperationPermissionToRole(Long roleId,
			List<Permission> permissions)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public RoleDTO addOperationPermissionToRole(String roleCode,
			List<Permission> permissions)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public RoleDTO deleteOperationPermissionToRole(String roleCode,
			List<Permission> permissions)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<RoleDTO> findAllRoles()
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public RoleDTO findRole(long roleId)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public RoleDTO findRoleByCode(String roleCode)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public RoleDTO findRoleByName(String roleName)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CategoryDTO addCategory(CategoryDTO category)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CategoryDTO modifyCategory(CategoryDTO category)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteCategory(CategoryDTO category)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public CategoryDTO addCategoryDetails(List<CategoryDetailDTO> categoryDetail)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CategoryDTO modifyCategoryDetails(
			List<CategoryDetailDTO> categoryDetail)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CategoryDTO deleteCategoryDetails(
			List<CategoryDetailDTO> categoryDetail)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CategoryDetailDTO addCategoryDetailsPermission(
			List<CategoryDetailsPermissionDTO> categoryDetailPermissions)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CategoryDetailDTO modifyCategoryDetailsPermission(
			List<CategoryDetailsPermissionDTO> categoryDetailPermissions)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteCategoryDetailsPermission(
			List<CategoryDetailsPermissionDTO> categoryDetailPermissions)
			throws SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public UserDelegationDTO addUserDelegation(UserDelegationDTO userDelegation)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserDelegationDTO modifyUserDelegation(
			UserDelegationDTO userDelegation)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteUserDelegation(UserDelegationDTO userDelegation)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public UserDTO addRoleToUser(UserDTO user, List<RoleDTO> roles)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserDTO deleteRoleToUser(UserDTO user, List<RoleDTO> roles)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserDTO addCategoryDetailPermissionToUser(UserDTO user,
			List<CategoryDetailsPermissionDTO> categoryDetailPermission)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserDTO deleteCategoryDetailPermissionToUser(UserDTO user,
			List<CategoryDetailsPermissionDTO> categoryDetailPermission)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UserDTO> findAllUsers()
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UserDTO> findUsersByRole(long roleId)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UserDTO> findUsersByRoleCode(String roleCode)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UserDTO> findUsersByRoleName(String roleName)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UserDTO> findUserByGroupId(long userGroupId)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserDTO findUserByUserId(String userId)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserDTO findUser(String userId, String password)
			throws com.fos.common.security.exception.SecurityException {
		
		// Check For UserId or Password is Empty
		if (userId == null || userId.trim().equals(SecurityConstants.EMPTY) )
			throw new SecurityException(
					SecurityErrorCodes.SEC_USERID_PASSWORD_EMPTY,
					"Unable to reterive the User Details. Reason = UserId  is Empty");
		
		if (password == null || password.trim().equals(SecurityConstants.EMPTY) )
			throw new SecurityException(
					SecurityErrorCodes.SEC_USERID_PASSWORD_EMPTY,
					"Unable to reterive the User Details. Reason = UserId is Empty");

		// Password should be Plain Text and service will try to encrypt the
		// password before it performs database look
		String encryptedPassword = "";
		try {
			encryptedPassword = this.getCryptoService().encrypt(password);

			if (encryptedPassword.equals(""))
				throw new SecurityException(
						SecurityErrorCodes.SEC_CRYPTO_ERROR_ENCRYPT,
						"Unknown Error while Encrypting User Password");

		} catch (Exception ex) {
			throw new SecurityException(
					SecurityErrorCodes.SEC_CRYPTO_ERROR_ENCRYPT,
					"Error Encrypting User Password" + ".Error Message = "
							+ ex.getMessage());
		}

		User user = null;

		try {
			user = this.getUserService().getUserDetails(userId,
					encryptedPassword);
		}

		catch (Exception ex) {
			throw new SecurityException(SecurityErrorCodes.SEC_USER_FIND_ERROR,
					"Error while reteriving user in to database"
							+ ".Error Message = " + ex.getMessage());
		}

		UserDTO userDTO = this.getSecurityMapperFactory().getMapperFacade()
				.map(user, UserDTO.class);

		if (userDTO == null)
			throw new SecurityException(
					SecurityErrorCodes.SEC_USER_MAPPER_ERROR,
					"Error while mapping User Domain Object to User DTO ");

		return userDTO;
    	
	}


	@Override
	public UserDTO findUserById(long userId)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DepartmentDTO createDepartment(DepartmentDTO user)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DepartmentDTO modifyDepartment(DepartmentDTO user)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteDepartment(DepartmentDTO user)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public UserGroupDTO addRoleToUserGroup(UserGroupDTO userGroup,
			List<RoleDTO> roles)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserGroupDTO deleteRoleToUserGroup(UserGroupDTO userGroup,
			List<RoleDTO> roles)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserGroupDTO addCategoryDetailPermissionToUserGroup(
			UserGroupDTO user,
			List<CategoryDetailsPermissionDTO> categoryDetailPermission)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserGroupDTO deleteCategoryDetailPermissionToUserGroup(
			UserGroupDTO user,
			List<CategoryDetailsPermissionDTO> categoryDetailPermission)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UserGroupDTO> findAllUserGroups()
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserGroupDTO findUserGroupByName(String userGroupName)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserGroupDTO findUserGroupById(long userGroupId)
			throws com.fos.common.security.exception.SecurityException {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	
	
	
	
    
    
    
}
