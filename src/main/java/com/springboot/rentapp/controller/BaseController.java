package com.springboot.rentapp.controller;

import java.util.ArrayList;
import java.util.List;

import com.springboot.rentapp.entity.Car;
import com.springboot.rentapp.service.CarService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

	private final CarService carService;

	public BaseController(CarService theCarService) {
		carService = theCarService;
	}

	@GetMapping("/")
	public String showIndex(Model theModel) {

		List<Car> list = carService.findAll();
		List<Car> myList = new ArrayList<>();
		for(int i = 1; i<=3; i++){
			myList.add(list.get(i));
		}
		theModel.addAttribute("cars", myList);
 
		return "index";
	}
	
	// add request mapping for employees
	
	@GetMapping("/cars")
    public String showHome() {
        return "home";
    }
	
	
}










