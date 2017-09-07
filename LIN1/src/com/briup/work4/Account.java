package com.briup.work4;

public class Account {
	public double balance;
	public double amount;
	public Account(){}
	public Account(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public boolean deposit(double amount){
		balance=balance+amount;
		return true;
	}
	public boolean withdraw(double amount){
		if(amount>balance){
			return false;
		}else {
			balance=amount;
			return true;
		}
	}
}
