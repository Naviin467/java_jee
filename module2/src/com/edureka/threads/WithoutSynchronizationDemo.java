package com.edureka.threads;

class Printer {

	public void printCount() {
		synchronized (this) {

			for (int i = 5; i > 0; i--) {
				System.out.println("Counter for " + Thread.currentThread().getName() + " --- " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException ex) {
					System.out.println("Thread gout interrupted.");
				}
			}
		}
	}
}

public class WithoutSynchronizationDemo {

	public static void main(String[] args) {

		Printer printer = new Printer();

		PrinterService client1 = new PrinterService("JOB-1", printer);
		PrinterService client2 = new PrinterService("JOB-2", printer);

		client1.initialize();
		client2.initialize();

		System.out.println("Ending the main thread.");
	}
}

class PrinterService extends Thread {
	private Thread t;
	private String threadName;
	Printer printer;

	public PrinterService(String name, Printer printer) {
		threadName = name;
		this.printer = printer;
	}

	public void run() {
		printer.printCount();
	}

	public void initialize() {
		System.out.println("The name of the thread is " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
