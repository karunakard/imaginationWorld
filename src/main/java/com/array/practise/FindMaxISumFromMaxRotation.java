package com.array.practise;

public class FindMaxISumFromMaxRotation {
	
	public int maxSumAfterMaxRotation(int[] arr) {
		int maxSummation=0;
		for(int i=0;i<arr.length;i++) {
			int rotateArrayAndSummation = rotateArrayAndSummation(arr);
			if(rotateArrayAndSummation>maxSummation) {
				maxSummation=rotateArrayAndSummation;
			}
		}
		
		return maxSummation;
	}
	
	public int rotateArrayAndSummation(int[] arr) {
		int j=0;
		int temp=arr[0];
		int sum=0;
		for(int i=0;i<arr.length-1;i++) {
			j=i+1;
			arr[i]=arr[j];
			sum=sum+j*arr[j];
		}
		arr[j]=temp;
		System.out.println(sum);
		return sum;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		FindMaxISumFromMaxRotation vnew=new FindMaxISumFromMaxRotation();
		int[] arr={10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int maxSumAfterMaxRotation = vnew.maxSumAfterMaxRotation(arr);
		System.out.println(maxSumAfterMaxRotation);
		
	}

}
