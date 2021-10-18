package com.java.ds.ll;

import java.util.Set;

public class RemoveVowels {
	
	public static String removeVowells(String str) {
		Set<Character> vowels=Set.of('a','e','i','o','u');
		StringBuilder builder=new StringBuilder();
		char[] chars=str.toCharArray();
		for(char c:chars) {
			if(!vowels.contains(c)) {
				builder.append(c);
			}
		}
		return builder.toString();
	}
	
	
	
	
	public static void main(String[] args) {
		String str1="independence";
		String removeVowells = removeVowells(str1);
		System.out.println(removeVowells);
		
		
	}

}
