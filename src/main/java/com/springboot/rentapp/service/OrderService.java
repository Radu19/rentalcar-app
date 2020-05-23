package com.springboot.rentapp.service;

import java.util.List;

import com.springboot.rentapp.entity.Order;

public interface OrderService {

	public List<Order> findAll();
	
	public Order findById(int theId);
	
	public void save(Order theOrder);
	
	public void deleteById(int theId);
}
