package com.briup.ch06;

public class Test3 extends Test2{
	int d;
	public Test3(int a,int b,int c,int d) {
		super(a, b, c);
		this.d=d;
	}
	public void print(){
		System.out.println(a+","+b +","+ c+"," + d);
	}
}

