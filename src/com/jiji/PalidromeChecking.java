package com.jiji;

public class PalidromeChecking {
	public static void main(String[]args) {
		int number=121;
		int temp=number;
		int rev=0;
		while(number>0) {
			int digit=number%10;
			rev=rev*10+digit;
			number=number/10;
		}
		if(rev==temp) {
			System.out.println("palidrom");
		}
		else
			System.out.println("Not Palidrom");
		palidrom("MADAM");
	}

	 private static void palidrom(String name) {
			// TODO Auto-generated method stub
		 name="MADAM";
		 String reverse="";
		 for(int i=name.length()-1;i>=0;i--) {
			  reverse=reverse+name.charAt(i);
		 }
			//String reverse=new StringBuilder(name).reverse().toString();
			if(name.equals(reverse)) {
			System.out.println("palidrom");
			}
			else
				System.out.println("Not palidrom");
		}
}
