package com.springboot.rentapp.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.rentapp.entity.Car;
import com.springboot.rentapp.entity.Customer;
import com.springboot.rentapp.entity.Order;
import com.springboot.rentapp.entity.User;
import com.springboot.rentapp.service.CarService;
import com.springboot.rentapp.service.CustomerService;
import com.springboot.rentapp.service.UserService;

@Controller
@RequestMapping("/catalog")
public class CatalogController {
	
	private String admin = "susan";
	
	private CarService carService;
	
	public CatalogController(CarService theCarService) {
		carService = theCarService;
	}
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CustomerService customerService;
	
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
		System.out.println("GetMapping /view <><><> \n");
		User theUser = userService.findByUserName(admin);
		
		Car theCar = carService.findById(theId);
		LocalDateTime orderDateLocal = LocalDateTime.now();
		LocalDateTime startDateLocal = LocalDateTime.now().plusDays(1);
		LocalDateTime endDateLocal = LocalDateTime.now().plusDays(3);
		
		Order theOrder = null;
		try {
			theOrder = new Order();
			theOrder.setCar(theCar);
			theOrder.setUser(theUser);
			theOrder.setOrderDate(orderDateLocal);
			theOrder.setStartDate(startDateLocal);
			theOrder.setEndDate(endDateLocal);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
//		System.out.println("Order date>>>" + orderDateLocal + "\nStart date>>>" + startDateLocal + " \nEnd date>>> " + endDateLocal);
		theModel.addAttribute("car", theCar);
		theModel.addAttribute("order", theOrder);
		theModel.addAttribute("user", theUser);
		System.out.println(theUser);
		
		return "/catalog/car-view";
	}
	
	@PostMapping("/reservation")
	public String reservation(@ModelAttribute("order") Order theOrder, RedirectAttributes redirectAttributes) {
		System.out.println("\nPostMapping /reservation <><><> \n");
		User theUser = null;
		Car theCar = null;
		
		try {
			theCar = theOrder.getCar();
			theUser = theOrder.getUser();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(">>>>>>>my Order " + theOrder);
		System.out.println(">>>>>>>my Car " + theCar);
		System.out.println(">>>>>>>my User " + theUser);
		
		redirectAttributes.addFlashAttribute("order", theOrder);
		redirectAttributes.addFlashAttribute("car", theCar);
		
		return "redirect:/catalog/reservationForm";
	}
	
	@GetMapping("/reservationForm")
	public String reservation(Model theModel) {
		System.out.println("\nGetMapping /reservationForm <><><> \n");
		
		Car theCar = (Car) theModel.asMap().get("car");
		Order theOrder = (Order) theModel.asMap().get("order");
		
		System.out.println("Car from ReservationForm>>>>"+theCar);
		System.out.println("Order from ReservationForm>>>>"+theOrder);
		
		return "/catalog/order-form";
	}
	
	@PostMapping("/reservation/complete")
	public String reservationComplete() {
		return null;
	}
	
	
}
