package com.jiji;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String args[]) {
		
		String[] as= {"fggg","ghhj","ghhh","hjhkk"};
		List<String> as1=Arrays.asList(as);
List<String> result=	as1.stream().filter(s->s.equals("ghhh")).sorted().collect(Collectors.toList());
	result.forEach(System.out::println);
	}

}
