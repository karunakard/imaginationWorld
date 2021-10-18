package com.java.mapflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	
	public static void main(String[] args) {
		List<Customer> customers = EkartDatabaseDao.getAll();
		//get the email ids in one list
		
		List<String> emails = customers.stream().map(Customer->Customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		
		//get the phone numbers, here we get the list of streams by using map so to convert it in to single stream we need to use 
		//flatmap
		
		List<List<String>> phoneNumbers = customers.stream().map(Customer->Customer.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(phoneNumbers);
		List<String> phones = customers.stream().flatMap(Customer->Customer.getPhoneNumbers().stream()).collect(Collectors.toList());
		
		System.out.println(phones);
	}

}
