package com.springboot.rentapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String showIndex() {
		return "index";
	}
	
	// add request mapping for employees
	
	@GetMapping("/cars")
    public String showHome() {
        return "home";
    }
	
	
}










