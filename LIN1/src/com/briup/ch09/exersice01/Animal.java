package com.briup.ch09.exersice01;

public abstract class Animal {
	protected int legs;
	public Animal(){}
	protected Animal(int legs){
		this.legs = legs;
	}
	public void walk(){
		System.out.println("牛逼");
	}
	abstract void eat();
}
