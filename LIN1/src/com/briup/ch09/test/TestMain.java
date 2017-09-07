package com.briup.ch09.test;

public class TestMain{
	public static void main(String args[]){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		System.out.println(mc1.cc == mc2.cc);
		System.out.println(mc1.ca == mc2.ca);
	}
}
