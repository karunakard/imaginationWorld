package com.java.practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateCharactersInString {
	
	public void printRepeatedCharacters(Map<String,Integer> duplicates) {
		
		for(Entry<String,Integer> map:duplicates.entrySet()) {
			if(map.getValue()>1) {
				System.out.println(map.getKey()+"==="+map.getValue());
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Map<String,Integer> duplicate=new HashMap<String,Integer>();
		String s="javaisalanguage";
		char[] ch=s.toCharArray();
		int count=1;
		for(char c:ch) {
			String key=Character.toString(c);
			 if(duplicate.containsKey(key)) {
				 //System.out.println(key+"===="+duplicate.get(key));
				duplicate.put(key, duplicate.get(key)+1);
			}else {
				duplicate.put(key, count);
			}
		}
		
		new FindDuplicateCharactersInString().printRepeatedCharacters(duplicate);
		//System.out.println(duplicate);
		
	}

}
