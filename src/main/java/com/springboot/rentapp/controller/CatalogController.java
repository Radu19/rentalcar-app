package com.springboot.rentapp.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.rentapp.entity.Car;
import com.springboot.rentapp.entity.Customer;
import com.springboot.rentapp.service.CarService;

@Controller
@RequestMapping("/catalog")
public class CatalogController {

	@Autowired
	private CarService carService;
	
	@GetMapping("/list")
	public String catalogList(Model theModel) {
		List<Car> theCars = carService.findAll();
		theModel.addAttribute("cars", theCars);
		return "/catalog/list-catalog";
	}
	
	@GetMapping("/view")
	public String viewCar(@RequestParam("carId") int theId, Model theModel) {
		System.out.println("GetMapping /view <><><> \n");
		if(!theModel.containsAttribute("customer")) {
			Customer theCustomer = new Customer();
			LocalDate dateBirth = null;
			theCustomer.setDateBirth(dateBirth);
			theModel.addAttribute("customer", theCustomer);
		}
		Car theCar = carService.findById(theId);
		theModel.addAttribute("car", theCar);
		return "/catalog/car-view";
	}
	
	@GetMapping("/available-cars")
	public String showAvailableCars(@RequestParam("startDate") @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm") LocalDateTime startDate,
			@RequestParam("endDate") @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm") LocalDateTime endDate, Model theModel) {
		List<Car> cars = carService.findAvailableCars(startDate, endDate);
		theModel.addAttribute("cars", cars);
		return "/catalog/list-catalog";
	}
	
	
}
