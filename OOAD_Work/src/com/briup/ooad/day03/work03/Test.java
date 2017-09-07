package com.briup.ooad.day03.work03;

public class Test {

	public static void main(String[] args) {
		User us = new Admin();
		User u1=new UserProxy(us);
		u1.showUserInfo();
	}

}
