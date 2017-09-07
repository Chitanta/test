package com.briup.ch09.exersice01;

public class Fish extends Animal implements Pet {
	private String name;
	public Fish(){
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void walk(){
		System.out.println("鱼成精");
	}
	public void eat(){
		System.out.println("鱼也要吃饭");
	}
	public void play(){
		System.out.println("鱼也要休息");
	}
}
