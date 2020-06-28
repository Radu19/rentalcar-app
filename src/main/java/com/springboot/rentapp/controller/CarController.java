package com.springboot.rentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.rentapp.entity.Car;
import com.springboot.rentapp.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

	@Autowired
	private CarService carService;
	
	@GetMapping("/list")
	public String listCars(Model theModel) {
		List<Car> theCars = carService.findAll();
		theModel.addAttribute("cars", theCars);
		return "/cars/list-cars";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		String img = (String) theModel.asMap().get("carName");
		Car theCar = new Car();
		if(img!=null) {
			theCar.setImg(img);
		}
		theModel.addAttribute("car", theCar);
		return "/cars/car-form";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("carId") int theId, 
			Model theModel) {
		Car theCar = carService.findById(theId);
		theModel.addAttribute("car", theCar);
		return "/cars/car-form";
	}
	
	@PostMapping("/save")
	public String saveCar(@ModelAttribute("car") Car theCar) {
		carService.save(theCar);
		return "redirect:/cars/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("carId") int theId) {
		carService.deleteById(theId);
		return "redirect:/cars/list";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("carBrand") String theBrand, Model theModel) {
		List<Car> theCars = carService.searchBy(theBrand);
		theModel.addAttribute("cars", theCars);
		return "/cars/list-cars";
	}
	
	
	
	
	
	
	
}
