package com.briup.ch03;

public class Test2{
	public static void main(String[] args) {
		int[] arr={21,54,20,98,75,99};
		for(int i=1;i<arr.length-1;i++){
			if(arr[i-1]>arr[i]){
				int j;
				int temp=arr[i];
				for(j=i-1;j>=0 && arr[j]>temp;j--){
					arr[j+1]=arr[j];
				}
				arr[j+1]=temp;
			}
		}
		for(int arrr:arr){
			System.out.print(arrr+" ");
		}
	}
}
