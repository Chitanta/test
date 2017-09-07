package com.briup.ch04;

public class Charu {

	public static void main(String[] args) {
		int arr[]={456,21,98,330,52,1};
		print(arr);
		insertSort(arr);
		print(arr);

	}
	public static void insertSort(int[] arr) {   
	    int size = arr.length, temp, j;   
	    for(int i=1; i<size; i++) {   
	        temp = arr[i];   
	        for(j = i; j > 0 && temp <arr[j-1]; j--)   
	           arr[j] = arr[j-1];   
	           arr[j] = temp;   
	    }   
	}
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
