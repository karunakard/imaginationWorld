package com.java.practise;

import java.util.ArrayList;
import java.util.List;

public class FindSubStringOfString {
	
	public static void findSubString(String word){
		List<String> subString=new ArrayList<>();
		for(int i=0;i<word.length();i++) {
			for(int j=i+1;j<=word.length();j++) {
				System.out.println(word.substring(i,j));
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		String input="abcd";
		findSubString(input);
		
		
		
		
	}

}
