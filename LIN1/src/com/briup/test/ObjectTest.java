package com.briup.test;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class ObjectTest {
	public static void writeObj(String file)throws Exception{
		Student student =new Student("tom",20);
		ObjectOutputStream ooStream=new ObjectOutputStream(new FileOutputStream(file));
		ooStream.writeObject(student);
		ooStream.flush();
		ooStream.close();
	}
	public static void readObj(String file){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
