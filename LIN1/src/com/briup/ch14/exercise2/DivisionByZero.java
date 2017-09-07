package com.briup.ch14.exercise2;

public class DivisionByZero {
	public static Integer division(Integer a,Integer b) {
		Integer res=0;
		try {
			res=a/b;
			throw new ArithmeticException("error");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally{
			System.out.println(res);
		}
		return res;
	}
	public static void main(String[] args)throws ArithmeticException {
		Integer x=10,y=0;
		try {
			division(x, y);
		} catch (ArithmeticException a) {
			System.out.println(a.getMessage());
		}
		
	}
}
