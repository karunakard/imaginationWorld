package com.java.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceTest {
	
	public static void main(String[] args) {
		List<String> subjects = Arrays.asList("java","spring","hibernate");
		Optional<String> reduce = subjects.stream().reduce((a,b)->a.length()>b.length()?a:b);
		System.out.println(reduce.get());
		
		List<Integer> integers = Arrays.asList(1,2,3,7,9,12);
		int sum = integers.stream().mapToInt(i->i).sum();
		System.out.println(sum);
		Integer sumreduce = integers.stream().reduce(0, (a,b)->a+b);
		System.out.println(sumreduce);
		Optional<Integer> optreduce = integers.stream().reduce(Integer::sum);
		System.out.println(optreduce.get());
		Integer mulreduce = integers.stream().reduce(1, (a,b)->a*b);
		System.out.println(mulreduce);
		Integer maxreduce = integers.stream().reduce(1, (a,b)->a>b?a:b);
        System.out.println(maxreduce);
        
        List<Employee> employees = EmployeesDao.getEmployees();
        double asDouble = employees.stream().filter(employee->employee.getGrade().equalsIgnoreCase("A"))
        .map(employee->employee.getSalary()).mapToDouble(i->i).average().getAsDouble();
        System.out.println(asDouble);
        
        double sum2 = employees.stream().filter(employee->employee.getGrade().equalsIgnoreCase("A"))
        .map(employee->employee.getSalary()).mapToDouble(t->t).sum();
        System.out.println(sum2);
        
	}

}
