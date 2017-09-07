package com.briup.ch09.exersice4;

public class Rectangle extends Pillar implements Geometry  {
	public double length;
	public double width;
	public Rectangle(double underside, double height, double length, double width) {
		super(underside, height);
		this.length=length;
		this.width=width;
	}
	public void getArea() {
		Pillar.underside=length*width;
		System.out.println("四棱柱的体积为:"+underside*height);
	}

}
