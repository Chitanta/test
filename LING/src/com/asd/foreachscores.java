package com.asd;
import java.util.Arrays;
public class foreachscores {
	public static void main(String[] args) {//分别用for和foreach对数组进行排序和遍历并将数组转换为字符串
		int scores[]={23,55,98,75,100,34};
		Arrays.sort(scores);
		for(int i=0;i<scores.length;i++){
        	System.out.println(scores[i]);
        
        }
		for(int score:scores){
        	System.out.println(score);
        }
		System.out.println(Arrays.toString(scores));
	}
}


