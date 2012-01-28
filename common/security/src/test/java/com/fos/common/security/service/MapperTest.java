package com.fos.common.security.service;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;

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
import com.ibm.icu.util.Calendar;

public class MapperTest {
	
	
	
	
	public static void main(String[] args)
	{
		User user = new User("MAHMOODL");
		
		user.setFirstName("Mahmood");
		user.setMiddleName("middleName");
		user.setLastName("last");
		
		user.addEmail(new UserEmail("mahmood.lebbai@yahoo.com"));
		user.addEmail(new UserEmail("mahmood1.lebbai@yahoo.com"));
		user.addEmail(new UserEmail("mahmood2.lebbai@yahoo.com"));
		user.addEmail(new UserEmail("mahmood3.lebbai@yahoo.com"));
		
		UserPhone userPhone = null;
		
		for(int i = 0; i < 10; i++)
		{
			userPhone = new UserPhone();
			userPhone.setPhoneType("MOBILE");
			userPhone.setPhoneNumber("4085059546");
			user.addPhone(userPhone);
		}
		
		
		
		Department dept = new Department("GGG","FFF");
		dept.setDepartmentDesc("rrrr");
		user.setDepartment(dept);
		dept.addUser(user);
		dept.addUser(user);
		
		
		UserGroup usrGrp = new UserGroup("Operator","OperatorName");
		user.setUserGroup(usrGrp);
		
		
		user.setUserStatus(true);
		
	    long startTime = Calendar.getInstance().getTimeInMillis();
		MapperFactory securityMapperFactory = new ma.glasnost.orika.impl.DefaultMapperFactory.Builder().build();
		ClassMapBuilder<User , UserDTO> userMapBuilder = ClassMapBuilder.map(User.class, UserDTO.class);
    	
      	userMapBuilder.fieldMap("phones").bInverse("user").add();
    	userMapBuilder.fieldMap("emails").bInverse("user").add();
    	userMapBuilder.fieldMap("userRoles").bInverse("user").add();
    	userMapBuilder.fieldMap("userCategoryPermissions").bInverse("user").add();
    	userMapBuilder.fieldMap("userDelegations").bInverse("user").add();
		securityMapperFactory.registerClassMap(userMapBuilder.byDefault().toClassMap());
		
		System.out.println("Total Loading Time = " + (Calendar.getInstance().getTimeInMillis() - startTime ));
		
		
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
		
		
		
		
    
    	System.out.println("Total Loading Time1 = " + (Calendar.getInstance().getTimeInMillis() - startTime ));
		
		
		//securityMapperFactory.build();
		
		UserDTO userDTO = securityMapperFactory.getMapperFacade().map(user, UserDTO.class);
		
		System.out.println("Total  Time2 = " + (Calendar.getInstance().getTimeInMillis() - startTime ));
		
		User userdao = securityMapperFactory.getMapperFacade().map(userDTO, User.class);
		
		System.out.println("Total  Time3 = " + (Calendar.getInstance().getTimeInMillis() - startTime ));
		
		System.out.println(userDTO);
		System.out.println(userdao);
		
		DepartmentDTO departmentDTO = securityMapperFactory.getMapperFacade().map(dept, DepartmentDTO.class);
		
		System.out.println(departmentDTO);
		
		
	}

}
