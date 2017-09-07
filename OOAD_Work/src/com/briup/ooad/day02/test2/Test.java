package com.briup.ooad.day02.test2;

/**
 * 测试单例模式/饿汉模式类
 * 
 * @author Hyouka
 *
 */
public class Test {

	public static void main(String[] args) {
		SingleMode s1 = SingleMode.getInstance();
		SingleMode s2 = SingleMode.getInstance();
		SingleMode s3 = SingleMode.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
