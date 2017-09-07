package com.briup.ch04;

public class Mp {
	static int[] arr={30,10,5,100,70,41};
	public static void main(String[] args) {
		maopao(arr);
		print(arr);
	}
	public static  void maopao(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void print(int[] arr){
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i==0){
				System.out.print(arr[i]);
			}else {
				System.out.print(","+arr[i]);
			}
		}
		System.out.print(" ]");
	}
}
