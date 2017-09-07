package com.briup.ch13;

public class GenderTest {

	public static void main(String[] args) {
		Gender g =Gender.MALE;
		Gender g1=Gender.valueOf("MALE");
		System.out.println(g.name()+"  "+g.ordinal());
		System.out.println(g);
		System.out.println(g1);
		Gender[] g2=Gender.values();
		for(Gender gg:g2){
			System.out.print("  "+gg);
		}
	}

}
