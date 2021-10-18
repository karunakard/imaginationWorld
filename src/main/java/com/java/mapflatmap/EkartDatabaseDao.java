package com.java.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabaseDao {
	
	public static List<Customer> getAll(){
		
		return Stream.of(new Customer(12, "karan", "karan@gmail.com", Arrays.asList("2233445566","1144667788")),
				new Customer(23,"john","johnboe@gmail.com",Arrays.asList("2233115566","1144667788")),
				new Customer(26,"darren","darrenbb@gmail.com",Arrays.asList("2233995566","1144227788")),
				new Customer(29, "joe", "joesharma@gmail.com", Arrays.asList("2233445566","1144667788"))).collect(Collectors.toList());
	}

}
