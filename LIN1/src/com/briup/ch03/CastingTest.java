package com.briup.ch03;

public class CastingTest {
	public void implictCasting(){
		byte a=0x60;
		int ia =a;
		char b = 'a';
		int c=b;
		long d =c;
		long e =1000000000L;
		float f=e;
		double g=f;
		String s ="hello";
		Object o =s;
	}
	
	public void explicitCasting(){
		long l =1000000L;
		int i =1;
		double d =12345.678;
		float f=(float)d;
		Object o=new String("Hello");
		String str =(String)o;
		System.out.println(i+d+f);
	}
	public static void main(String[] args) {
		
	}

}
