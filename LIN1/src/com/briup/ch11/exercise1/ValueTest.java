package com.briup.ch11.exercise1;

public class ValueTest {
	public static void main(String[] args){
		Integer obj1=new Integer(145);
		int num1=obj1.intValue();
		System.out.println(obj1+"  "+ num1);
		Integer obj2=new Integer("36");
		String str1=obj2.toString();
		int num2=Integer.parseInt("36");
		System.out.println(obj2+"  "+str1+"  "+num2);
		String str2=String.valueOf(5);
		System.out.println(str2);
	}
}
