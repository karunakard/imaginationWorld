package com.array.practise;

public class AnotherWayToRotateArray {
	
	//first divide array in to two parts one 0 to d and another d to n
	//reverse 0 to d and reverse d to n and then reverse start to end
	public  Integer[] rotateArray(Integer[] arr,int d,int n) {
		if(d==0) {
			return null;
		}
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,n-1);
		reverseArray(arr,0,n-1);
		
		return arr;
		
	}
	
	
	public void reverseArray(Integer[] arr,int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Integer[] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		int d=2;
		Integer[] rotateArray = new AnotherWayToRotateArray().rotateArray(arr, d, n);
		for(int i=0;i<rotateArray.length;i++) {
			System.out.println(rotateArray[i]);
		}
		
	}

}
