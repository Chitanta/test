package com.briup;
import java.util.Arrays; 

public class HelloWorld {// 定义一个包含整型数组参数的方法，用来接收成绩数组，进行成绩排序并输出前三名
	public static void main(String[] args) {
		System.out.println("前三名的成绩为:");
		int[]scores={-23,-53,76,98,0,123,43};
		HelloWorld hello=new HelloWorld();
		hello.ASD(scores);
	}
	public void ASD(int[]scores){
		Arrays.sort(scores);
		int num=0;
		/*使用 for 循环遍历数组中的元素，由于要输出的是前三名成绩，所以从后往前遍历，
		 * 即倒序遍历 如 for ( int i = scores.length - 1; i >= 0; i-- ) { }
		 */
		for(int i=scores.length-1;i>=0;i--){
			if(scores[i]<0||scores[i]>100){
				continue;
			}
			num++;
			if(num>3){
				break;
			}
			System.out.println(scores[i]);
		}
	}
}