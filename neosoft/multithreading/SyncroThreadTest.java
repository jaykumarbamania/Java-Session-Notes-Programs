package com.neosoft.multithreading;

public class SyncroThreadTest extends Thread {

	@Override
	public void run() {
		System.out.println("Thread Name: " + this.getName());
		System.out.println("Hold Locks? : " + this.holdsLock(this)); // false

		synchronized (this) {
			System.out.println("Hold Locks? : " + this.holdsLock(this));
		}
	}

	public static void main(String[] args) {

//		SyncroThreadTest thread = new SyncroThreadTest();
//		thread.start();
		Printer printer = new Printer();
		new PC1(printer).start();
		new PC2(printer).start();

	}

}

class Printer {
	 synchronized void doPrint(String doc) { //using synchronized here will block whole method
		 System.out.println("Non-Syn Area");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Printing " + doc + " #" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Non-Syn Area");
	}
}

class PC1 extends Thread{
	Printer p;
	
	public PC1(Printer p) {
		this.p = p;
	}	
	
	@Override
	public void run() {
	//	Printer.doPrint("JAVA"); using static
		p.doPrint("JAVA");
	}
}

class PC2 extends Thread{
	Printer p;
	
	public PC2(Printer p) {
		this.p = p;
	}	
	@Override
	public void run() {
		//			new Printer().doPrint("Python");
		p.doPrint("Python");
	}
}
