package com.briup.test;


public class Student implements java.io.Serializable{	
	private int age;
	private String name;
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
}
