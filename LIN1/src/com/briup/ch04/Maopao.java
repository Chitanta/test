package com.briup.ch04;

public class Maopao {

	public static void main(String[] args) {
		int arr[]={80,60,100,10,90};
		print(arr);
		bubble(arr);
		print(arr);
	}
	public static void bubble(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
