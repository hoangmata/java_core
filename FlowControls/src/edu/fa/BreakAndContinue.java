package edu.fa;

public class BreakAndContinue {

	public static void main(String[] args) {
		int [] numbers = {1, 3, 4, 5, 6, 7, 8};
		for (int i = 0; i < numbers.length; i++) {
			if( i == 3) {
				continue;
			}
			System.out.println(i + " : " + numbers[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			if( i == 3) {
				break;
			}
			System.out.println(i + " : " + numbers[i]);
		}
	}

}
