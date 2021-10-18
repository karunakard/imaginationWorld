package com.java.ds.ll;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingCharater {
	
	public static int findFirstNonRepeating(String str) {
		char[] ch=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(char c:ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}
		for(int i=0;i<ch.length;i++) {
			char chars=ch[i];
			if(map.get(chars)==1) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		String str="vamshi";
		int findFirstNonRepeating = findFirstNonRepeating(str);
		System.out.println(findFirstNonRepeating);
	}

}
