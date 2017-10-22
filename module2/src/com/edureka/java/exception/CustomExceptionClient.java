package com.edureka.java.exception;

public class CustomExceptionClient {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount();
		account.deposit(2000);
		System.out.println("The current balance is " + account.getBalance());

		try {
			account.withdraw(1000);
			System.out.println("The current balance after first withdrawal is " + account.getBalance());
		} catch (MyCustomException ex) {
			System.out.println("insufficient Funds");
			throw new IllegalArgumentException("Insufficinet Funds");
		}
		try {
			account.withdraw(2000);
			System.out.println("The current balance after the second withdrawals is " + account.getBalance());
		} catch (MyCustomException exception) {
			System.out.println("Insufficient funds.");
		}
	}

}
