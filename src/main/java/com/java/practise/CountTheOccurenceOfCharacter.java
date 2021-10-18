package com.java.practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountTheOccurenceOfCharacter {
	
	
	public static void main(String[] args) {
		String val="everywhere the grass is green";
		char duplicates='e';
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] charval=val.toCharArray();
		for(char c:charval) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for(Entry<Character,Integer> value:entrySet) {
			
			if(value.getKey().equals(duplicates)) {
				System.out.println(value.getValue());
			}
		}
		
		
		
	}

}
