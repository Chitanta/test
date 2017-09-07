package com.briup.ooad.day02.work01;

public class Test {

	public static void main(String[] args) {
		CarFactory carFactory = new CCarFactory();
		Car car = carFactory.produce();
		car.run();
	}

}
