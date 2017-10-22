package com.edureka.threads;

public class RunnableDemo {

	public static void main(String[] args) {
		// MyCustomRunnable runnable = new MyCustomRunnable();
		// Thread t = new Thread(runnable);

		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Printing from the " + Thread.currentThread().getName());
			}
		});
		Thread t2 = new Thread(() -> {
			System.out.println("Printing from the " + Thread.currentThread().getName());
		});
		
		t.setName("runnable");
		t.start();
		System.out.println(Thread.currentThread().getName());

	}

}
