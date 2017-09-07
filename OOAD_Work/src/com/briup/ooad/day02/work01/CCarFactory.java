package com.briup.ooad.day02.work01;

public class CCarFactory implements CarFactory {

	@Override
	public Car produce() {

		return new CCar();
	}

}
