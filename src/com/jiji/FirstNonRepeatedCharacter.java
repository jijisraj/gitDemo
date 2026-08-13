package com.jiji;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	
	public static void main(String args[]) {
		
		String str="automation";
		//linkedhashmap maintain insertion order
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char ch:str.toCharArray()) {
			map.put(ch,map.getOrDefault(ch, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			//if(entry.getValue()==1) {
			//	System.out.println("First non repeated character "+ entry.getKey());
				//break;
			//}
			
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			
			}
		}
	}

}
