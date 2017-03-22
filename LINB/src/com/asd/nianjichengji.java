package com.asd;
import java.util.Scanner;

public class nianjichengji {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int classNum=3;
		int stuNum=4;
		double sum=0;
		double avg=0;
		for(int i=1;i<=classNum;i++){
			sum=0;
			System.out.println("第"+i+"个班级的学生成绩信息");
			for(int j=1;j<=stuNum;j++){
				System.out.print("请输入第"+j+"名学生的成绩:");
				int score=input.nextInt();
				sum=sum+score;	
			}
			avg=sum/stuNum;
			System.out.println("第"+i+"个班级的平均分为:"+avg);
		}
	}
}
