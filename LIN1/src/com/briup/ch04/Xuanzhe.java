package com.briup.ch04;

public class Xuanzhe {

	public static void main(String[] args) {
		int arr[]={88,64,1320,1,45,82,60};
		print(arr);
		selectSort(arr);
		print(arr);

	}
	public static void selectSort(int[] arr) {   
	    int temp;   
	    for (int i = 0; i <arr.length-1; i++) {   
	        int k = i;   
	        for (int j = arr.length- 1; j >i; j--)  {   
	            if (arr[j] < arr[k])  {
	            	k = j;
	            }   
	        }   
	        temp = arr[i];   
	        arr[i] = arr[k];   
	        arr[k] = temp;   
	    }   
	}  
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
