package com.jiji;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=28;
   boolean prime=true;
   if(num<=1) {
	   System.out.println("Not prime");
	   prime=false;
   }
   else {
   for(int i=2;i<=Math.sqrt(num);i++) {
	   if(num%i==0) {
		   System.out.println("notprime");
		   prime=false;
		   break;
	   }
   }
   if (prime) {
	   System.out.println("prime");
   }
	}
	}
}
