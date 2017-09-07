package com.briup.day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties p = new Properties();
		try {
			p.load(new FileInputStream("src/com/briup/day01/student.properties"));
			String name = (String) p.get("name");
			System.out.println(name);

			System.out.println("-------------------------------------");

			String s1 = "hello";
			String s2 = "world";
			StringBuilder sb = new StringBuilder();
			sb.append(s1);
			sb.append(s2);
			System.out.println(sb.toString());
			System.out.println("---------------------------------------");
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				sum += i;
			}
			System.out.println(sum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
