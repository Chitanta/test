package com.briup.ch03;

public class Ter {

	public static void main(String[] args) {
		int[] arr={65,52,84,97,36,75};
		for(int i=1;i<arr.length;i++){
			int temp=arr[i];
			if(arr[i]<arr[i-1]){
				int j;
				for(j=i-1;j>=0&&arr[j]>temp;j--){
					arr[j+1]=arr[j];
				}
				arr[j+1]=temp;
			}
		}
		for(int arrs:arr){
			System.out.print(arrs+" ");
		}
	}

}
