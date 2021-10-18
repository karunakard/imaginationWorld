package com.java.practise;

import java.util.Arrays;

public class InsertionSort {
	
	public static int[] sort(int[] arr) {
		/*
		 * int[] sorted=new int[arr.length]; int[] unsorted;
		 */
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
			
			
			
			
			
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {7,2,5,1,4,3,8,6};
		int[] sort = sort(arr);
		for(int s:sort) {
			System.out.println(s);
		}
	}

}
