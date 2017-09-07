package com.briup.ch13;

public enum Gender {
	MALE("猛男"),FEMALE("oo");
	private String desc;
	private Gender(){}
	private  Gender(String desc){
		this.desc=desc;
		System.out.println("hi");
	}
	public String getDesc(){
		return desc;
	}
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		Gender gender=Gender.MALE;
		Gender g3=Gender.MALE;
		System.out.println(gender.getDesc());
	}
}
