package com.java.mapreduce;

import java.util.ArrayList;
import java.util.List;



public class EmployeesDao {
	
	public static List<Employee> getEmployees(){
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(1, "karan","C", 100000));
		employees.add(new Employee(2, "karuna", "A", 300000));
		employees.add(new Employee(3, "sudeep", "C", 200000));
		employees.add(new Employee(2, "aman", "A", 600000));
		employees.add(new Employee(2, "vamshi", "A", 700000));
		return employees;
	}

}
