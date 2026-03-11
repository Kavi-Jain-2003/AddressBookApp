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

	
	
}
