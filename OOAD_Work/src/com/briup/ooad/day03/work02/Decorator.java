package com.briup.ooad.day03.work02;

/**
 * 抽象的装饰类
 * 
 * @author Hyouka
 *
 */
public abstract class Decorator implements Print {
	private Print print;

	public Decorator(Print print) {
		this.print = print;
	}

	public void say(String name) {
		this.print.say(name);
	}
}
