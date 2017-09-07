package com.briup.ooad.day03.work06;

public class Child extends AbsrtactSubJect {

	public void operator() {
		System.out.println("我生病了");
		notifyObservers();
	}

}
