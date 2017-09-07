package com.briup.test;

public class Track {
	private String title;
	private MyTest myTest;
	public Track(String title,MyTest myTest){
		this.title=title;
		this.myTest=myTest;
		}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public MyTest getMyTest(){
		return myTest;
	}
	public void setMyTest(MyTest myTest){
		this.myTest=myTest;
	}
	public String toString(){
		return "my Track title is: " + title +"\t"+ " MyTest is: " + myTest;
	}

}
