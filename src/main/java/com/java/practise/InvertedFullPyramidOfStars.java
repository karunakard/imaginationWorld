package com.java.practise;

public class InvertedFullPyramidOfStars {
	
	
	
	public static void main(String[] args) {
		int  rows=5,count=rows,k=0;
		for(int i=1;i<=rows;i++) {
			for(int space=1;space<=i-1;space++) {
				System.out.print(" ");
			}
		
			while(k!=2*count-1) {
				System.out.print("*");
				k++;
			}
			k=0;
			count--;
			System.out.println();
			
		}
		
		
		
	}

}
