package com.briup.ch13.exercise4;

public enum Color {
	RED("red"),BULE("bule"),GREEN("green");
	private String desc;
	private Color(){}
	private Color(String desc){
		this.desc=desc;
	}
	public String getDesc(){
		return desc;
	}
	public static void main(String[] args) {
		Color c1=Color.RED;
		Color c2=Color.BULE;
		Color c3=Color.GREEN;
		System.out.println(Color.RED+":"+c1.getDesc());
		System.out.println(Color.BULE+":"+c2.getDesc());
		System.out.println(Color.GREEN+":"+c3.getDesc());

	}

}
