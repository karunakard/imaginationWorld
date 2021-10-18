package com.java.practise;

public class RemoveTheGivenCharFromString {
	
	public static  String remove(Character ch,String word) {
		String newString="";
		char[] charArray = word.toCharArray();
		for(char c:charArray) {
			if(c!=ch) {
				newString=newString+c;
			}
		}
		
		
		return newString;
	}
	
	public static String removeRecursively(Character ch,String word) {
		int val = word.indexOf(ch);
		if(val==-1) {
			return word;
		}
		
		return  removeRecursively(ch,word.substring(val+1,word.length())+word.substring(0,val));
	}
	
	public static void main(String[] args) {
		String s1="karan";
		Character ch='a';
		//String value = remove(ch,s1);
		//System.out.println(value);
		System.out.println(removeRecursively(ch, s1));
		
	}

}
