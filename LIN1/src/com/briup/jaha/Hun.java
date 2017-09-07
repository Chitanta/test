package com.briup.jaha;

import java.util.Scanner;
public class Hun {

	public static void main(String[] args) {
		System.out.println("请输入一个数：");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		System.out.print(n+"=");
		for(int i=2;i<=n/2;i++){
			while(n!=i){
				if(n%i==0){
					System.out.print(i+"*");
					n=n/i;
				}
				else {
					break;
				}
			}
		}
		System.out.print(n);

	}

}
