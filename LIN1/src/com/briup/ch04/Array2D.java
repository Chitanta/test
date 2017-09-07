package com.briup.ch04;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		int twoD[][];
		twoD =new int[4][];
		int arr[]={1,2,3,4};
		int arr1[]={2,1,5,6,4};
		int arr2[]={9,11,55,44,66,77};
		int arr3[]={10,20,30,40,50,60,70};
		int oneD[]={12,24,36,48};
		twoD[0]=arr;
		twoD[1]=arr1;
		twoD[2]=arr2;
		twoD[3]=arr3;
		for(int i=0;i<twoD.length;i++){
			for(int j=0;j<twoD[i].length;j++){
				twoD[i][j]=(int)(Math.random()*100);
				System.out.print(twoD[i][j]+" ");
			}
			System.out.println();
		}
		twoD[0]=oneD;
		System.out.println(Arrays.toString(oneD));
		for(int i=0;i<twoD.length;i++){
			for(int j=0;j<twoD[i].length;j++){
				System.out.print(twoD[i][j]+" ");
			}
			System.out.println();
		}
	}

}
