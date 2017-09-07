package com.briup.ch17.exercise1;

public class Race extends Thread {
	private static boolean isRunning = false;

	public Race(String name) {
		setName(name);
	}

	public synchronized void run() {
		for (int i = 0; i < 100;) {
			double e = Math.random();
			if (!isRunning) {
				
				if (e <= 0.3) {
					if(getName().equals("兔子")){
					i += 2;
					System.out.println(getName() + "跑了:" + i);
					}
					else{
						continue;
					}
				}
				
				else {
					if (getName().equals("乌龟")) {
						i += 1;
						System.out.println(getName() + "跑了:" + i);
					}else {
						continue;
					}
				}
				
			}

		}
		isRunning = true;
	}

	public static void main(String[] args) {
		Race turtle = new Race("乌龟");
		Race rubbit = new Race("兔子");
		turtle.start();
		rubbit.start();
	}
}
