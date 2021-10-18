package com.array.practise;

import java.util.Arrays;

public class ArrayKthSmallestElement {
	
	
	public static int findkthSmallest(int[] arr,int k) {
		Arrays.sort(arr);
		return arr[k-1];
		
	}
	
	
	
	public static void main(String[] args) {
		int[] arr= {7,10,4,3,20,15};
	}

}
