package com.springboot.rentapp.controller;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

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
import com.springboot.rentapp.service.OrderService;
import com.springboot.rentapp.service.UserService;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
	
	private Long adminId = (long) 3;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CarService carService;
	
	@Autowired
	private OrderService orderService;

	@PostMapping("/start")
	public String reservation(@ModelAttribute("customer") Customer theCustomer, @RequestParam("carId") int carId ,RedirectAttributes redirectAttributes) {
		System.out.println("\nPostMapping /start <><><> \n");
		
		int phoneNr = theCustomer.getPhoneNr();
		Customer extractCustomer = customerService.findByPhoneNr(phoneNr);
		if(extractCustomer!=null) {
			theCustomer = extractCustomer;
		}else {
			customerService.save(theCustomer);
		}
		
		redirectAttributes.addFlashAttribute("customerId", theCustomer.getId());
		redirectAttributes.addFlashAttribute("carId", carId);
		
		System.out.println("CarId" + carId);
		return "redirect:/reservation/form";
	}
	
	@GetMapping("/form")
	public String reservation(Model theModel) {
		System.out.println("\nGetMapping /form <><><> \n");
		
		int customerId = (int) theModel.asMap().get("customerId");
		int carId = (int) theModel.asMap().get("carId");
		System.out.println("CarId" + carId + "\nCustomerId"+ customerId);
		
		Car theCar = carService.findById(carId);
		Customer theCustomer = customerService.findById(customerId);
		
		LocalDateTime orderDateLocal = LocalDateTime.now();
		LocalDateTime startDateLocal = LocalDateTime.now().plusDays(1);
		LocalDateTime endDateLocal = LocalDateTime.now().plusDays(3);
		
		Order theOrder = null;
		try {
			theOrder = new Order();
			theOrder.setCar(theCar);
			theOrder.setCustomer(theCustomer);
			
			theOrder.setOrderDate(orderDateLocal);
			theOrder.setStartDate(startDateLocal);
			theOrder.setEndDate(endDateLocal);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		theModel.addAttribute("order", theOrder);
		theModel.addAttribute("car", theCar);
		theModel.addAttribute("customer", theCustomer);
		
		return "/catalog/order-form";
	}
	
	@PostMapping("/complete")
	public String reservationComplete(@ModelAttribute("order") Order theOrder, RedirectAttributes redirectAttributes) {
		System.out.println("\nPostMapping /complete <><><> \n");
		
		User theUser = userService.findById(adminId);
		
		LocalDateTime startDate = theOrder.getStartDate();
		LocalDateTime endDate = theOrder.getEndDate();
		int days = (int) ChronoUnit.DAYS.between(startDate, endDate);
		theOrder.setHireDays(days);
		
		Car theCar = null;
		try {
			theCar = theOrder.getCar();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		double totalCost = days*determinePrice(days, theCar);
		
		if(theOrder.getCasco()!=false) {
			totalCost+=days*theCar.getCasco();
		}
		
		theOrder.setTotalCost(totalCost);
		theOrder.setUser(theUser);
		theOrder.setPaymentStatus("Pending");
		theOrder.setStatus("In Process");
		
		orderService.save(theOrder);
		
		redirectAttributes.addFlashAttribute("order", theOrder);
		
		
		return "redirect:/reservation/complete";
	}
	
	@GetMapping("/complete")
	public String reservationComplete(Model theModel) {
		
		Order theOrder = (Order) theModel.asMap().get("order");
		
		return "/catalog/order-overview";
	}
	
	public double determinePrice(int hireDays, Car theCar) {
		double price = 0;
		if(hireDays < 3) {
			price = theCar.getPrice1();
		}else if(hireDays > 3 && hireDays <= 7) {
			price = theCar.getPrice2();
		}else if(hireDays > 7 && hireDays <= 14){
			price = theCar.getPrice3();
		}else if(hireDays > 14 && hireDays <= 364) {
			price = theCar.getPrice4();
		}else{
			price = theCar.getPrice5();
		}
		return price;
	}
}
