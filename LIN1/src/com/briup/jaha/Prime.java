package com.briup.jaha;

public class Prime {

	public static void main(String[] args) {
		f1:for(int i=101;i<200;i++){
			for(int j=2;j<200 && j!=i;j++){
				if(i%j!=0){
					continue;
				}
				else{
					continue f1;
				}
			}
			System.out.println(i);
		}
	}

}
