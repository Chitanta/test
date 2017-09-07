package com.briup.ch09;

public class MyTest {
	static int count;

	static void print(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args){
		MyTest t1=new MyTest();
		print();
		MyTest t2=new MyTest();
		print();
		MyTest t3=new MyTest();
		print();
		MyTest t4=new MyTest();
		print();
		MyTest t5=new MyTest();
		print();
		MyTest t6=new MyTest();
		print();
		System.out.println("一共创建了:"+count+"个对象");
	}
}
