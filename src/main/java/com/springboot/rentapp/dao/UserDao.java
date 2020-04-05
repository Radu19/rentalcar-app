package com.springboot.rentapp.dao;

import com.springboot.rentapp.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
