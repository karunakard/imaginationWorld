package com.array.practise;

public class MInSwapToBringElementTogether {
	
	public int minSwap(int[] arr,int k) {
		int left=0;
		int right=arr.length;
		int count=0;
		int minSwap=0;
		while(left<right) {
			if(arr[left]<=k) {
				count++;
				if(count>1) {
					int temp=arr[left];
					arr[left]=arr[count];
					arr[count]=temp;
					minSwap++;
				}
			}
			left++;
		}
		return minSwap;
	}
	
	public static void main(String[] args) {
		MInSwapToBringElementTogether min=new MInSwapToBringElementTogether();
		int[] arr={2, 7, 9, 5, 8, 7, 4};
		System.out.println(min.minSwap(arr, 5));
		
	}

}
