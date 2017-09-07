package com.briup.ch06;

public class Test2 extends Test {
	int c;
	public Test2(int a,int b,int c) {
		super(a, b);
		this.c=c;
	}
	public void print(){
		System.out.println(a+","+b+","+c);
	}
}
