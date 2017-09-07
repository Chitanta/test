package shabi;

public class Test {

	public static void main(String[] args) {
		Storage storage=new Storage();
		Counter c1=new Counter(" c1", storage);
		Printer p1=new Printer("P1", storage);
		c1.start();
		p1.start();

	}

}
