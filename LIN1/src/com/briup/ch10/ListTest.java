package com.briup.ch10;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();//List list =new LinkedList();
		list.add(1);
		list.add("nihao");
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.getClass());
		System.out.println(list.hashCode());
		System.out.println(list.isEmpty());
	}

}
