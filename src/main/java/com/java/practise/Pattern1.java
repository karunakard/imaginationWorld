package com.java.practise;

public class Pattern1 {
	
	public static void pattern1() {
		int i=1, n=7;
		while(n>=1) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			i++;
			System.out.println();
			n--;
		}
		
	}
	
	public static void pattern2() {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=i;j++) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		//pattern1();
		pattern2();
	}

}
