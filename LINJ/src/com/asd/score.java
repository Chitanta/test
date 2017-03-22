package com.asd;

public class score {//Java 中无参带返回值方法的使用
	public static void main(String[] args) {
		// 创建名为hello的对象
		score hello =new score();
		// 调用hello对象的calcAvg()方法，并将返回值保存在变量avg中
		double avg=hello.calaAvg();
		System.out.println("平均成绩为:"+avg);
	}
	// 定义一个返回值为double类型的方法
	public double calaAvg(){
		double math=88;
		double English=86;
		double avg=(math+English)/2;
		return avg;
	}
}
