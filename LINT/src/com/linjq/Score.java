package com.linjq;

public class Score {
	//静态方法
	static int score1=90;
	static int score2=88;
	public static  int sum(){
		return score1+score2;
	}
	public static void main(String[] args) {
		int AllScore=Score.sum();
		System.out.println("成绩总和为"+AllScore);
	}
}
