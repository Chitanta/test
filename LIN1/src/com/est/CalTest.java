package com.est;
class Calculate extends Thread{
	private Result result;
	public Calculate(String name, Result result){
		setName(name);
		this.result=result;
	}
	public void run(){
		System.out.println(getName()+"run...");
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		result.setVal(sum);
		result.setFlag(true);
		synchronized (result) {
			result.notifyAll();
		}
		System.out.println(getName()+"END");
	}
	
}
class Print extends Thread{
	private Result result;
	public Print(String name, Result result){
		setName(name);
		this.result=result;
	}
	public void run(){
		System.out.println(getName()+"run...");
		while(!result.getIsFlag()){
			synchronized (result) {
				try {
					result.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(getName()+"  "+"result:"+result.getVal());
		System.out.println(getName()+"end...");
	}
	
}
public class CalTest {
	public static void main(String[] args) {
		Result re1=new Result();
		Calculate ca1=new Calculate("cal", re1);
		Print pr1=new Print("pr1", re1);
		ca1.start();
		//pr1.setPriority(10);设置线程优先级 
		pr1.start();
	}
}
