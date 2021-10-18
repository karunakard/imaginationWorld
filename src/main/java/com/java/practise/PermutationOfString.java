package com.java.practise;

public class PermutationOfString {
	
	public static  String swap(String a,int i,int j) {
		System.out.println("inside swap method");
		char temp;
		char[] charArray=a.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
		
	}
	
	
	public static void permute(String word,int l,int r) {
		
		if(l==r) {
			System.out.println(word);
		}else {
			for(int i=l;i<=r;i++) {
				System.out.println("inside the permute method");
				word=swap(word,l,i);
				permute(word,l+1,r);
			    word=swap(word,l,i);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		String s1="abc";
		int l=0;
		int r=s1.length();
		permute(s1,l,r-1);
		
		
		
		
	}

}
