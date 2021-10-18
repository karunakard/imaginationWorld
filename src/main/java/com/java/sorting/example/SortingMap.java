package com.java.sorting.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.java.streamapi.example.Employee;
//import java.util.Map; ch.qos.logback.core.net.SyslogOutimport ch.qos.logback.core.net.SyslogOutputStream;

public class SortingMap {
	
	public static  void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"karan");
		map.put(2,"aman");
		map.put(3,"sudeep");
		map.put(4,"raju");
		//ArrayList<Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
		//Collections.sort(list,( o1, o2)-> o2.getKey()-o1.getKey());
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);			
		
		//System.out.println(list);
		
		Map<Employee,Integer> employeeMap=new TreeMap<>((o1,o2) ->(int) (o1.getSalary()-o2.getSalary()));
			
		employeeMap.put(new Employee(1, "karan","java", 100000), 60);
		employeeMap.put(new Employee(2, "karuna", "sap", 300000), 40);
		employeeMap.put(new Employee(3, "sudeep", "sas", 200000), 50);
		employeeMap.put(new Employee(2, "aman", "dotnet", 600000), 70);
		employeeMap.put(new Employee(2, "vamshi", "php", 700000), 80);
		
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(t->System.out.println(t));
		
		
		//System.out.println(employeeMap);
	}

}
