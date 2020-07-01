package com.springboot.rentapp.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.rentapp.entity.User;
import com.springboot.rentapp.service.UserService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		List<User> theUsers = userService.findAll();
		theModel.addAttribute("employees", theUsers);
		return "/employees/list-employees";
	}
	
	@RolesAllowed("ROLE_ADMIN")
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") Long theId) {
		userService.deleteById(theId);
		return "redirect:/employees/list";
	}
}
