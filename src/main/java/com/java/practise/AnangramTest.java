package com.java.practise;

import java.util.Arrays;

public class AnangramTest {
	
	public static void main(String[] args) {
		String s1="army";
		String s2="mary";
		boolean value=false;
		int count=0;
		char[] first=s1.toCharArray();
		char[] second=s2.toCharArray();
		if(first.length!=second.length) {
			System.out.println("not a anagram");
		}else {
		for(int i=0;i<first.length;i++) {
			for(int j=0;j<second.length;j++) {
				if(first[i]==second[j]) {
					value=true;
					count++;
				}
			}
		
		}
		}
		if(value && count==4) {
			System.out.println("string is anagram");
		}else {
			System.out.println("not a anagram");
		}
		//System.out.println(Arrays.equals(s1.toCharArray(), s2.toCharArray()));
	}

}
