package com.asd;
                //定义一个无参带返回值的方法，实现输出学生年龄的最大值

public class ahhh {
	public static void main(String[] args) {
		ahhh hello=new ahhh();
		int maxScore=hello.getMaxAge();
		System.out.println("最大年龄为:"+maxScore);
	}
	public int getMaxAge(){
		int ages[]={16,21,55,28,43,70};
		int maxScore=ages[0];
		for(int i=0;i<ages.length;i++){
			if(ages[i]>ages[0]){
				maxScore=ages[i];
			}
			else maxScore=maxScore;
		}
		return maxScore;                                                                                                                                                                                                                                                                                         
	}

}
