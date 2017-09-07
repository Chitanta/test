package com.briup.day01;

/**
 * 测试封装特性
 * @author Administrator
 *
 */
public class Encapsulation {
	public static void main(String[] args) {
		Student student=new Student();
		student.doWork(new Work() {
			
			@Override
			public void doWork() {
				System.out.println("吃饭");
				
			}
		});
		Math.random();
	}
}
