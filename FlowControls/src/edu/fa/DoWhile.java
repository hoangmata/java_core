package edu.fa;

import java.util.Scanner;


public class DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = 2000;
		do {
			System.out.println("Please input a year after 2000: ");
			year = scanner.nextInt();
		}while(year <= 2000);
		System.out.println("Year value: " + year);
		scanner.close();
	}
}
