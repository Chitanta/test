package com.briup.jaha;

public class Digit {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				for(int k=1;k<=4;k++){
					if(i!=j && i!=k && j!=k){
						System.out.println(100*i+10*j+k);
						sum++;
					}
				}
			}
		}
		System.out.println("共能组成"+sum+"个数");
	}

}
