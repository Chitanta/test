package com.briup.ooad.day02.test2;

/**
 * 单例模式/饿汉模式/懒汉模式/处理多线程并发问题
 * 
 * @author Administrator
 *
 */
public class SingleMode {
	/**
	 * 饿汉模式
	 */
	// private static SingleMode singleMode = new SingleMode();
	//
	// private SingleMode() {
	// }
	//
	// public static SingleMode getInstance() {
	// return singleMode;
	// }
	/**
	 * 懒汉模式
	 */
	// private static SingleMode singleMode=null;
	// private SingleMode(){};
	// public static SingleMode getInstance(){
	// if(singleMode==null){
	// return new SingleMode();
	// }
	// return singleMode;
	// }
	/**
	 * 处理多线程并发问题 如果在getInstabce方法里加锁 效率底下 但是JVM不安全 JVM会出错
	 */
	// private static SingleMode singleMode=null;
	// private SingleMode(){};
	// public static SingleMode getInstance(){
	// if(singleMode==null){
	// synchronized (singleMode) {
	// if(singleMode==null){
	// return new SingleMode();
	// }
	// }
	// }
	// return singleMode;
	// }
	/**
	 * 处理多线程并发并处理JVM安全性问题
	 */
	private static class SingleModeFctory {
		public static SingleMode getInstance() {
			return new SingleMode();
		}
	}

	private SingleMode() {
	};

	public static SingleMode getInstance() {
		return SingleModeFctory.getInstance();
	}
}
