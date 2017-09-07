package com.briup.ooad.day03.work02;

import java.util.Date;

public class AddDate extends Decorator {

	public AddDate(Print print) {
		super(print);
	}

	public void say(String name) {
//		System.out.println("1354864");
		super.say(name);
		addDate();
	}

	public void addDate() {
		System.out.print(" "+new Date());
	}

}
