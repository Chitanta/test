package com.briup.ch04;
import java.util.*;

public class Work3 {

	public static void main(String[] args) {
		int array1[]={2,3,5,7,11,13,17,19};
		System.out.println(Arrays.toString(array1));
		int array2[];
		array2=new int[8];
		System.arraycopy(array1, 0, array2, 0, array2.length);
		System.out.println(Arrays.toString(array2));
		for(int i=1;i<array2.length-1;i++){
			if(i%2==0){
				array2[i]=i;
			}
		}
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array1));
	}

}
