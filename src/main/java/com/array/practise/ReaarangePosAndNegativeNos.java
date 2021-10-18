package com.array.practise;

public class ReaarangePosAndNegativeNos {
	
	
	public static  int[] rearrangedPosAndNegNos(int[] arr) {
		int PosNoLength=0;
		int negaNoLength=0;
		int temparr[] =new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				negaNoLength++;
			}
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>0) {
				temparr[negaNoLength]=arr[j];
				negaNoLength++;
			}else {
				temparr[PosNoLength]=arr[j];
				PosNoLength++;
			}
		}
		
		return temparr;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {12,11,-13,-5,6,-7,5,-3,-6};
		int[] rearrangedPosAndNegNos = rearrangedPosAndNegNos(arr);
		for(int i=0;i<rearrangedPosAndNegNos.length;i++) {
			System.out.println(rearrangedPosAndNegNos[i]);
		}
		
	}

}
