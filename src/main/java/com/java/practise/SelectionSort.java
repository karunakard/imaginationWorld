package com.java.practise;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] sort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int minindex=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minindex=j;
				}
				
			}
			if(arr[i]>min) {
				arr[minindex]=arr[i];
				arr[i]=min;
			}
				
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
