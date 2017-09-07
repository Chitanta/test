package com.briup.day02;

/**
 * 苹果工厂
 * 
 * @author Administrator
 *
 */
public class AppleFactory implements Factory {

	@Override
	public Fruit provider() {

		return new Apple();
	}

}
