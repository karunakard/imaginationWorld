package com.java.practise;

public class ReverseWordsInSentence {
	
	
	public static void main(String[] args) {
		String str="java is best programming language";
		String[] values=str.split(" ");
		String rev="";
		for(int i=values.length-1;i>=0;i--) {
			rev=rev+values[i]+" ";
		}
		
		System.out.println(rev);
		
		
		
	}

}
