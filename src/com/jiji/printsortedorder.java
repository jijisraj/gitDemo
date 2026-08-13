package com.jiji;

import java.util.Map;
import java.util.TreeMap;

public class printsortedorder {
	
	public static void main(String args[]) {
	String str="JIJI S RAJ";
	//Treemap stored in sortedorder
	Map<Character,Integer>map=new TreeMap<>();
	
	for(char ch:str.toCharArray()) {
		if(ch !=' ') {
		map.put(ch, map.getOrDefault(ch, 0)+1);
		}
	}
	
	for(Map.Entry<Character, Integer> entry:map.entrySet()) {
		System.out.print(entry.getKey());
	}
	}

}
