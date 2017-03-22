package com.linj;

public class Slience {
	//静态变量static
	static String Computer="lenovo";

	public static void main(String[] args) {
		//通过类名直接访问
		System.out.println(Slience.Computer);
		//创建对象
		Slience computer=new Slience();
		//通过对象名访问
		System.out.println(computer.Computer);
		//修改静态变量的值后通过对象名访问
		computer.Computer="Dell";
		System.out.println(computer.Computer);

	}

}
