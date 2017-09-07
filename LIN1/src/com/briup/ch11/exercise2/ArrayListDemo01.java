package com.briup.ch11.exercise2;
import java.util.*;

public class ArrayListDemo01 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(12121);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(40);
		list.add(4);
		list.add(5);
		list.add(8);
		list.add(10);
		list.add(1000);
		//第一种
		for(int i=0;i<list.size();i++){
			System.out.print("  "+list.get(i));
		}
		System.out.println();
		//第二种
		Iterator iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.print("  "+iterator.next().toString());
		}
		System.out.println();
		//第三种
		Object[] a=list.toArray();
		for(int i=0;i<a.length;i++){
			System.out.print("  "+a[i]);
		}
		
	}

}
