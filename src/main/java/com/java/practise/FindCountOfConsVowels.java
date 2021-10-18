package com.java.practise;

public class FindCountOfConsVowels {
	
	public static void main(String[] args) {
		String word="independence";
		int count=0;
		//int consCount=0;
		for(char ch:word.toCharArray()) {
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case  'u':
				count++;
				break;
				default:
			}
		}
		System.out.println("no of vowels:"+count+"===="+"no of consonants:"+(word.length()-count));
		
		
	}

}
