package com.jiji;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfWords {
	public static void main(String args[]) {
String str="Java Selenium Java Testing Selenium";
String [] words=str.split(" ");

Map<String,Integer> map=new HashMap<>();
for(String word:words) {
	map.put(word,map.getOrDefault(word,0)+1 );
}
for(Map.Entry<String, Integer> entry:map.entrySet()) {
	
		System.out.println(entry.getKey()+" "+entry.getValue());
	
}
	}

}
