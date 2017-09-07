package com.briup.ch14.exercise1;



public class OwnExceptionHandler {

	public static void main(String[] args){
		
			try {
				OwnExceptionSource.a();
			} catch (OwnException e) {
				e.printStackTrace();
			}finally{
				System.out.println("no error");
			}
	
	}
}
