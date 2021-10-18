package com.java.practise;

public class ConvertStringIntegerToInteger {
	
	public static void main(String[] args) {
		String value="0112";
		int intval=0;
		int[] val=new int[value.length()];
		for(int i=0;i<value.length();i++) {
			val[i]=value.charAt(i)-48;
			intval=intval*10+val[i];
		}
		
		System.out.println("converted string to integer:"+intval);
		
		
	}

}
