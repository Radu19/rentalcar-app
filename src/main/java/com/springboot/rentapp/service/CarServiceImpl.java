package com.springboot.rentapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rentapp.dao.CarRepository;
import com.springboot.rentapp.entity.Car;

@Service
public class CarServiceImpl implements CarService {
	
	private CarRepository carRepository;

	@Autowired
	public CarServiceImpl(CarRepository theCarRepository) {
		carRepository = theCarRepository;
	}
	
	@Override
	public List<Car> findAll() {
		return carRepository.findAllByOrderByBrand();
	}

	@Override
	public Car findById(int theId) {
		Optional<Car> result = carRepository.findById(theId);
		
		Car theCar = null;
		
		if(result.isPresent()) {
			theCar = result.get();
		}
		else {
			throw new RuntimeException("Did not find car id -" + theId);
		}
		return theCar;
	}

	@Override
	public void save(Car theCar) {
		carRepository.save(theCar);
	}

	@Override
	public void deleteById(int theId) {
		carRepository.deleteById(theId);
	}

	@Override
	public List<Car> searchBy(String theBrand) {
		List<Car> results = null;
		
		if(theBrand != null && (theBrand.trim().length()>0)) {
			results = carRepository.findByBrandContainsOrModelContainsAllIgnoreCase(theBrand, theBrand);
		}
		else {
			results = findAll();
		}
		return results;
	}

}
