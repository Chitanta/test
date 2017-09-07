package com.briup.ch05;

public class Test1 {

	public static void main(String[] args) {
		int i=12;
		int b=i+=i-=i*=i;
		System.out.println(b);
		int a=0;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);

	}

}
