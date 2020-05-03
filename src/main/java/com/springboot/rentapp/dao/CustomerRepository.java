package com.springboot.rentapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rentapp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
