package com.briup.jaha;

public class Divade {
	public static void Fan(int n){
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				System.out.print(i+"*");
				if(prime(n/i)){
					System.out.print(n/i+"*");
					return;
				}else{
					Fan(n/i);
					return;
				}
			}
		}
	}
	public static boolean prime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Fan(55555);
	}
}
