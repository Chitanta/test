package shabi;

public class Counter extends Thread {
	private Storage storage;

	public Counter(String name, Storage storage) {
		setName(name);
		this.storage = storage;
	}

	public void run() {
		System.out.println(getName() + "--开始运行--");
		int b = 0;
		for (int i = 0; i <= 99; i++) {
			b = i;
		}
		storage.setVal(b);
		storage.setFlag(true);
		synchronized (storage) {
			storage.notifyAll();
		}
		System.out.println(getName() + "--运行结束--");
	}
}
