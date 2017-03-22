package com.aaaaaaa;

public class Rectangle extends Shape  {

	int M;
	int Z;
	public void Area(int chang ,int kuan){
		M=chang*kuan;
		System.out.println("面积为："+M);
	}
    public void Perimete(int chang,int kuan){
    	Z=(chang+kuan)*2;
   	System.out.println("周长为："+Z);
   }
	
		
	
}
