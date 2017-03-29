package com.imooc.cellection;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 * 
 * @author Administrator
 *
 */
public class TestGeneric {
	/**
	 * 带有泛型————Course的List类型属性
	 */
	public List<Course> courses;

	public TestGeneric() {
		this.courses = new ArrayList<Course>();
	}

	/**
	 * 添加课程
	 */
	public void TestAdd() {
		Course cr1 = new Course("1", "JQ");
		courses.add(cr1);
		Course cr2 = new Course("2", "JS");
		courses.add(cr2);
	}

	/**
	 * 泛型集合可以添加泛型类型的子类型的对象实例
	 * 
	 * @return
	 * 
	 */
	public void ChildCourse() {
		//创建泛型类型子类型的对象实例
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "高等数学";
		courses.add(ccr);
		System.out.println("添加了泛型的子类型对象实例，重新遍历集合元素");
		TestForeach();
	}
	
	/**
	 * 添加基本类型的泛型时要用基本类型的包装类 eg：int→Integer long→Long boolean→Boolean
	 */
	public void BasicType(){
		List<Integer>list=new ArrayList<Integer>();
		list.add(5);
		System.out.println("添加了一个基本类型的泛型:"+list.get(0));
	}

	/**
	 * Foreach遍历循环集合元素
	 */
	public void TestForeach() {
		for (Course cr : courses) {
			System.out.println(cr.id + ":" + cr.name);
		}
	}

	public static void main(String[] args) {
		TestGeneric tg = new TestGeneric();
		tg.TestAdd();
		tg.TestForeach();
		tg.ChildCourse();
		tg.BasicType();
	}

}