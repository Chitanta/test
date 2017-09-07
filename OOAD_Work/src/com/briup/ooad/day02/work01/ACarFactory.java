package com.briup.ooad.day02.work01;

public class ACarFactory implements CarFactory {

	@Override
	public Car produce() {
		// TODO Auto-generated method stub
		return new ACar();
	}



}
