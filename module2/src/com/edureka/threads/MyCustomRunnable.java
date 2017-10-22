package com.edureka.threads;

public class MyCustomRunnable implements Runnable{

	  public void run(){
		  System.out.println("Printing from the "+Thread.currentThread().getName());
	  }
}
