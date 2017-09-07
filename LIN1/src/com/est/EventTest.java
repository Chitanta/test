package com.est;

public class EventTest {

	public static void main(String[] args) {
		//创建一个女生对象
		Girl lily=new Girl("lily");
		
		EmotionListener tom=new EmotionListener() {
			
			@Override
			public void sad(EmotionEvent e) {
				
				
			}
			
			@Override
			public void happy(EmotionEvent e) {
				Girl girl=(Girl)e.getSource();
				if(girl.getName().equals("lily")){
					System.out.println("tom给"+girl.getName()+"送花...");
				}if(girl.getName().equals("xiaohua")){
					System.out.println("tom给"+girl.getName()+"发红包...");
				}
				
			}
		};
		Girl xiaohuaGirl=new Girl("xiaohua");
		lily.addEmotionListener(tom);
		xiaohuaGirl.addEmotionListener(tom);
		lily.happy();
		xiaohuaGirl.happy();
		
	}

}
