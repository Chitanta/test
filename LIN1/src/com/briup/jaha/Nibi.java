package com.briup.jaha;

public class Nibi {

	public static void main(String[] args) {
		int a=0;
		for(int m=1;m<1000;m++){
			for(int n=1;n<m;n++){
				if(m%n==0){
					a=n+a;
					
				}
				else{
					continue;
			}
			}
			if(a==m){
				System.out.println(m);
			}
			a=0;
		}
		
	}

}
