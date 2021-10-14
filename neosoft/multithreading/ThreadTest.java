package com.neosoft.multithreading;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		System.out.println("Thread 1 is running");
		this.setName("ThreadTest -1");
		System.out.println(this.getName());//Thread.currentThread()
		System.out.println(this.getId());
		System.out.println("Is Alive : "+this.isAlive());
	}
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		ThreadTest threadtest1 = new ThreadTest();
		threadtest1.start();
		
//		
//		ThreadClass2 threadtest2 = new ThreadClass2();
//		Thread thread2 = new Thread(threadtest2);
//		thread2.start();
//		
		ThreadClass3 threadtest3 = new ThreadClass3();
		threadtest3.start();
		System.out.println("isAlve : "+threadtest1.isAlive());
		
//		ThreadClass3 threadtest1 = new ThreadClass3();
//		ThreadClass3 threadtest2 = new ThreadClass3();
//		ThreadClass3 threadtest3 = new ThreadClass3();
//		try {
//			threadtest1.start();
//			threadtest1.join();
//			threadtest2.start();
//			threadtest2.join();
//			threadtest3.start();
//		}catch(InterruptedException e) {
//			System.out.println(e);
//		}
	}

}

class ThreadClass2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread 2 is running");
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadClass3 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
	}
}
