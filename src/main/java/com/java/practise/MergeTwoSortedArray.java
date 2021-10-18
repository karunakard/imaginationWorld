package com.java.practise;

public class MergeTwoSortedArray {
	
	public static int[] mergeSortedArray(int[] arr1,int[] arr2) {
		int[] result=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length&& j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				result[k]=arr1[i];
				i++;
				k++;
			}else {
				result[k]=arr2[j];
				j++;
				k++;
			}
			
		}
		while(j<arr2.length) {
			result[k]=arr2[j];
			j++;
			k++;
		}
		
		while(i<arr1.length) {
			result[k]=arr1[i];
			i++;
			k++;
		}
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {2,4,6,8};
		int[] arr2= {5,7,9,10};
		int[] mergeSortedArray = mergeSortedArray(arr,arr2);
		for(int s:mergeSortedArray) {
			System.out.println(s);
		}
		
		
		
	}

}
