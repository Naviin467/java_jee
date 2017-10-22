package com.edureka.java.exception;

public class MyCustomException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String message;

	public MyCustomException() {
		super();
	}

	public MyCustomException(String message) {
		super(message);
	}
	
	public String getMessage(){
		return this.message;
	}

}
