package com.java.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateCharactersInString {
	
	public static void main(String[] args) {
		String value="bbcdbbef";
		String noduplicated="";
		List<Character> l =new ArrayList<>();
		//Map<Character,Integer> map=new HashMap<>();
		for(char c:value.toCharArray()) {
			if(!l.contains(c)) {
				l.add(c);
			}
		}
		
		for(char ch:l) {
			noduplicated=noduplicated+ch;
		}
		System.out.println(noduplicated);
		
		
	}

}
