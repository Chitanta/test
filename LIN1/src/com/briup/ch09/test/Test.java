package com.briup.ch09.test;

import java.util.*;
import java.util.Map.Entry;

import com.briup.ch12.exercise2.Student;

public class Test {
	public static void main(String[] args){
	Map map=new HashMap();
	map.put(1,"a");
	map.put(2, "b");
	map.put(3, "c");
	map.put(4, "d");
	map.put(5,"e");
	map.put(6, "f");
	map.put(7, "g");
	map.put(8, "h");
	map.put(9, "i");
	map.put(10, "j");
	Set set=map.keySet();
	Iterator ite=set.iterator();
	while(ite.hasNext()){
		System.out.print(ite.next()+" ");
	}
	System.out.println();
	Set set2 =map.keySet();
	Iterator ite1=set.iterator();
	for(;ite1.hasNext();){
		Object obj =ite1.next();
		System.out.println("key:"+obj+"  "+"value:"+map.get(obj));
	}
	System.out.println();
	Set set3 =map.keySet();
	Iterator iterator=set.iterator();
//	for(;iterator.hasNext();){
//		Entry e =iterator()
//		System.out.println(map.get(object));
//	}
	}
}
