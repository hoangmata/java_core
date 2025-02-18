package edu.fa;

import java.time.Duration;
import java.time.LocalTime;

public class StringPerformance {

	public static void main(String[] args) {

		final int VALUE = 20000;
		
		LocalTime start = LocalTime.now();
		String link = "";
		for (int i = 0; i < VALUE; i++) {
			link += i;
		}
		LocalTime finish= LocalTime.now();
		System.out.println("String append: " + Duration.between(start, finish));
		
		start = LocalTime.now();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < VALUE; i++) {
			sb.append(i);
		}
		finish = LocalTime.now();
		System.out.println("StringBuilder append: " + Duration.between(start, finish));
		
	}

}
