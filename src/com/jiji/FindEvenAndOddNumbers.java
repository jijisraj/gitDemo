package com.jiji;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenAndOddNumbers {
	public static void main(String args[]) {
	int nums[]= {1,2,3,4,5,6,7,8};
	
	List<Integer> even=Arrays.stream(nums).filter(e->e%2==0).boxed().collect(Collectors.toList());
	even.forEach(System.out::println);

	List<Integer> odd=Arrays.stream(nums).filter(o->o%2!=0).boxed().collect(Collectors.toList());
	odd.forEach(System.out::println);
	}
}
