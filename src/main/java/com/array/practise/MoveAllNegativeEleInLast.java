package com.array.practise;

public class MoveAllNegativeEleInLast {
	
	
	public static int[] moveNegativeEleToLast(int[] arr) {
		int noOfPos=0;
		int[] mytemp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				mytemp[noOfPos]=arr[i];
				noOfPos++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				mytemp[noOfPos]=arr[i];
				noOfPos++;
			}
		}
		
		return mytemp;
		
	}
	
	public  static int[] negativeBeforePositive(int[] arr) {
		int noOfPos=0;
		int[] mytemp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				mytemp[noOfPos]=arr[i];
				noOfPos++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				mytemp[noOfPos]=arr[i];
				noOfPos++;
			}
		}
		return mytemp;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr={1, -1, 3, 2, -7, -5, 11, 6 };
		int[] moveNegativeEleToLast = moveNegativeEleToLast(arr);
		for(int i=0;i<arr.length;i++) {
			//System.out.println(moveNegativeEleToLast[i]);
			
		}
		int[] arr1= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int[] negativeBeforePositive = negativeBeforePositive(arr1);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(negativeBeforePositive[i]);
		}
	}

}
