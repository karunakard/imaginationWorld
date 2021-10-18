package com.java.sorting.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.streamapi.example.Employee;
import com.java.streamapi.example.EmployeeDao;import ch.qos.logback.core.net.SyslogOutputStream;

public class SortingExample {
	
	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(1,2,3,5,4,8,7);
		//Collections.sort(integers);
		//Collections.reverse(integers);
	    //integers.stream().forEach(t->System.out.println(t));
		//integers.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));
	    List<Employee> employees = EmployeeDao.getEmployees();
	    //Collections.sort(employees,(o1,o2) ->(int) (o1.getSalary()-o2.getSalary()));
       // employees.stream().sorted((o1,o2) ->(int) (o2.getSalary()-o1.getSalary())).forEach(t->System.out.println(t));
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
		
	   // System.out.println(employees);
	    
	}

}
