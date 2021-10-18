package com.java.practise;

public class PascalsTraingle {
	
	
	public static void main(String[] args) {
		int rows=6,coeff=1;
		for(int i=1;i<=rows;i++) {
			for(int space=1;space<=rows-i;space++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(j==0 || i==0) {
					coeff=1;
				}else {
					coeff=coeff*(i-j+1)/j;
				}
				System.out.print(coeff+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
