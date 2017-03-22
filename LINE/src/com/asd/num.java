package com.asd;

public class num {                    //求数组中的最小值和最大值并求数组的和以及平均值
	public static void main(String[] args) {
		int nums[]={12,43,53,32,64};
		int max=nums[0];
		int min=nums[0];
		int sum=0;
		double avg=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>max){
				max=nums[i];
			}else max=max;
			if(nums[i]<min){
				min=nums[i];
			}
			sum=sum+nums[i];
		}
		avg=sum/nums.length;
		System.out.println("数组中的最大值为:"+max);
		System.out.println("数组中的最小值为:"+min);
		System.out.println("数组的和为:"+sum);
		System.out.println("数组和的平均值为:"+avg);
	}

}
