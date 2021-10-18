package com.java.streamapi.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public static List<Employee> getEmployees(){
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(1, "karan","java", 100000));
		employees.add(new Employee(2, "karuna", "sap", 300000));
		employees.add(new Employee(3, "sudeep", "sas", 200000));
		employees.add(new Employee(2, "aman", "dotnet", 600000));
		employees.add(new Employee(2, "vamshi", "php", 700000));
		return employees;
	}
	
	

}
