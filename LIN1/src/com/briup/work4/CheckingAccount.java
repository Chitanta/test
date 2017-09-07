package com.briup.work4;

public class CheckingAccount extends Account {
	private double overdraft;
	public CheckingAccount(double balance, double overdraft){
		this.balance=balance;
		this.overdraft=overdraft;
	}
	public CheckingAccount(double balance){
		this.overdraft=0;
	}
	public boolean withdraw(double amount){
		if(amount>balance+overdraft){
			
			return false;
		}else{
			balance=balance-amount;
			if(balance<0){
				overdraft=overdraft+balance;
			}
			
			
			return true;
		}
	}
	public double getOverdraft(){
		return overdraft;
	}
}
