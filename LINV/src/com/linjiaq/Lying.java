package com.linjiaq;

public class Lying {
	private String name="chichichi";
    static int a=1;
    public static class Man{
    	
    	int a=2;
    }
    public void Outer(){
    	System.out.println("外部："+Lying.this.name);
    	System.out.println("内部："+a);
    	
    	
    }
    public static void main(String[] args) {
		Lying c=new Lying();
		c.Outer();
		
		
	}
}
