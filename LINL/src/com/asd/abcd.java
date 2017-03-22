package com.asd;

public class abcd {
	public static void main(String[] args) {
		abcd hello=new abcd();
		hello.calcAvg(89,79);
		
	}
	public void calcAvg(double score1,double score2){
		double avg=(score1+score2)/2;
		System.out.println("平均成绩为:"+avg);
	}
}
