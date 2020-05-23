package com.springboot.rentapp.service;

import java.util.List;

import com.springboot.rentapp.entity.Customer;

public interface CustomerService {
	
	public List<Customer> findAll();
	
	public Customer findById(int theId);
	
	public Customer findByPhoneNr(int phoneNr);
	
	public void save(Customer theCustomer);
	
	public void deleteById(int theId);
}
