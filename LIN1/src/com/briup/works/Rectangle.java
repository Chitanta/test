package com.briup.works;

public class Rectangle extends Shape {
	private double height;
	private double width;
	public Rectangle(){
		this.height=1.0;
		this.width=1.0;
	}
	public Rectangle(double height,double width){
		this.height=height;
		this.width=width;
	}
	public Rectangle(int x,int y,double height,double width){
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
	}
	

	public void Draw(){
		System.out.println("draw in rectangle"+x+" "+y+" "+height+" "+width);
	}
}
