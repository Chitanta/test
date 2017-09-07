package com.briup.ch09.exersice4;

public class Circle extends Pillar implements Geometry{

	public double r;
	public Circle(double underside, double height,double r) {
		super(underside, height);
		this.r=r;
	}


	public void getArea() {
		underside=r*r*Math.PI;
		System.out.println("圆柱体的体积为:"+underside*height);
		
	}
}
