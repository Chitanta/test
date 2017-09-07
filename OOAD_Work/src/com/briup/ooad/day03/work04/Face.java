package com.briup.ooad.day03.work04;

public class Face {
	private A a;
	private B b;
	private C c;

	public Face() {
		a = new A();
		b = new B();
		c = new C();
	}
	public void methodA(){
		a.methodA();
	}
	public void methodB(){
		b.methodB();
	}
	public void methodC(){
		c.methodC();
	}

	public void server() {
		methodA();
		methodB();
		methodC();
	}
}
