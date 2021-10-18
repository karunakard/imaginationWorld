package com.java.ds.ll;

public class MaximumSumsubArrayTest {
	
	public int maxsubArraySum(int[] arr) {
		int maxsofar=arr[0];
		int currentmaxSum=arr[0];
		for(int i=1;i<arr.length;i++) {
			currentmaxSum=currentmaxSum+arr[i];
			if(currentmaxSum<arr[i]) {
				currentmaxSum=arr[i];
			}
			if(maxsofar<currentmaxSum) {
				maxsofar=currentmaxSum;
			}
		}
		return maxsofar;
		
	}
	
	
	public static void main(String[] args) {
		MaximumSumsubArrayTest test=new MaximumSumsubArrayTest();
		int maxsubArraySum = test.maxsubArraySum(new int[] {4,3,-2,6,-12,7,-1,6});
		System.out.println(maxsubArraySum);
	}

}
