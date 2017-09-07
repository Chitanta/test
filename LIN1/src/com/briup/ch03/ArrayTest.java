package com.briup.ch03;


public class ArrayTest {
	static int[] arr={10,2,50,600,5,1,98};
	public static void main(String[] args) {
		print(arr);
		SelectSort(arr);
		print(arr);
		
	}
	public static void SelectSort(int[] arr){
	for(int i=0;i<arr.length-1;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}	
	}
	public static void print(int[] arr){
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
			if(x!=arr.length-1){
			System.out.print(arr[x]+",");
			}else 
				System.out.print(arr[x]+"]");
			}
		System.out.println();
	}
}
