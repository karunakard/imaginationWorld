package com.java.practise;

public class FullPyramidOfNumbers{
	
	
	public static void main(String[] args) {
		int rows=5,count=0,count1=0,k=0;
		for(int i=1;i<=rows;i++) {
			for(int space=1;space<=rows-i;space++) {
				System.out.print(" ");
				count++;
			}
			while(k!=2*i-1) {
				if(count<=rows-1) {
					System.out.print(k+i);
					count++;
				}else {
					++count1;
					System.out.print(i+k-2*count1);
				}
				++k;
			}
			count=count1=k=0;
			System.out.println();
			
			
		}
			
	}

}
    
