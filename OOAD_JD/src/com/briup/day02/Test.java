package com.briup.day02;
/**
 * 链式编程
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		MoreFactory.providerApple().sell();//(静态工厂)
		//new MoreFactory().providerApple().sell();
	}
}
