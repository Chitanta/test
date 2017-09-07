package com.briup.day03.work01;
/**
 * User的bean类
 * @author Hyouka
 *
 */
public class User {
	private String name;
	private Double account;
	
	public User() {
		
	}
	public User(String name, Double account) {
		
		this.name = name;
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAccount() {
		return account;
	}
	public void setAccount(Double account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", account=" + account + "]";
	}
	
}
