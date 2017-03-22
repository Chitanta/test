package com.baidu;
import java.util.Scanner;

public class chengji {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入成绩信息:");
		int score=input.nextInt();
		int count=0;
		System.out.println("加分前的成绩为:"+score);
		while(score<60){
			score++;
			count++;
		}
		System.out.println("加分后的成绩为:"+score);
		System.out.println("共加了"+count+"次");
	}
}
