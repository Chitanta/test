package com.asd;
import java.util.Arrays;

public class aaaa {// 定义一个带参带返回值的方法，实现输出随机数数组
	public static void main(String[] args) {
	aaaa hello=new aaaa();
	int[]nums=hello.getArray(6);
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
}
	public int[] getArray(int length){
		int []nums=new int[length];
		for(int i=0;i<nums.length;i++){
			
			nums[i]=(int)(Math.random() * 1000);//1000以内的随机数	
		}
      return nums;
	}
}
