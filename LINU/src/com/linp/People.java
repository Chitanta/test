package com.linp;

public class People {
	int age;
	String sex;
	static String name;
	public People(){
		age=20;
	}
	{
		sex="男";
	}
	static {
		name="阿姆斯特朗回旋加速喷气式阿姆斯特朗炮";
	}
	/**public void show(){
		System.out.println("年龄："+age+"性别："+sex+"姓名："+name);
	}
	*/
	public static void main(String[] args) {
		People people=new People();
		System.out.println("年龄:"+people.age);
		System.out.println("性别:"+people.sex);
		System.out.println("name:"+name);
		/**people.show();
		 * 
		 */
	}
	
}
