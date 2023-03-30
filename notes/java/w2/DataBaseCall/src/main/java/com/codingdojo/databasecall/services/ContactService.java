package com.codingdojo.databasecall.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.databasecall.models.Contact;
import com.codingdojo.databasecall.repositories.ContactRepository;

@Service
public class ContactService {	
	// attributes
	// adding the repo dependency
	private final ContactRepository contactRepo;
	
	// constructor
	public ContactService(ContactRepository contactRepo) {
		this.contactRepo = contactRepo;
	}
	// methods
	// create
	// find all
	public List<Contact> allContacts(){
		return contactRepo.findAll();
	}
}
