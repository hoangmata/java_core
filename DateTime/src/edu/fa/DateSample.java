package edu.fa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
//		System.out.println(date.getTime());
//		System.out.println(date.getHours());
//		System.out.println(date.getDay());
//		https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH-mm");
		System.out.println(sdf.format(date));
	}
}
