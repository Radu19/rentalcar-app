package com.springboot.rentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.rentapp.entity.Customer;
import com.springboot.rentapp.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String showCustomerList(Model theModel) {
		List<Customer> customers = customerService.findAll();
		theModel.addAttribute("customers", customers);
		return "/customers/customers-list";
	}
}
