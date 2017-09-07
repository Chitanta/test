package com.briup.work4;

public class SavingAccount extends Account {
	private double rate;
	public SavingAccount(double balance,double rate) {
		this.balance=balance;
		this.rate=rate;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}

	
}
