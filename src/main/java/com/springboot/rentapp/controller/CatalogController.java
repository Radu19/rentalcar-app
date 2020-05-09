package com.springboot.rentapp.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.rentapp.entity.Car;
import com.springboot.rentapp.entity.Order;
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
		LocalDateTime orderDateLocal = LocalDateTime.now();
		LocalDateTime startDateLocal = LocalDateTime.now().plusDays(1);
		LocalDateTime endDateLocal = LocalDateTime.now().plusDays(3);
		
		Order theOrder = null;
		try {
			theOrder = new Order();
			theOrder.setOrderDate(orderDateLocal);
			theOrder.setStartDate(startDateLocal);
			theOrder.setEndDate(endDateLocal);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Start date>>>" + startDateLocal + " \nEnd date>>> " + endDateLocal);
		theModel.addAttribute("car", theCar);
		theModel.addAttribute("order", theOrder);
		
		return "/catalog/car-view";
	}
	
	@PostMapping("/reservation")
	public String bookCar(@ModelAttribute("order") Order theOrder, @ModelAttribute("car") Car theCar) {
		System.out.println(theOrder.getStartDate());
		System.out.println(theOrder.getEndDate());
		return "redirect:/catalog/view"+theCar.getId();
	}
	
	
}
