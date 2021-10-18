package com.basicjava.practise;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	
	public static void main(String[] args) {
		
		 ArrayList<Student> ar = new ArrayList<Student>();
	        ar.add(new Student(111, "bbbb", "london"));
	        ar.add(new Student(131, "aaaa", "nyc"));
	        ar.add(new Student(121, "cccc", "jaipur"));
	        
	        //Collections.sort(ar,new SortByRoll());
	        
	        Collections.sort(ar,new SortByName());
		
	}

}
