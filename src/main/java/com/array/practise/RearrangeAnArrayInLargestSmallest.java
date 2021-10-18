package com.array.practise;

public class RearrangeAnArrayInLargestSmallest {
	
	
	public static int[] arrangeMaxMin(int[] arr) {
		int maxPos=0;
		int k=0;
		int[] temparr=new int[arr.length];
		if(arr.length%2==0) {
			maxPos=arr.length/2;
		}else {
			maxPos=(arr.length+1)/2;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		for(int i=0;i<maxPos;i++) {
			if(i!=arr.length-i-1) {
			temparr[k]=arr[i];
			temparr[++k]=arr[arr.length-i-1];
			k++;
			}else {
				temparr[k]=arr[i];
			}
		}
		
		
		
		return temparr;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr= {5, 8, 1, 4, 2, 9, 3, 7, 6};
		int[] arrangeMaxMin = arrangeMaxMin(arr);
		for(int i=0;i<arrangeMaxMin.length;i++) {
			System.out.println(arrangeMaxMin[i]);
		}
		
	}

}
