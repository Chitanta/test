package com.briup.ooad.day03.work06;

public class Test {

	public static void main(String[] args) {
		Observer father = new Father();
		Observer mather = new Mather();
		Subject subject = new Child();
		subject.operator();
		father.updata();
		mather.updata();

	}

}
