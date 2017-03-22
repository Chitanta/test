package com.aaaaaaa;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		Shape sh1=new Rectangle();
		sh1.Area();
		sh1.Perimete();
		Shape sh2=new Circle();
		sh2.Area();
		sh2.Perimete();
	*/
		System.out.println("请输入圆的半径：");
	    Scanner reader=new Scanner(System.in);
	    int r=reader.nextInt();
	    Circle ss=new Circle();
	    ss.Area(r);
	    ss.Perimete(r);
	    
	    System.out.println("请输入矩形的长：");
	    Scanner read=new Scanner(System.in);
	    int chang=reader.nextInt();
	    System.out.println("请输入矩形的宽：");
	    int kuan=reader.nextInt();
		

		Rectangle dd=new Rectangle();
		dd.Perimete(chang, kuan);
		dd.Area(chang,kuan);
		
	}


}
