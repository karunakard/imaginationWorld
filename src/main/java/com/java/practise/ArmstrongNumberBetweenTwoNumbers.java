package com.java.practise;

public class ArmstrongNumberBetweenTwoNumbers {
	
	
	public static void main(String[] args) {
		int low=100;
		int high=1000;
		int remainder,originalNumber,result;
		remainder=0;
		result=0;
		while(low<=high) {
			originalNumber=low;
			while(originalNumber!=0) {
				remainder=originalNumber%10;
				result=result+(remainder*remainder*remainder);
				originalNumber/=10;
			}
			if(result==low) {
				System.out.println("armstrong Number:"+low);
			}
			low++;
			remainder=0;
			result=0;
			
		}
		
		
		
		
	}

}
