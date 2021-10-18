package com.java.practise;

public class PalindromicString {
	
	public static String  reverse(String word) {
		if(word==null || word.isEmpty()) {
			return word;
		}
		return word.substring(word.length()-1)+reverse(word.substring(0, word.length()-1));
			
	}
	
	public static void main(String[] args) {
		String word="java";
		String reverseword = reverse(word);
		if(word.equals(reverseword)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("not palinderome");
		}
		
	}

}
