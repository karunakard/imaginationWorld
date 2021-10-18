package com.java.practise;

public class CheckNumberPalindromeOrNot {
	
	
	public static void main(String[] args) {
		int number=0110;
		int rem=0;
		int originalNumber=number;
		int result=0;
		while(originalNumber!=0) {	
		rem=originalNumber%10;
		result=result*10+rem;
		originalNumber=originalNumber/10;
		}
		
		if(number==result) {
			System.out.println(number);
			System.out.println(result);
			System.out.println("palindrome");
		}
		
		
		
	}

}
