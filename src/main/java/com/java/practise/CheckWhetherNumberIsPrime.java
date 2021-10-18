package com.java.practise;

public class CheckWhetherNumberIsPrime {
	
	
	public static void main(String[] args) {
		int flag=0;
		int number=1;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				flag=1;
				break;
			}
		}
		if(number==1) {
			System.out.println("1 is neither prime nor composite");
		}
		else {
			if(flag==0) {
				System.out.println("number is prime: "+ number);
			}else {
				System.out.println("number is non prime: "+ number);
			}
		}
		
		
		
	}

}
