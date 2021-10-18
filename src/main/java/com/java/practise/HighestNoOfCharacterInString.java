package com.java.practise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HighestNoOfCharacterInString {
	
	public static  int  findmax(Collection<Integer> values) {
		int max=0;
		for(Integer ch:values) {
			if(ch>max) {
				max=ch;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		String s="aabbaabbaabbcccccdddefccaab";
		Map<Character,Integer> map=new HashMap<>();
		for(char c:s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		 Collection<Integer> values = map.values();
		int findmaxval = findmax(values);
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for(Entry<Character, Integer> entry:entrySet) {
			if(entry.getValue()==findmaxval) {
				System.out.println(entry.getKey());
			}
		}
	}

}
