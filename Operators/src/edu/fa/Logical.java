package edu.fa;

public class Logical {

	public static void main(String[] args) {
		int a = 6;
		int b = 10;
		System.out.println(a > 7 && b > 9);
		System.out.println(a > 5 && b > 9);
		System.out.println(a > 7 || b > 11);
		System.out.println(a > 5 && b > 9);
		System.out.println(!(a > 7));
		System.out.println(a > 10 | b > 11);
	}

}
