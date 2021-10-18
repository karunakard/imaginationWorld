package com.array.practise;

public class ArrayAtEvenAndOdd {
	
	public static int[] rearrangeArrayAtEvenAndOdd(int[] arr) {
		int position=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1] && position%2!=0 ){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
			position++;
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,2,1};
		int[] rearrange = rearrangeArrayAtEvenAndOdd(arr);
		for(int i=0;i<rearrange.length;i++) {
			System.out.println(rearrange[i]);
		}
		
		
	}

}
