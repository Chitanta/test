package com.asd;
           //Java 中方法的重载

public class as {
	public static void main(String[] args) {
		as hello=new as();
		hello.print();
		hello.print("林佳奇");
		hello.print(21);
	}
	public void print(){
		System.out.println("没有参数");
	}
	public void print(String name){
		System.out.println("带一个字符串型的参数，参数为:"+name);
	}
	public void print(int age){
		System.out.println("带整型参数，参数为:"+age);
	}

}
