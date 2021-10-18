package com.java.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MySupplier {

	
	
	
	public static void main(String[] args) {
		
		Supplier<String> supplier=()-> "Hi karan";
		//System.out.println(supplier.get());
		
		List<String> list=Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(supplier));
	}

}
