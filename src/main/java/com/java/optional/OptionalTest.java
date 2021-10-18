package com.java.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.java.mapflatmap.Customer;
import com.java.mapflatmap.EkartDatabaseDao;

public class OptionalTest {
	
	public static Customer getCustomer(String email) throws Exception {
		List<Customer> customers = EkartDatabaseDao.getAll();
		Customer customer2 = customers.stream().filter(customer->customer.getEmail().equals(email)).findAny().orElseThrow(()->new Exception("no email is present"));
		
		return customer2;
	}
	
	public static void main(String[] args) throws Exception {
		Customer customer = new Customer(12, "karan",null,Arrays.asList("2233445665","3343212345") );
		//empty
		//of
		//ofNullable
		//Optional<Object> empty = Optional.empty();
		//System.out.println(empty);
		
		//if we know that object we are passing is not null
		//Optional<String> emailOptional = Optional.of(customer.getEmail());
		//System.out.println(emailOptional);
		
		Optional<String> ofNullable = Optional.ofNullable(customer.getEmail());
		/*
		 * if(ofNullable.isPresent()) { System.out.println(ofNullable.get()); }
		 * 
		 */
		//String orElseThrow = ofNullable.orElseThrow(()->new IllegalArgumentException("email not present"));
		//System.out.println(orElseThrow);
		
		//ofNullable.map(String::toUpperCase);
		
		getCustomer("pre");
	}

}
