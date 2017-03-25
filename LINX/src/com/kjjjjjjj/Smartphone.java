package com.kjjjjjjj;

public class Smartphone extends Telephone implements IPlaygame{
	public void Can(){
		System.out.println("智能机能打电话");
	}

	@Override
	public void playgame() {
		// TODO Auto-generated method stub
		System.out.println("智能机能玩游戏！");
	}
	

}
