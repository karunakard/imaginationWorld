package com.java.practise;

public class ReplaceSpaceInStringWithChar {
	
	
	public static void main(String[] args) {
		
		String s1="java is great";
		char[] charArray = s1.toCharArray();
		String replaceAll = s1.replaceAll(" ","%20");
		System.out.println(replaceAll);
		/*
		 * for(int i=0;i<s1.length();i++) { if(s1.charAt(i)==Character.MIN_VALUE) {
		 * s1.charAt(i)=%20; } }
		 */
		
		
	}

}
