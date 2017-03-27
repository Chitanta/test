package com.imooc.cellection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 添加课程
 * @author Administrator
 *
 */
public class ListTest {
	public List courseToselect;
	public ListTest(){
		this.courseToselect=new ArrayList();
	}
	public void Addcourse(){
		Course cr1=new Course("1","JAVA");
		courseToselect.add(cr1);
		Course temp=(Course)courseToselect.get(0);
		System.out.println("添加的课程："+temp.id+":"+temp.name);
		
		
		Course cr2=new Course("2","C++");
		courseToselect.add(0,cr2 );
		Course temp2=(Course)courseToselect.get(0);
		System.out.println("添加的课程："+temp2.id+":"+temp2.name);
		
		
		Course[] course={new Course("3","C语言"),new Course("4","大学英语")};
		courseToselect.addAll(Arrays.asList(course));
		Course temp3=(Course) courseToselect.get(2);
		Course temp4=(Course) courseToselect.get(3);
		System.out.println("添加的课程："+temp3.id+":"+temp3.name+";"+temp4.id+":"+temp4.name);
		
		Course[] course2={new Course("5","C#"),new Course("6","大学物理")};
		courseToselect.addAll(2, Arrays.asList(course2));
		Course temp5=(Course) courseToselect.get(2);
		Course temp6=(Course) courseToselect.get(3);
		System.out.println("添加的课程："+temp5.id+":"+temp5.name+";"+temp6.id+":"+temp6.name);
	}
	
	/**
	 * 查询课程
	 * @param args
	 */
	public void Getcourse(){
		int size=courseToselect.size();
		System.out.println("有以下课程可以选择：");
		for(int i=0;i<size;i++){
			Course cr=(Course)courseToselect.get(i);
			System.out.println("课程"+cr.id+":"+cr.name);
		}
		
	}
	
	/**
	 * 通过迭代器遍历List中的元素  迭代器方法依存于集合
	 * @param args
	 */
	public void TestIterator(){
		Iterator it=courseToselect.iterator();
		System.out.println("有以下课程可以选择：(通过Iterator访问)");
		while(it.hasNext()){
			Course cr=(Course)it.next();
			System.out.println("课程："+cr.id+":"+cr.name);
		}
	}
	
	/**
	 * 通过foreach方法
	 * @param args
	 */
	
	public void TestForeach(){
		System.out.println("有以下课程可以选择：(通过foreach访问)");
		for(Object obj:courseToselect){
			Course cr=(Course)obj;
			System.out.println("课程："+cr.id+":"+cr.name);
		}
	}
	
	
	/**
	 * 修改课程
	 * @param args
	 */
	public void TestModify(){
		courseToselect.set(3, new Course("9","数据库"));
		TestForeach();
	}
	
	
	/**
	 * 删除课程
	 * @param args
	 */
	public void TestRemove(){
		/*Course cr=(Course)courseToselect.get(2);
		courseToselect.remove(cr);
		TestForeach();和下面的方法相同*/
		/*courseToselect.remove(2);
		TestForeach();*/
		
		//创建一个新的元素集合 新的元素集合是即将删除的元素的集合
		Course[] course3={(Course) courseToselect.get(4),(Course) courseToselect.get(5)};
		//通过removeAll方法删除集合中的元素
		courseToselect.removeAll(Arrays.asList(course3));
		TestForeach();
	}
	public static void main(String[] args) {
		ListTest lt=new ListTest();
		lt.Addcourse();	
		lt.Getcourse();
		lt.TestIterator();
		lt.TestForeach();
		lt.TestModify();
		lt.TestRemove();
	}

}
