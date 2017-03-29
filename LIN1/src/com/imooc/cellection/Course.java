package com.imooc.cellection;

public class Course {
	public String id;
	public String name;
	public Course(String id,String name){
		this.id=id;
		this.name=name;
	}
	/**
	 * 添加一个无参构造器使得ChildCourse能调用
	 */
	public Course(){
		
	}

}
