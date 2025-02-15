package edu.fa;

public class LogicalOperators {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println("Practice with && - &");
		if(a++ > 6 && b++ > 11) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		System.out.println("a: " + a + "\t" + "b: " + b);
		
		a = 5;
		b = 10;
		System.out.println("Practice with || - |");
		if(a-- > 4 || b-- > 9) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		System.out.println("a: " + a + "\t" + "b: " + b);
	}

}
