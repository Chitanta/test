package com.briup.ch09.test;

public class MyClass {
	static ClassA ca = new ClassA();
	ClassC cc = new ClassC();
	static{
		System.out.println("In Static MyClass");
	}
	public MyClass(){
		System.out.println("MyClass()");
	}
}
