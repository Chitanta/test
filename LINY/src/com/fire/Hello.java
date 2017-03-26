package com.fire;

public class Hello {
	public static void main(String[] args) {
		int a=56;
		//创建Integer装箱类对象
		Integer b= new Integer(a);
		//讲Integer装箱类转换为double类型
		double c=b.doubleValue();
		// 将Integer装箱类转换为float类型
		float d=b.floatValue();
		// 将Integer装箱类转换为int类型
		int e=b.hashCode();
		System.out.println("Integer装箱类型："+b);
		System.out.println("double类型："+c);
		System.out.println("folat类型："+d);
		System.out.println("int类型："+e);
		
		
		//装箱：把基本类型转换成包装类，使其具有对象的性质，又可分为手动装箱和自动装箱
		//定义一个double类型的f并赋值
		double f=10.2;
		//手动装箱
		Double g=new Double(f);
		//自动装箱
		Double h=f;
		System.out.println("手动装箱："+g+"\n自动装箱："+h);
		
		
		//拆箱：和装箱相反，把包装类对象转换成基本类型的值，又可分为手动拆箱和自动拆箱
		//定义一个double的装箱类对象，值为85.5
		Double u=new Double(85.5);
		//手动拆装
		double i=u.doubleValue();
		//自动拆装
		double o=u;
		System.out.println("手动拆装："+u+"\n自动拆装："+o);
	}

}
