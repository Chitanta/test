package com.haobu;

public class InitialTelephone {
	public static void main(String[] args) {
		Telephone phone=new Telephone();
		phone.cpu=2.0;
		phone.price=4999;
		phone.mem=2;
		Telephone phone2=new Telephone();
		phone2.cpu=2.0;
		phone2.price=4999;
		phone2.mem=2;
		if(phone.equals(phone2)){       //equals方法比较两个对象的引用是否只想同一块内存地址
			System.out.println("相同");
			phone.Outer();
		}else{
			System.out.println("不同");
			phone2.Outer();
		}
	}


}
