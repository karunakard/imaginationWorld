package com.java.streamapi.example;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
	
	public List<Employee> filterTaxEmployee(String input){
		return (input.startsWith("tax"))
			?EmployeeDao.getEmployees().stream().filter(t->t.getSalary()>500000).collect(Collectors.toList())
		    :EmployeeDao.getEmployees().stream().filter(t->t.getSalary()<500000).collect(Collectors.toList());
		
		
		
	}
	
	public static void main(String[] args) {
		//new EmployeeService().filterTaxEmployee();
		System.out.println(new EmployeeService().filterTaxEmployee("tax"));
	}

}
