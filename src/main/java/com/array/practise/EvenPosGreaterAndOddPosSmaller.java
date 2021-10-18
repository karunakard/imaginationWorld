package com.array.practise;

import java.util.Arrays;

public class EvenPosGreaterAndOddPosSmaller {
	
	public static int[] evenPosNoGreaterThanPrevAndOddLessThanPrev(int[] arr) {
		Arrays.sort(arr);
		int[] myarr=new int[arr.length];
		int evenPos=0;
		int oddPos=0;
		if(arr.length%2==0) {
			evenPos=arr.length/2-1;
			oddPos=arr.length-evenPos-1;
		}else {
			evenPos=arr.length/2;
			oddPos=arr.length-evenPos;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				myarr[i]=arr[evenPos];
				evenPos--;
			}else {
				myarr[i]=arr[oddPos];
				oddPos++;
			}
			}
			
		
		return myarr;
		
	}
	
	
	
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5, 6, 7};
		int[] evenodd = evenPosNoGreaterThanPrevAndOddLessThanPrev(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(evenodd[i]);
		}
	}

}
