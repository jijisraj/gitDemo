package com.jiji;

public class Factorial {
	public static void main(String args[]) {
		int num=5;
	int result=	factorial(num);
	System.out.println(result);
		
	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
	int	fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
		/*
	//recursion	 method
		if(num==1)
			return 1;
		return num*factorial(num-1);
		*/
	}

}
