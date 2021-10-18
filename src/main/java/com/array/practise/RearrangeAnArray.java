package com.array.practise;

public class RearrangeAnArray {
	
	
	public int[] rearrangeArray(int[] arr) {
		int[] temparr=new int[arr.length];
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>0) {
				temparr[arr[j]]=arr[j];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(temparr[i]==0) {
				temparr[i]=-1;
			}
		}
		
		
		return temparr;
	}
	
	 
	
	
	public static void main(String[] args) {
		RearrangeAnArray anarr=new RearrangeAnArray();
		int[] arr= {-1,-1,6,1,9,3,2,-1,4,-1};
		int[] rearrangeArray = anarr.rearrangeArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(rearrangeArray[i]);
		}
		
		
	}

}
