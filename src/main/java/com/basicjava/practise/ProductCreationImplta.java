package com.basicjava.practise;

public class ProductCreationImplta  extends ProductCreationImpl{
	
	/*
	 * public void create() { System.out.println("child class method"); }
	 */

	
	public static void main(String[] args) {
		ProductCreationImpl impl=new ProductCreationImpl();
		//impl.create();
		
		ProductCreationImplta implt=new ProductCreationImplta();
		//implt.create();
		
		ProductCreationImpl impl1=new ProductCreationImplta();
		impl1.create();
		
		impl=implt;
		//implt=(ProductCreationImpl)impl;
		
	}
}
