package com.briur;

public class DeadLock extends Thread{
	private Object obj1;
	private Object obj2;
	public DeadLock(Object obj1,Object obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void run(){
		String name=getName();
		if("Thread=0".equals(name)){
			while(true){
			synchronized(obj1){
				synchronized (obj2) {
					System.out.println(name+"...");
				}
			}
			}
		}
		else{
			while(true){
			synchronized (obj2) {
				synchronized (obj1) {
					System.out.println(name+"...");
				}
			}
			}
		}
	}
	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=new Object();
		DeadLock d1=new DeadLock(o1, o2);
		DeadLock d2=new DeadLock(o1, o2);
		d1.start();
		d2.start();
	}

}
