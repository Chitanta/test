package com.briup.works;

public class Circle extends Shape {
	public double r;
	public Circle(){
		this.r=1.0;
	}
	public Circle(int x,int y,double r){
		this.x=x;
		this.y=y;
		this.r=r;
	}
	public double getR(){
		return r;
	}
	public void setR(double r){
		this.r=r;
	}
	

	public void Draw(){
		System.out.println("draw in circle"+x+" "+y+" "+r);
	 }
	
}
