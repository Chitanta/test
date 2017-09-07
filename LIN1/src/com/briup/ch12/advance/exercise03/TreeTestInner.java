package com.briup.ch12.advance.exercise03;

import java.util.*;

public class TreeTestInner {
	
	public static void main(String[] args) {
		Set<String> set =new TreeSet<String>(new Comparator<Object>() {
			public int compare(Object o1,Object o2){
				String s1=(String)o1;
				String s2=(String)o2;
			if(s1.compareTo(s2)>0){
				return 1;
			}else if(s1.compareTo(s2)<0){
				return -1;
			}else{
				return 0;
			}
			}
			}) ;
		set.add("HashSet");
		set.add("ArrayList");
		set.add("TreeMap");
		set.add("HashMap");
		set.add("TreeSet");
		set.add("LinkedList");
		Iterator<String> ite=set.iterator();
		while(ite.hasNext()){
			System.out.print(ite.next()+" ");
		}
		System.out.println();
		Iterator<String> iter=((TreeSet<String>) set).descendingIterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
	}
}
