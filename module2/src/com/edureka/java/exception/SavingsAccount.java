package com.edureka.java.exception;

public class SavingsAccount {
	private double balance = 0;
	
	public void deposit(double amount){
		balance = balance+amount;
	}
	
	public double withdraw(double amount) throws MyCustomException{
		if (amount > balance){
			throw new MyCustomException("Amount exceeds Balance amount");
		}
		balance  = balance - amount;
		return amount;
	}
	
	public double getBalance(){
		return balance;
	}

}
