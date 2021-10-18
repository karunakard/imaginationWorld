package com.array.practise;

public class BinarySearch {
	
	
	public int binary(Integer[] arr,int low,int high,int x) {
	
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x) {
				return arr[mid];
			}else if(x<arr[mid]) {
				return binary(arr,low,mid,x);
			}else {
				return binary(arr,mid+1,high,x);
			}
			
		}
		
		
		
		return -1;
		
	}
	
	
	
	public static void main(String[] args) {
		BinarySearch search=new BinarySearch();
		Integer[] arr= {1,2,3,4,5,6,7};
		int value = search.binary(arr,0,arr.length-1,9);
		if(value==9) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		
		
	}

}
