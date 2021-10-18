package com.array.practise;

public class LinearSearch {
	
	public boolean linear(Integer[] arr,int n,int x) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return true;
			}
		}
		return false;
		
		
	}
	
	
	public static void main(String[] args) {
		LinearSearch search=new LinearSearch();
		Integer[] arr= {1,2,3,4,5};
		boolean value = search.linear(arr, arr.length,6);
		System.out.println(value);
		
	}

}
