package com.briup.ch17;

public class NumberRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i==20) {
				try {
					Thread.sleep(100000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" "+"1:"+i);
		}

	}

	public static void main(String[] args) {
		System.out.println("main begin");
		NumberRunnable nr = new NumberRunnable();
		Thread th = new Thread(nr);
		th.start();
		Thread th2=new Thread(nr);
		th2.start();
		System.out.println("main end");
	}
}
