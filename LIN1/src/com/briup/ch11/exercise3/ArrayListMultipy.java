package com.briup.ch11.exercise3;
import java.util.*;

public class ArrayListMultipy {

	public static void main(String[] args) {
		int sum=1;
		List list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		for(int i=0;i<list.size();i++){
			sum=sum*(int)list.get(i);
		}
		System.out.print("  "+sum);
	}

}
