package com.array.practise;

public class ReverseAnArray {
	
	
	public int[] reverse(int[] arr) {
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		ReverseAnArray rr=new ReverseAnArray();
		int[] arr={4, 5, 1, 2};
		int[] reverse = rr.reverse(arr);
		for(int i=0;i<reverse.length;i++) {
			System.out.println(reverse[i]);
		}
	}

}
