package com.addressbook.addressbookapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.addressbook.addressbookapp.model.ContactPerson;
import com.addressbook.addressbookapp.service.AddressBookService;
@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	@Autowired
	private AddressBookService addressbookservice;
	
	@PostMapping("/contact")
	public String addContact(@RequestBody ContactPerson contact)
	{
		return addressbookservice.addContact(contact);
	}
	@GetMapping("/")
	public String home() {
	    return "Address Book Application is Running";
	}
	

}
