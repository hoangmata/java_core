package edu.fa;

public class IfElseSample {

	public static void main(String[] args) {
		int year = 2025;
		int month = 8;
		if(year < 2020) {
			System.out.println("Before");
		}else if(year < 2030) {
			System.out.println("After 2020 and before 2030");
			if(month > 8) {
				System.out.println("Autumn");
			}else if (month < 4) {
				System.out.println("Spring");
			}else {
				System.out.println("Summer");
			}
		}
		else {
			System.out.println("Else condition");
		}
	}

}
