package com.addressbook.addressbookapp.controller;
import java.util.List;

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
	@GetMapping("/contact")
	public List<ContactPerson> getContacts()
	{
	    return addressbookservice.getAllContacts();
	}
	@PutMapping("/contact/{firstName}")
	public String updateContact(@PathVariable String firstName,@RequestBody ContactPerson contact)
	{
		return addressbookservice.updateContact(firstName, contact);
	}
	

}
