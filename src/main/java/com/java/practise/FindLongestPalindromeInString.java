package com.java.practise;

import java.util.ArrayList;
import java.util.List;

public class FindLongestPalindromeInString {
	
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
	
	public static List<String> findPlaindrominStrings(List<String> subStrings){
		List<String> palindromes=new ArrayList<>();
		for(String s:subStrings) {
			StringBuilder builder=new StringBuilder(s);
			StringBuilder reversestr = builder.reverse();
			if(s.equals(reversestr.toString())) {
				palindromes.add(s);
			}
		}
		
		return palindromes;
	}
	
	public static String findpalindromSubString(String word) {
		List<String> subString=new ArrayList<>();
		for(int i=0;i<word.length();i++) {
			for(int j=i+1;j<=word.length();j++) {
				if(word.substring(i, j).length()>1) {
				subString.add(word.substring(i, j));
				}
			}
		}
		List<String> findPlaindrominStrings = findPlaindrominStrings(subString);
		String[] Aarr = new String[findPlaindrominStrings.size()];
		String[] array = findPlaindrominStrings.toArray(Aarr);
		String[] sortedString = sortedString(array);
		if(sortedString.length>1) {
			return sortedString[0];
		}
		return "no palindromic string is presnet";
	}
	
	
	public static void main(String[] args) {
		String s1="forgeeksskeegfor";
		String findLongestPalindromicString = findpalindromSubString(s1);
		System.out.println(findLongestPalindromicString);
		
		
	}

}
