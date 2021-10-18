package com.java.practise;

public class StringReverse {
	
	public static void reverseIterate(String word) {
		String rev="";
		for(int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		System.out.println(rev);
		
	}
	
	public static  String reverseRecurse(String word) {
		if(word.length()<2) {
			return word;
		}
		
		return (word.substring(1)+word.charAt(0));
		
	}
	
	
	public static void main(String[] args) {
		String data="independence";
		//reverseIterate(data);
		reverseRecurse(data);
		
	}

}
