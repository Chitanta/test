package com.briup.ch12.exercise2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {

	public static void main(String[] args) {
		Set set = new TreeSet<Student>();
		Student s1 = new Student(1, "Jerry", 99.0);
		Student s2 = new Student(2, "Tom", 60.0);
		Student s3 = new Student(3, "houk", 80.0);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		Iterator<Student> ite = set.iterator();
		while (ite.hasNext()) {
			if (s1.getName() == "Tom") {
			}
			System.out.println(ite.next() + " ");
		}
		for (Object object : set) {
			System.out.println(object);
		}
		System.out.println();
	}

}
