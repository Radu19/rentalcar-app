package com.springboot.rentapp.controller;

import com.springboot.rentapp.entity.Contact;
import com.springboot.rentapp.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    public ContactService contactService;

    public String showContactPage(Model theModel){
        theModel.addAttribute("contact", new Contact());
        return "contact-page";
    }
}
