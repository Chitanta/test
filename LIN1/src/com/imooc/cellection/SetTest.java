package com.imooc.cellection;
import java.util.*;
public class SetTest {
	public List<Course>courseToselect;
	public SetTest(){
		courseToselect =new ArrayList<Course>();
	}
	/**
	 * 添加课程
	 */
	public void Addcourse(){
		Course cr1=new Course("1","JAVA");
		courseToselect.add(cr1);
		Course temp=(Course)courseToselect.get(0);
		//System.out.println("添加的课程："+temp.id+":"+temp.name);
		
		
		Course cr2=new Course("2","C++");
		courseToselect.add(0,cr2 );
		Course temp2=(Course)courseToselect.get(0);
		//System.out.println("添加的课程："+temp2.id+":"+temp2.name);
		
		
		Course[] course={new Course("3","C语言"),new Course("4","大学英语")};
		courseToselect.addAll(Arrays.asList(course));
		Course temp3=(Course) courseToselect.get(2);
		Course temp4=(Course) courseToselect.get(3);
		//System.out.println("添加的课程："+temp3.id+":"+temp3.name+";"+temp4.id+":"+temp4.name);
		
		Course[] course2={new Course("5","C#"),new Course("6","大学物理")};
		courseToselect.addAll(2, Arrays.asList(course2));
		Course temp5=(Course) courseToselect.get(2);
		Course temp6=(Course) courseToselect.get(3);
		//System.out.println("添加的课程："+temp5.id+":"+temp5.name+";"+temp6.id+":"+temp6.name);
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
	public static void main(String[] args) {
		SetTest st=new SetTest();
		st.Addcourse();
		st.TestForeach();
		
		//创建一个学生对象
		Student stu=new Student("1","王二");
		System.out.println("欢迎"+stu.name+"来选课");
		//创建一个Scanner对象接收输入的课程编号
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("请输入所选课程的编号：");
			String courseNum=in.next();
			for(Course cr:st.courseToselect){
				if(cr.id.equals(courseNum)){
					stu.courses.add(cr);
				}
			}
		}
		st.ForeachToSetTest(stu);
		
	}
	public void ForeachToSetTest(Student stu){
		for(Course cr:stu.courses){
			System.out.println("您选择的课程为："+cr.id+":"+cr.name);
		}
	}
	
	

}
