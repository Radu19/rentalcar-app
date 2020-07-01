package com.springboot.rentapp.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.rentapp.entity.Contact;
import com.springboot.rentapp.service.ContactService;

@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    public ContactService contactService;

    @GetMapping("/form")
    public String showContactPage(Model theModel){
    	if(!theModel.containsAttribute("contact")) {
			Contact theContact = new Contact();
			theModel.addAttribute("contact", theContact);
		}
        return "/contacts/contact-page";
    }

    @PostMapping("/process-request")
    public String processRequest(@Valid @ModelAttribute("contact") Contact theContact, BindingResult theBindingResult, RedirectAttributes attributes){
    	if(theBindingResult.hasErrors()) {
			attributes.addFlashAttribute("org.springframework.validation.BindingResult.contact", theBindingResult);
			attributes.addFlashAttribute("contact", theContact);
			return "redirect:/contact/form";
		}
        contactService.save(theContact);
        attributes.addFlashAttribute("message", "Thank you for your message!");
        return "redirect:/contact/form";
    }
    
    @GetMapping("/list")
    public String showContactsList(Model theModel) {
    	List<Contact> contacts = contactService.findAll();
    	theModel.addAttribute("contacts", contacts);
    	return "/contacts/contacts-list";
    }
    
    @RolesAllowed("ROLE_ADMIN")
    @GetMapping("/delete")
    public String deleteContact(@RequestParam("contactId") int contactId) {
    	contactService.deleteById(contactId);
    	return "redirect:/contact/list";
    }
}
