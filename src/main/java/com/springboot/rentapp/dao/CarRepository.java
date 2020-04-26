package com.springboot.rentapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rentapp.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

	    // add a method to sort by last name
		public List<Car> findAllByOrderByBrand();
		
		// search by name
		public List<Car> findByBrandContainsOrModelContainsAllIgnoreCase(String brand, String model);

}

