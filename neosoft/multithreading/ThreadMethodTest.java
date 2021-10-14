package com.neosoft.multithreading;

public class ThreadMethodTest extends Thread {
	
	@Override
	public void run() {
		
	}
	public static void main(String[] args) {
		
//		ThreadMethodTest thread1 = new ThreadMethodTest();
//		ThreadMethodTest thread2 = new ThreadMethodTest();
//		
//		thread1.start();
//		thread2.start();
//		
//		for(int i=0;i<3;i++) {
//			thread1.yield();//pauses the execution of the current thread to execute other threads temp.
//			System.out.println(Thread.currentThread().getName()+" in control");
//		}
		
//		ThreadMethodTest2 thread1 = new ThreadMethodTest2();
//		ThreadMethodTest2 thread2 = new ThreadMethodTest2();
//		ThreadMethodTest2 thread3 = new ThreadMethodTest2();
//		
//		thread1.start();
//		thread2.start();
//		thread2.suspend();
//		thread3.start();
//		thread2.resume();
		
		//Daemon Thread
		
//		ThreadMethodTest thread4 = new ThreadMethodTest();
//		ThreadMethodTest thread5 = new ThreadMethodTest();
//		thread4.setDaemon(true);
//		thread4.start();
//		System.out.println(Thread.currentThread().isDaemon());
//		thread5.start();
//		
//		System.out.println(Thread.currentThread().isDaemon());
		
		ThreadMethodTest2 thread1 = new ThreadMethodTest2();
		thread1.start();
		try {
			thread1.interrupt();
		}catch(Exception e) {
			System.out.println("Interrupting..."+e.getMessage());
		}
	}

}

class ThreadMethodTest2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(1000);
				System.out.println(Thread.currentThread().getName()+" in control");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
}
