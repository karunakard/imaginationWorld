package com.java.practise;

public class FibonacciSequence {
	
	
	public static int  findFibonacci(int number) {
		
		if(number<=1) 
			return number;
			
			
		return findFibonacci(number-1)+findFibonacci(number-2);
		
	}
	
	public static void main(String[] args) {
		int input=3;
		int output=34;
		int f1=0;
		int f2=1;
		int result=0;
		for(int i=1;i<input;i++) {
			result=f1+f2;
			f1=f2;
			f2=result;
		}
		//System.out.println(result);
		
		System.out.println(findFibonacci(9));
		
		
	}

}
