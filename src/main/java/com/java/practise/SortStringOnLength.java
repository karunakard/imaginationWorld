package com.java.practise;

public class SortStringOnLength {
	
	public static  String[] sortedString(String[] unsorted) {
		//String[] sorted=new String[unsorted.length];
		for(int i=0;i<unsorted.length;i++) {
			for(int j=i+1;j<unsorted.length;j++) {
				if(unsorted[j].length()>unsorted[i].length()) {
					String temp=unsorted[j];
					unsorted[j]=unsorted[i];
					unsorted[i]=temp;
				}
				
				
			}
		}
		
		return unsorted;
	}
	
	public static void main(String[] args) {
		
		String[] unsorted= {"karan","aman","singhania","vamshin","gaulers"};
		String[] sortedString = sortedString(unsorted);
		for(String str:sortedString) {
			System.out.println(str);
		}
		System.out.println(sortedString);
		
		
	}

}
