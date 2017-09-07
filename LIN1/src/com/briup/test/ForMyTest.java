package com.briup.test;

public class ForMyTest {

	public static void main(String[] args) {
		MyTest test=new MyTest();
		test.getAllSeconds(12, 45, 24);
		Track track=new Track("CoreJava", test);
		System.out.println(test);
		System.out.println(track);
	}

}
