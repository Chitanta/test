package com.jia;

public class Computer {
	private int price;
	private int cpu;
	private int xianka;
	
    public int getPrice(){
    	return price;
    }
    public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	public int getXianka() {
		return xianka;
	}
	public void setXianka(int xianka) {
		this.xianka = xianka;
	}
	public void setPrice(int newPrice){
    	price=newPrice;
    }
    
    
}
