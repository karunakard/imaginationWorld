package com.java.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	
	
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("karan");
		list.add("sharma");
		list.add("smana");
		list.add("sudeep");
		list.add("vivek");
		
		
		/*
		 * for(String s:list) { if(s.startsWith("s")) { System.out.println(s); } }
		 */

		
		list.stream().filter(t->t.startsWith("k")).forEach(t->System.out.println(t));
		
		//list.stream().forEach(t->System.out.println(t));
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "abc");
		map.put(2, "bbc");
		map.put(3, "ccd");
		map.put(4, "ddd");
		//map.forEach((key,value)->System.out.println("key:"+key+"  "+"value:"+value));
		map.entrySet().stream().filter(t->t.getKey()%2==0).forEach(t->System.out.println(t));
		
	}

}
