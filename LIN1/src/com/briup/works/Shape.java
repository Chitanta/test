package com.briup.works;

public class Shape {
	public int x,y;
	public Shape(){
		
	}

	public Shape(int x,int y){
		this.x=x;
		this.y=y;
	}
//	public int getX(){
//		return x;
//	}
//	public void setX(int x){
//		this.x=x;
//	}
//	public int getY(){
//		return y;
//	}
//	public void setY(int y){
//		this.y=y;
//	}

	public void Draw(){
		System.out.println("Shape draw");
	}
}
