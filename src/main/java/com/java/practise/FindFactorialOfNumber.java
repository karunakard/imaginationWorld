package com.java.practise;

public class FindFactorialOfNumber {
	
	
	public static int findFactorial(int number) {
		
		if(number<=1) 
			return 1;
		
		return number*findFactorial(number-1);
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(findFactorial(9));
		
	}

}
