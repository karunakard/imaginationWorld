package com.array.practise;

public class MinElementInSortedAndRotatedArray {
	
	
	public int findMinEleInRotatedArray(int[] arr,int low,int high) {
		while(low < high)
	    {
	        int mid = low + (high - low) / 2;
	        if (arr[mid] == arr[high])
	            high--;
	             
	        else if(arr[mid] > arr[high])
	            low = mid + 1;
	        else
	            high = mid;
	    }
	    return arr[high];
	}
	
	
	
	public static void main(String[] args) {
		MinElementInSortedAndRotatedArray min=new MinElementInSortedAndRotatedArray();
		int[] arr={1,2,3,4,5,6};
		System.out.println(2%4);
		int findMinEleInRotatedArray = min.findMinEleInRotatedArray(arr, 0,arr.length-1);
		System.out.println(findMinEleInRotatedArray);
		
		
	}

}
