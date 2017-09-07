package com.briup.ch09.exersice;

public class RefTest {

	public static void main(String[] args) {
		Class c1=Student.class;
		System.out.println(c1);
		Student student=new Student();
		Class c2=student.getClass();
		System.out.println(c2);
		
	}

}
