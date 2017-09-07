package com.briup.ch17;

public class RaceTest extends Thread {
	private static boolean isRunning = false;

	public RaceTest(String name) {
		setName(name);
	}

	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (!isRunning) {
				System.out.println(getName() + "run:" + i);
			}
//			if (i == 20) {
//				try {
//					sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
		}
		isRunning = true;
	}

	public static void main(String[] args) {
		RaceTest rub = new RaceTest("rubbit");
		RaceTest turtle = new RaceTest("turtle");
		System.out.println("race is alive:" + turtle.isAlive());
		// turtle.interrupt();
		turtle.start();
		rub.start();
		// 主方法里调用join 就是主方法等待join()的完成
//		try {
//			rub.join();
//			turtle.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("after start race is alive:" + turtle.isAlive());
	}
}
