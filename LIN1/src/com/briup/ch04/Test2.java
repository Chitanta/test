package com.briup.ch04;

public class Test2 {
	static int a = 10;

	public static void main(String[] args) {
		new Test2();
	}
public Test2(){
	System.out.println("in test");
	System.out.println(this);
	int temp=this.a;
	if(temp>5){
		System.out.println(temp);
	}
}
}
