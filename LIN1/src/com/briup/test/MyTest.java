package com.briup.test;

public class MyTest {
	private int hour;
	private int minutes;
	private int seconds;
	
	public int getAllSeconds(int hour,int minutes,int seconds) {
		this.hour=hour;
		this.minutes=minutes;
		this.seconds=seconds;
		int AllSeconds=hour*3600+minutes*60+seconds;
		System.out.println(AllSeconds);
		return AllSeconds;
	}
	
	public int getHour(){
		return hour;
	}
	public void setHour(int hour){
		this.hour=hour;
	}
	public int getMinutes(){
		return minutes;
	}
	public void setMinutes(int minutes){
		this.minutes=minutes;
	}
	public int getSeconds(){
		return seconds;
	}
	public void setSeconds(int seconds){
		this.seconds=seconds;
	}

	public String toString(){
		return "hour="+hour+":"+"minutes="+minutes+":"+"seconds="+seconds;
	}
}
