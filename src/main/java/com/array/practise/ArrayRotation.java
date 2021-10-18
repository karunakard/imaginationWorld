package com.array.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayRotation {

	// first approach
	public static Integer[] arrayRotation(Integer[] arr, int n) {
		Integer[] arrnew = new Integer[n];
		int length = arr.length;
		int i = 0;
		int j = 0;
		for (int k = 0; k < arr.length; k++) {
			if (k < n) {
				arrnew[k] = arr[k];
			} else {
				arr[j] = arr[k];
				j++;

			}
		}
		while (j < length) {
			arr[j] = arrnew[i];
			j++;
			i++;
		}
		
		

		return arr;

	}

	// 2nd approach

	public static Integer[] arryRotate(Integer[] arr, int d, int n) {

		for (int i = 0; i < d; i++) {
			shiftArray(arr, n);
		}

		return arr;
	}

	public static void shiftArray(Integer[] arr, int n) {

		int temp = arr[0];
		for (int j = 0; j < n - 1; j++) {
			arr[j] = arr[j + 1];
		}
		arr[n - 1] = temp;

	}
	
	public int findBinaryAfterRotation(Integer[] arr,int low,int high,int value) {
		int pivot=findPivot(arr,low,high);
		if(pivot==-1) 
			return binary(arr,0,high,value);
		
		if(arr[pivot]==value) {
			return arr[pivot];
		}else if(value<arr[pivot]) {
			return findBinaryAfterRotation(arr,pivot+1,high,value);
		}else {
			return findBinaryAfterRotation(arr,low,pivot,value);
		}
		
		
	}
	
	public int findPivot(Integer[] arr,int high,int low) {
		if(high<low) {
			return -1;
		}
		if(low==high) {
			return low;
		}
		
		int mid=(low+high)/2;
		if(mid <high&& arr[mid]>arr[mid+1] ) {
			return mid+1;
		}
		if(mid>low && arr[mid]<arr[mid-1]) {
			return mid;
		}
		if(arr[low]>=arr[mid]) 
			return findPivot(arr,low,mid-1);
		
		
		return findPivot(arr,mid+1,high);
	}
	
	public int binary(Integer[] arr,int low,int high,int x) {
		
		while(low<=high) {
			int mid=(low+high)/2;;
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
	
	public boolean checkhesumInSortedAndRotArray(Integer[] arr,int sumValue) {
		int value=0;
		List<Integer> values=Arrays.asList(arr);
		for(int i=0;i<arr.length;i++) {
			value=sumValue-arr[i];
			if(values.contains(value)) {
				return true;
			}
		}
		
		return false;
		
	}
	public boolean checkhesumInSortedAndRotArrayWC(Integer[] arr,int sumValue) {
		
		
		return false;
	}

	public static void main(String[] args) {
		ArrayRotation ar=new ArrayRotation();
		//Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		Integer[] arr= {11,15,6,8,9,10};
		int value=2;
		// System.out.println(arr.length);
		//Integer[] arrayRotation = arrayRotation(arr, 2);
		//int bivalue = ar.findBinaryAfterRotation(arrayRotation, 0, arrayRotation.length-1, value);
		/*
		 * if(bivalue==value) { System.out.println("found"); }else {
		 * System.out.println("not found"); }
		 * 
		 * for (int m = 0; m < arrayRotation.length; m++) {
		 * System.out.println(arrayRotation[m]); }
		 */
		boolean checkhesumInSortedAndRotArray = ar.checkhesumInSortedAndRotArray(arr, 27);
        System.out.println(checkhesumInSortedAndRotArray);
	}

}
