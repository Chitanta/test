package com.briup.ooad.day02.reTest;

public class Test {

	public static void main(String[] args) {
		SenderFactory senderFactory = new SenderFactory();
		Sender sendMail = senderFactory.sendMail();
		sendMail.send();

	}

}
