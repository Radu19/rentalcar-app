package com.springboot.rentapp.dao;

import com.springboot.rentapp.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
