package com.asd;
import java.util.Arrays;
public class world {
	public static void main(String[] args) {
		world hello=new world();
		int[]scores={88,99,77,66,97};
		int count=hello.sort(scores);
		System.out.println("共有"+count+"个成绩信息！");
	}
	public int sort(int[] scores){
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		return scores.length;
	}

}
