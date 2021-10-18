package com.java.ds.ll;

public class MissingNumber {
	
	public static int findMissingNumber(int[] arr) {
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int missingNumber=sum;
		for(int i=0;i<arr.length;i++) {
			missingNumber=missingNumber-arr[i];
		}
		
		return missingNumber;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr=new int[] {1,3,6,8,2,4,7};
		int missingNumber = findMissingNumber(arr);
		System.out.println(missingNumber);
	}

}
