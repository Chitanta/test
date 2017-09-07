package com.briup.work4;

public class Bank {
	private Customer customers[]=new Customer[5];
	private int custNum;
	public Bank(){}
	public void addCustomer(Customer customer){
		customers[custNum]=customer;
		custNum++;
	}
	public Customer getCustomer(int index){
		return customers[index];
		
	}
	public int getCustNum(){
		return custNum;
	}
	public void setCustNum(int custNum){
		this.custNum=custNum;
	}
	
}
