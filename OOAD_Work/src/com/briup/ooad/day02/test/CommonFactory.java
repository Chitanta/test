package com.briup.ooad.day02.test;

/**
 * 工厂方法模式
 * 
 * @author Hyouka
 *
 */
public class CommonFactory {
	/**
	 * 工厂方法
	 * 
	 * @param type
	 * @return
	 */
	// 普通工厂模式
	// public Sender produce(String type) {
	// if (type.equals("mail")) {
	// return new SendMail();
	// } else if (type.equals("message")) {
	// return new SendMessage();
	// } else {
	// return null;
	// }
	// }

	/**
	 * 多工厂模式
	 * 
	 * @return
	 */
	public Sender SendMail() {
		return new SendMail();
	}

	public Sender SendMessage() {
		return new SendMessage();

	}
}
