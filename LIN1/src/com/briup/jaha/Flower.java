package com.briup.jaha;

public class Flower {

	public static void main(String[] args) {
		for(int a=100;a<1000;a++){
			int b=a/100;
			int c=(a%100)/10;
			int d=(a%100)%10;
			if(Math.pow(b, 3)+Math.pow(c, 3)+Math.pow(d, 3)==a){
				System.out.println(a);
			}
		}
	}
}
