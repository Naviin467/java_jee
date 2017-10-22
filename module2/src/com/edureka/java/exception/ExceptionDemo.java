package com.edureka.java.exception;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[]{0,2,3,4,5,6,7,8,9,10}; 
		System.out.println("Please enter a number between 1 and "+ array.length+" ..");
		int one = sc.nextInt();
		System.out.println("Please enter another number ...");
		int two = sc.nextInt();
		sc.close();
		try {
			System.out.println("You have entered "+array[one] + " and "+array[two]);
		    System.out.println("The division is "+array[one]/array[two]);
		 
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException ex ){
			System.out.println("Please try again with valid inputs.");
		} catch (Exception exception){
			System.out.println("Generic Exception");
		} finally {
			System.out.println("this statement will be executed in both the exception"
					+ "and non exception scenarios.");
		}
		System.out.println("Have a nice day Ahead !!");
		
	}

}
