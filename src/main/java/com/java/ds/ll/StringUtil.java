package com.java.ds.ll;

public class StringUtil {
	
	public  static  boolean findSequence(String str,String sub) {
		
		int i=0;
		int j=0;
		while(i<str.length() && j<sub.length()) {
			if(str.charAt(i)==sub.charAt(j)) {
				j++;
			}
			i++;
			
		}
		return j==sub.length();
		
		
	}
	
	public static void main(String[] args) {
		boolean findSequence = findSequence("abcde", "aec");
		System.out.println(findSequence);
	}

}
