package com.briup.day02.singlemode;
/**
 * 单例模式/饿汉模式/懒汉模式
 * @author Administrator
 *
 */
public class Single {
	private static class SingleFactory{
		public static Single getInstance(){
			return new Single();
		}
	}

	private Single() {
	};

	public static Single getInstance() { 

		return SingleFactory.getInstance();
	}

	private Object readResolver() {
		return SingleFactory.getInstance();
	}
}
