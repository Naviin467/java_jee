package com.edureka.threads;

public class ExtendThread{
	MyCustomRunnable runnable;
	ExtendThread(MyCustomRunnable runnable){
		this.runnable = runnable;
	}
	
	public void run(){
		System.out.println("Inside the run method ");
	}
	public static void main(String[] args) {
		Thread t = new Thread(new MyCustomRunnable());
		t.start();
		
	}

}
