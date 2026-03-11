package com.addressbook.addressbookapp.service;
import java.util.ArrayList;

import java.util.List;
import org.springframework.stereotype.Service;

import com.addressbook.addressbookapp.model.ContactPerson;
@Service
public class AddressBookService {
	private List<ContactPerson> contactList=new ArrayList<>();
	public String addContact(ContactPerson contact)
	{
		contactList.add(contact);
		return "contact added successfully";
	}
	public List<ContactPerson> getAllContacts()
	{
		return contactList;
	}
	public String updateContact(String firstName,ContactPerson updatedContact)
	{
		for(ContactPerson contact:contactList)
		{
			if(contact.getFirstName().equalsIgnoreCase(firstName))
			{
				contact.setLastName(updatedContact.getLastName());
				contact.setAddress(updatedContact.getAddress());
				contact.setCity(updatedContact.getCity());
				contact.setState(updatedContact.getState());
				contact.setZip(updatedContact.getZip());
				contact.setPhoneNumber(updatedContact.getPhoneNumber());
				contact.setEmail(updatedContact.getEmail());
				return "Contact updated successfully";
			}
			
		}
		return "contact not found with such name";
	}

	
	
}
