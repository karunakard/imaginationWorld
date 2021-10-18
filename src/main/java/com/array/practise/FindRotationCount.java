package com.array.practise;

public class FindRotationCount {
	
	
	public int rotationCountInArray(int[] arr) {
		int i=1,j=arr.length-1;
		int count=0;
		while(i<j) {
			  
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				count=i;
				count++;
			}
			i++;
				  
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		FindRotationCount cou=new FindRotationCount();
		int[] arr={15, 18, 2, 3, 6, 12};
		int rotationCountInArray = cou.rotationCountInArray(arr);
		System.out.println(rotationCountInArray);
	}
		
	}