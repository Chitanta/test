package com.briup.ooad.day02.test;

/**
 * 发送短信
 * 
 * @author Administrator
 *
 */
public class SendMessage implements Sender {

	@Override
	public void send() {
		System.out.println("发短信");

	}

}
