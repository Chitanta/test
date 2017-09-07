package com.briup.ch13;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void printList(List<?> list){
		for(Object o:list){
			
		}
	}
	public static void main(String[] args) {
		Point<Integer,Double> p=new Point<Integer,Double>(4,5.3);
		double x=p.getX();
		double y=p.getY();
		System.out.println(x+":"+y);
		List<String> list=new ArrayList<String>();
		list.add("D");
		list.get(0);
		for(String s:list){
			System.out.println(s);
		}
		printList(list);
	}

}
