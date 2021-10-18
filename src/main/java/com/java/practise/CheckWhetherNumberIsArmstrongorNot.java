package com.java.practise;

public class CheckWhetherNumberIsArmstrongorNot {
	
	
	public static void main(String[] args) {
		int number=153;
		int remainder=0;
		int originalNumber=number;
		int result=0;
		while(originalNumber!=0) {
			remainder=originalNumber%10;
			result=result+(remainder*remainder*remainder);
			originalNumber=originalNumber/10;
			
		}
		if(result==number) {
			System.out.println("Number is armstrong");
		}else {
			System.out.println("number is not armstrong");
		}
		
	}

}
