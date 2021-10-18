package com.basicjava.practise;

public interface ProductCreation {
	
	void create() throws ArrayIndexOutOfBoundsException;
	
	static int print() {
		return 9;
	}
	
	default void msg() {
		
		System.out.println("print msg");
	}

}
