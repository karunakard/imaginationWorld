package com.array.practise;

public class ReplaceTheCurrWithPrevAndNext {
	
	
	public static  int[] replcurrentEleWithMulPrevAndNext(int[] arr) {
	   int[] mytemp=new int[arr.length];
	 
	   for(int i=0;i<arr.length;i++) {
		   if(i==0) {
			   mytemp[i]=arr[i]*arr[i+1];  
		   }else if(i==arr.length-1) {
			   mytemp[i]=arr[i-1]*arr[i];
		   }else {
			   mytemp[i]=arr[i-1]*arr[i+1];
		   }
		   
		   
	   }
		
		return mytemp;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6};
		int[] current = replcurrentEleWithMulPrevAndNext(arr);
		for(int i=0;i<current.length;i++) {
			System.out.println(current[i]);
		}
		
	}

}
