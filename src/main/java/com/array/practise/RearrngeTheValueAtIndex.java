package com.array.practise;

public class RearrngeTheValueAtIndex {
	
	
	public static  int[] reaarengeValueAndIndex(int[] arr) {
		int[] myarr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			myarr[arr[i]]=i;
		}
		return myarr;
	}
	public static  int[] reaarengeValueAndIndexWS(int[] arr) {
		int k=0;
		for(int i=0;i<arr.length;i++) {
			k=arr[arr[i]];
			arr[k]=i;
			
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr= {1,3,0,2};
		int[] val = reaarengeValueAndIndex(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(val[i]);
		}
		
	}

}
