//package com.addressbook.addressbookapp;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import com.addressbook.addressbookapp.model.ContactPerson;
//import com.addressbook.addressbookapp.service.AddressBookService;
//
//public class AddressBookMain {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		AddressBookService abs=new AddressBookService();
//		System.out.println("Enter first name:");
//		String firstName = sc.nextLine();
//		System.out.println("Enter last name:");
//		String lastName = sc.nextLine();
//		System.out.println("Enter address:");
//		String address = sc.nextLine();
//		System.out.println("Enter city:");
//		String city = sc.nextLine();
//		System.out.println("Enter state:");
//		String state = sc.nextLine();
//		System.out.println("Enter zip:");
//		String zip = sc.nextLine();
//		System.out.println("Enter phone:");
//		String phone = sc.nextLine();
//		System.out.println("Enter email:");
//		String email = sc.nextLine();
//
//		ContactPerson cp = new ContactPerson(firstName, lastName, address, city, state, zip, phone, email);
//		System.out.println(abs.addContact(cp));
//		
//	}
//
//}
