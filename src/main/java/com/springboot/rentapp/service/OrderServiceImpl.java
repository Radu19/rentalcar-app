package com.springboot.rentapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rentapp.dao.OrderRepository;
import com.springboot.rentapp.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public Order findById(int theId) {
		Optional<Order> result = orderRepository.findById(theId);
		Order theOrder = null;
		if (result.isPresent()) {
			theOrder = result.get();
		} else {
			throw new RuntimeException("Did not find order id - " + theId);
		}
		return theOrder;
	}

	@Override
	public void save(Order theOrder) {
		orderRepository.save(theOrder);
	}

	@Override
	public void deleteById(int theId) {
		orderRepository.deleteById(theId);
	}

}
