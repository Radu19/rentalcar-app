package com.springboot.rentapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rentapp.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
