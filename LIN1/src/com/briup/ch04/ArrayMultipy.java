package com.briup.ch04;
import java.util.*;

public class ArrayMultipy {

	public static void main(String[] args) {
		int[] arr;
		int a=1;
		arr=new int[10];
		for(int i=0;i<arr.length;i++){
			
				arr[i]=i+1;
			    a=a*arr[i];
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(a);
	}

}
