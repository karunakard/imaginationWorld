package com.java.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyConsumer{

	
		
	
	public static void main(String[] args) {
		/*
		 * Consumer<Integer> consumer=t->System.out.println(t); consumer.accept(10);
		 */
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		list.stream().forEach(t->System.out.println(t));
	}

}
