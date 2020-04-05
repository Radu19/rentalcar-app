package com.springboot.rentapp.service;

import java.util.List;

import com.springboot.rentapp.entity.Car;

public interface CarService {

	public List<Car> findAll();
	
	public Car findById(int theId);
	
	public void save(Car theCar);
	
	public void deleteById(int theId);
	
	public List<Car> searchBy(String theBrand);
}
