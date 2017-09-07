package com.briup.ch09.exersice04;

public class Production extends Water implements Buffer,Filtration,Warm,Sugar{
	public void Buffer(){
		System.out.println();
	}
	public void Filtration(){
		System.out.println("水经过了过滤   Rua~");
	}
	public void Warm(){
		System.out.println("水经过了加热    真实");
	}
	public void Sugar(){
		System.out.println("水加过糖了   很神秘");
	}

}
