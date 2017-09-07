package com.briup.ooad.day03.work02;

public class AddSay extends Decorator {

	public AddSay(Print print) {
		super(print);
	}
	public void say(String name){
		addSay();
		super.say(name);
	}
	public void addSay(){
//		System.out.println("asda");
		System.out.print("briup_");
	}

}
