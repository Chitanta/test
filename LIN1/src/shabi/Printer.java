package shabi;


public class Printer extends Thread {
	private Storage storage;

	public Printer(String name, Storage storage) {
		setName(name);
		this.storage = storage;
	}

	public void run() {
		System.out.println(getName() + "--开始运行--");
		while (!storage.isFlag()) {
			synchronized (storage) {
				try {
					storage.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(getName() + " Storage的值为：" + storage.getVal());
		System.out.println(getName() + "--运行结束--");
	}
}
