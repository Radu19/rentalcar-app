package com.springboot.rentapp.service;

import com.springboot.rentapp.entity.User;
import com.springboot.rentapp.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
