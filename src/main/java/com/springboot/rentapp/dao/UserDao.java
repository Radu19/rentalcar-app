package com.springboot.rentapp.dao;

import java.util.List;

import com.springboot.rentapp.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
    public List<User> findAll();

	public void deleteById(Long theId);
    
}
