package com.springboot.rentapp.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.rentapp.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{
		public List<Car> findAllByOrderByBrand();
		
		public List<Car> findByBrandContainsOrModelContainsAllIgnoreCase(String brand, String model);
		
		@Query(value = "SELECT * FROM Car c where c.id not in (select o.car_id from Orders o where (o.start_date BETWEEN ?1 and ?2) or (o.end_date BETWEEN ?1 and ?2))", nativeQuery = true)
		public List<Car> findAvailableCars(LocalDateTime startDate, LocalDateTime endDate);
}

