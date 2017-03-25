package com.kjjjjjjj;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone tel=new Telephone();
		Telephone tel2=new Cellphone();
		Telephone tel3=new Smartphone();
		tel.Can();
		tel2.Can();
		tel3.Can();
		IPlaygame ip1=new Smartphone();
		ip1.playgame();
		IPlaygame ip2=new Psp();
		ip2.playgame();
		//实用匿名内部类的方法实现接口
		IPlaygame ip3=new IPlaygame(){
			public void playgame(){
				System.out.println("PSP能玩游戏游戏111");
			}
		};
		ip3.playgame();
		new IPlaygame(){
			public void playgame(){
				System.out.println("PSP能玩游戏222");
			}
		}.playgame();
	}

}
