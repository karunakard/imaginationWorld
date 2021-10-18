package com.array.practise;

public class CLockwiseRotationOfArray {
	
	public void ClockwiseRotate(Integer[] arr,int d, int n) {
		
		for(int i=0;i<d;i++) {
			rotate(arr,n);
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		
		
	}
	
	
	public void rotate(Integer[] arr,int n) {
		int j=n-1;
		int temp=arr[j];
		while(j>0) {
			arr[j]=arr[j-1];
			j--;
		}
		arr[j]=temp;
		
	}
	
	
	public static void main(String[] args) {
		CLockwiseRotationOfArray arrc=new CLockwiseRotationOfArray();
		Integer[] arr= {1,2,3,4,5};
		int d=2;
		int n=arr.length;
		arrc.ClockwiseRotate(arr, d, n);
	}

}
