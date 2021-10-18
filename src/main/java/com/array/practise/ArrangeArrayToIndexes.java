package com.array.practise;

public class ArrangeArrayToIndexes {
	
	public static void arrangeArrayAccToIndex(int[] arr,int[] index) {
		int[] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[index[i]]=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=temp[i];
		}
		
		//arr
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//index
		for(int j=0;j<index.length;j++) {
			System.out.println(index[j]);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr= {10,11,12};
		int index[]= {1,0,2};
		arrangeArrayAccToIndex(arr,index);
	}

}
