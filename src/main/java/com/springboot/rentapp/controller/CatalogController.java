package com.springboot.rentapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.rentapp.entity.Car;
import com.springboot.rentapp.service.CarService;

@Controller
@RequestMapping("/catalog")
public class CatalogController {

	private CarService carService;
	
	public CatalogController(CarService theCarService) {
		carService = theCarService;
	}
	
	@GetMapping("/list")
	public String catalogList(Model theModel) {
		// get cars fro db
		List<Car> theCars = carService.findAll();

		// add to the spring model
		theModel.addAttribute("cars", theCars);

		return "/catalog/list-catalog";
	}
	
	@GetMapping("/view")
	public String viewCar(@RequestParam("carId") int theId, Model theModel) {
		
		Car theCar = carService.findById(theId);
		
		theModel.addAttribute("car", theCar);
		
		return "/catalog/car-view";
	}
	
	@PostMapping("/book")
	public String bookCar() {
		return null;
	}
	
	
}
