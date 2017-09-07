package com.briup.ch17.exercise1;

class Counter extends Thread{
	private Storage storage;
	public Counter(String name,Storage storage){
		setName(name);
		this.storage=storage;
	}
	public void run(){
		System.out.println(getName()+"--开始运行--");
		int b = 0;
		for(int i=0;i<=99;i++){
			b=i;
		}
		storage.seta(b);
		storage.setFlag(true);
		synchronized (storage) {
			storage.notifyAll();
		}
		System.out.println(getName()+"--运行结束--");
	}
}
class Printer extends Thread{
	private Storage storage;
	public Printer(String name,Storage storage){
		setName(name);
		this.storage=storage;
	}
	public void run(){
		System.out.println(getName()+"--开始运行--");
		while (!storage.isFlag()) {
			synchronized (storage) {
				try {
					storage.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(getName()+" Storage的值为："+storage.geta());
		System.out.println(getName()+"--运行结束--");
	}
}
public class Test {

	public static void main(String[] args) { 
		Storage storage=new Storage();
		Counter c1=new Counter(" c1", storage);
		Printer p1=new Printer("P1", storage);
		c1.start();
		p1.start();

	}

}
