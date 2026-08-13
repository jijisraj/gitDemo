package com.jiji;

public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="java";
  String  str1= "";
  for(int i=str.length()-1;i>=0;i--) {
	  System.out.print(str1+str.charAt(i));
  }
  
  String rev=new StringBuilder(str).reverse().toString();
 System.out.println(rev);
	}

}
