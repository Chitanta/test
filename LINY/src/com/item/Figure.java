package com.item;

public class Figure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[10];
		for (int i = 0; i < nums.length; i++) {
			int x=(int)(Math.random()*10);//随机产生10个0-10之间的随机数
			nums[i]=x;//将产生的随机数赋值给数组

		}
		//foreach循环输出数组中每个元素
		for(int z:nums){
			System.out.print(z);	
		}
		
	}

}
