package com.java.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyPredicate{

	
	
	public static void main(String[] args) {
		
		Predicate<Integer> pred=t->t%2==0;
				
				
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		list.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
	//System.out.println(pred.test(10));
	}
	

}
