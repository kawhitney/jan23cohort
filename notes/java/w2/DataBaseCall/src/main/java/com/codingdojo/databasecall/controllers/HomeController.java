package com.codingdojo.databasecall.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.databasecall.models.Contact;
import com.codingdojo.databasecall.services.ContactService;

@Controller
public class HomeController {
	// attribute
	// creating accessibility to service
	private final ContactService contactService;
	
	
	// constructor
	public HomeController(ContactService contactService) {
		this.contactService = contactService;
	}

	@RequestMapping("/")
	public String index(Model model) { // model is an interface
		// getting all contacts
		List<Contact> contacts = contactService.allContacts();
		// passing info into jsp
		model.addAttribute("viewContacts", contacts);
		
		return "index.jsp";
	}
}
