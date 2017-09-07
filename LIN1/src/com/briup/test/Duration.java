package com.briup.test;

public class Duration {
	private int hour;
	private int minute;
	private int seconds;
	
	public Duration(){}
	public Duration(int totalSeconds){
//		hour=totalSeconds/3600;
		
	}
	public int getTotalSeconds(int hour,int minute,int seconds) {
		this.hour=hour;
		this.minute=minute;
		this.seconds=seconds;
		
		int totalSeconds=hour*3600+minute*60+seconds;
		System.out.println(totalSeconds);
		return totalSeconds;
		
	}
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	@Override
	public String toString() {
		return "Duration [hours=" + hour + ", minute=" + minute + ", seconds="
				+ seconds + "]";
	} 
	
}
