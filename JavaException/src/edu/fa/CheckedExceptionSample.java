package edu.fa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckedExceptionSample {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(1000);
		
		try {
			Files.createFile(Paths.get("Student.txt"));
		}catch (FileAlreadyExistsException | FileNotFoundException | NullPointerException e) {
			System.out.println("File Already");
			System.out.println(e.toString());
		}
		catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Always executed");
		}
		
		System.out.println("After exception");
	}
}
