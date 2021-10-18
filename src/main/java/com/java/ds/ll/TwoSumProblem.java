package com.java.ds.ll;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {
	
	public static int[] findSum1(int[] arr,int target) {
		int[] sumArry=new int[2];
		HashMap<Integer, Integer> map=new HashMap();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(target-arr[i])) {
				map.put(arr[i],i);
			}else {
				sumArry[0]=i;
				sumArry[1]=map.get(target-arr[i]);
				return sumArry;
			}
			
		}
		throw new IllegalArgumentException("two nos not found");
		
		
	}
	
	public static int[] findsumTwo(int[] arr,int target) {
		int[] sumArry=new int[2];
		int left=0;
		int right=arr.length-1;
		Arrays.sort(arr);
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				sumArry[0]=arr[left];
				sumArry[1]=arr[right];
				return sumArry;
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
		}
		
		throw new IllegalArgumentException("two nos not found");
	}
	
	
	public static void main(String[] args) {
		int[] arr=new int[] {2,11,5,10,7,8};
		//int[] findSum1 = findSum1(arr,9);
		int[] findsumTwo = findsumTwo(arr,9);
		System.out.println(findsumTwo[0]+findsumTwo[1]);
		
		
	}

}
