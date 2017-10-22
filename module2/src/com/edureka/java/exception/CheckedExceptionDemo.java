package com.edureka.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException {
		try{
			accessFile("C://data_files/file4.txt");
		} catch (IOException ex){
			System.out.println("Something went wrong when accessing the file");
			//ex.printStackTrace();
		}
	}

	public static void accessFile(String fileName) throws IOException {
		FileReader reader = new FileReader(new File(fileName));
		reader.read();
		reader.close();

		System.out.println("Came after the exception block");
	}

}
