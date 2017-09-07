package com.briup.ooad.day02.test;

/**
 * 测试类 普通工厂模式
 * 
 * @author Hyouka
 *
 */
public class Test {

	public static void main(String[] args) {
		CommonFactory factory = new CommonFactory();
		Sender sender = factory.SendMail();
		sender.send();
	}

}
