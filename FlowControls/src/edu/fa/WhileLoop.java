package edu.fa;

public class WhileLoop {
	public static void main(String[] args) {
		int [] ages = {2, 3, 4, 5, 6, 7, 45, 345, 2321};
		int index = 0;
		while (ages[index] <= 32){
			System.out.println(ages[index]);
			index++;
		}
	}
}
