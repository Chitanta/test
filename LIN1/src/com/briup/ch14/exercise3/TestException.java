package com.briup.ch14.exercise3;

public class TestException {
	public static void main(String[] args) {
		try {
			args=new String[3];
			args[0]="asdas";
			args[1]="fsdg";
			args[2]="1231";
			args[4]="asdfafs";	
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("这里出错了 :"+e.getMessage());
			return;
		}catch (NullPointerException e1) {
			System.out.println(e1.getMessage());
		}
		finally{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println();
		}
	}
}
