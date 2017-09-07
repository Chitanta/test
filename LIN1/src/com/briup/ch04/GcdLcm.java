package com.briup.ch04;
import java.util.*;

public class GcdLcm {

	public static void main(String[] args) {
		System.out.println("请输入第一个数");
		Scanner shu=new Scanner(System.in);
		int m=shu.nextInt();
		System.out.println("请输入第二个数");
		Scanner chu=new Scanner(System.in);
		int n=chu.nextInt();
		int r=m;
		if(r%n==0){
			System.out.println("最小公倍数为："+m);
			System.out.println("最大公约数为："+n);
		}
		else{
			while(r%n!=0){
				r=r%n;
				if(n%r!=0){
					r=r%n;
				}
				else
					break;
				
			}
			System.out.println("最小公倍数为："+(m*n)/r);
			System.out.println("最大公约数为："+r);
		}
		
	}

}
