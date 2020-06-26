package com.springboot.rentapp.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.springboot.rentapp.entity.Car;
import com.springboot.rentapp.service.CarService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	private final CarService carService;

	public MainController(CarService theCarService) {
		carService = theCarService;
	}

	@GetMapping("/")
	public String showIndex(Model theModel) {

		List<Car> list = carService.findAll();
		List<Car> myList = new ArrayList<>();
		
		Collections.shuffle(list);
		for(int i = 1; i < 4; i++){
			myList.add(list.get(i));
		}

		theModel.addAttribute("cars", myList);

		return "index";
	}

	@GetMapping("/dashboard")
	public String showHome() {
		return "dashboard";
	}

}
