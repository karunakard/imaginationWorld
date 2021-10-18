package com.java.practise;

public class BubbleSort {
	
	public static int[]  sort(int[] arr) {
		boolean issorted;
		for(int i=0;i<arr.length-1;i++) {
			issorted=false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					issorted=true;
				}
				
			}
			if(issorted==false) {
				break;
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
