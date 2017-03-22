package com.asd;

public class names {//定义一个两行三列的二维数组 names 并赋值，使用二重循环输出二维数组中的元素
	public static void main(String[] args) {
		String[][]names={{"赵一","钱二","孙三"},{"李四","周六","吴七"}};
		for(int i=0;i<names.length;i++){
			for(int j=0;j<names[i].length;j++){
				System.out.print(names[i][j]);
			}
			System.out.println();
		}
	}

}
