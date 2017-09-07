package com.briup.ooad.day03.work03;

public class Vistor implements User {

	@Override
	public void showUserInfo() {
		System.out.println("游客没有查看权限");
	}

}
