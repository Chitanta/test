package com.briup.ooad.day02.reTest;

public class SenderFactory {
	public Sender sendMail() {
		return new SendMail();
	}

	public Sender sendMessage() {
		return new SendMessage();
	}
}
