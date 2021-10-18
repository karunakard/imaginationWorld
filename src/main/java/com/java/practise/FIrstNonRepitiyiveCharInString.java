package com.java.practise;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FIrstNonRepitiyiveCharInString {
	
	
	public static Character  findCharacter(String word) {
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		char[] wordArray = word.toCharArray();
		for(char ch:wordArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for(Entry<Character,Integer> enrty:entrySet) {
			if(enrty.getValue()==1) {
				return  enrty.getKey();
			}
		}
		
		throw new RuntimeException("didnot find the value");
	}
	
	public static void main(String[] args) {
		
		String s1="Grass is Greenner everywhere";
		char findCharacter = findCharacter(s1);
		System.out.println(findCharacter);
		
		
	}

}
