package com.lin;

public class Computer {
	private int price;
	private int cpu;
	private int xianka;

    public Computer(int newprice,int newcpu,int newxianka){
    	price=newprice;
    	cpu=newcpu;
    	xianka=newxianka;
    	System.out.println("price:"+price+"cpu:"+cpu+"xianka:"+xianka);
    }
    public Computer(){
    	System.out.println("没有参数");
    }
}
