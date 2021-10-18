package com.array.practise;

import java.util.Arrays;

public class ArrangeArrayInSmallestLarget {
	
	
	public static int[] arrangeInSmallAndLarge(int[] arr) {
		Arrays.sort(arr);
		int[] myArr=new int[arr.length];
		int left=0;
		int right=arr.length-1;
		int k=0;
		while(left<right) {
				myArr[k]=arr[left];
				myArr[++k]=arr[right];
				k++;
				left++;
				right--;
			}
		
		if(arr.length%2!=0) {
			myArr[k]=arr[right];
		}
			
		
		
		
		
		
		
		return myArr;
	}
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int[] minmax = arrangeInSmallAndLarge(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(minmax[i]);
		}
		
	}

}
