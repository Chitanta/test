package com.briup.ch09.exersice;

public class Student implements Person {
	private static int SID=007;;
	private static String speciality="niubi";
	public  static String name="a";
	public static String sex="s";
	public static String birthday="1023";
	
	public void setData(String name, String sex, String birthday){
		
	}
	public void print(){
		System.out.println( "name="+name+"  "+"sex="+sex+"  "+"birthday="+birthday);
	}
	public void getData(){
		return;
	}
	public static void main(String[] args){
		Student student=new Student();
		student.print();
		System.out.println( "name="+student.name+"  "+"sex="+Student.sex+"  "+"birthday="+birthday);
		System.out.println("SID="+SID+" "+"speciality="+speciality);
	}

}
