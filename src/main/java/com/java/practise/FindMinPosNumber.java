package com.java.practise;

public class FindMinPosNumber {
	
	public int findMinPos(int[] arr) {
		
		int min=0;
		for(int i:arr) {
			if(i>=0 && min==0) {
				min=i;
			}else if(i>0 && min>i) {
				min=i;
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] arr= {-1,11,-4,10,-20};
		int findMinPos = new FindMinPosNumber().findMinPos(arr);
		System.out.println(findMinPos);
	}

}
