package com.java.practise;

public class FindPrimeBetweenTwoNumbers {
	
	
	public static void main(String[] args) {
		int N1=10;
		int N2=20;
		int flag=0;
		for(int n1=N1;n1<=N2;n1++ ) {
			for(int i=2;i<=n1/2;i++) {
				if(n1%i==0) {
					flag=1;
					break;
				}else {
					flag=0;
				}
			}
			if(flag==0) {
				System.out.println("number is prime: "+n1);
			}
			
		}
		
	}

}
