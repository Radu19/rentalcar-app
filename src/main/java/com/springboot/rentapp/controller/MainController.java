package com.springboot.rentapp.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.rentapp.entity.Car;
import com.springboot.rentapp.entity.Contact;
import com.springboot.rentapp.entity.Customer;
import com.springboot.rentapp.entity.Order;
import com.springboot.rentapp.service.CarService;
import com.springboot.rentapp.service.ContactService;
import com.springboot.rentapp.service.CustomerService;
import com.springboot.rentapp.service.OrderService;

@Controller
public class MainController {

	@Autowired
	private CarService carService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ContactService contactService;

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
	public String showHome(Model theModel) {
		List<Car> cars = carService.findAll();
		List<Order> orders = orderService.findAll();
		List<Customer> customers = customerService.findAll();
		List<Contact> contacts = contactService.findAll();
		theModel.addAttribute("nrCars", cars.size());
		theModel.addAttribute("nrOrders", orders.size());
		theModel.addAttribute("nrCustomers", customers.size());
		theModel.addAttribute("nrContacts", contacts.size());
		return "dashboard";
	}

}
