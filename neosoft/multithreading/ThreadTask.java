package com.neosoft.multithreading;

public class ThreadTask {

	public static void main(String[] args) {
		
		int initial = Integer.parseInt(args[0]);
		int finalEnd = Integer.parseInt(args[1]);
		
		EvenThread evenNums = new EvenThread(initial,finalEnd);
		evenNums.start();
		try {
			evenNums.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		OddThread oddNums  = new OddThread(initial, finalEnd);
		oddNums.start();

	}

}

class EvenThread extends Thread{
	
	public int start,end;

	public EvenThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		System.out.println("Thread: Even Nums");
		this.setName("EvenThread");
		for (int i = start; i <=end; i++) {
			if(i %2 ==0) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(i+" ");
			}
		}
		System.out.println(" - "+this.getName());
	}
}

class OddThread extends Thread{
	
	public int start,end;

	public OddThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		System.out.println("Thread: Odd Nums");
		this.setName("OddThread");
		for (int i = start; i <=end; i++) {
			if(i %2 !=0) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(i+" ");
			}
		}
		System.out.println(" - "+this.getName());
	}
}
