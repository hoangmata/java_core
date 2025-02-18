package edu.fa;

public class StringPool {

	public static void main(String[] args) {
		String s1 = "Fresher";
		String s2 = "Fresher";
		
		String s3 = "Academy";
		
		System.out.println(s1 + s3);
		
		String s4 = new String("Fresher");
		System.out.println(s4.intern());
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		
	}
}
