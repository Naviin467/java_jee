package com.edureka.threads;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.setName("name of thread");;;
		myThread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread >> " + Thread.currentThread().getName());
			Thread.sleep(2000);
		}


	}

}

class MyThread extends Thread {

	MyThread() {
		super();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.currentThread();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
