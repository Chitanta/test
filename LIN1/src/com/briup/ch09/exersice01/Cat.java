package com.briup.ch09.exersice01;

public class Cat extends Animal implements Pet {
	private String name;
	public Cat(){}
	public Cat(String name) {
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void play(){
		System.out.println("猫会玩");
	}
	public void eat(){
		System.out.println("猫会吃东西");
	}

	

}
