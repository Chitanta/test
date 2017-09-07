package com.briup.ch12.advance.exercise02;

import java.util.*;

public class TreeSetTest1 {
	
	public static void main(String[] args) {
		Set<String> set =new TreeSet<String>() ;
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
