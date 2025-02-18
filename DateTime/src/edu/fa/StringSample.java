package edu.fa;

public class StringSample {
	
	public static void main(String[] args) {
		String s1 = "Fresher";
		System.out.println(s1);
		
		String s2 = new String("Academy");
		System.out.println(s2);
		
		StringSample ss = new StringSample();
		System.out.println(ss.toString());
		
		String year = "2017";
		Integer.parseInt(year);
		
		System.out.println(s1.toUpperCase());
	}
	
	@Override
	public String toString() {
		return "This is a String Sample";
	}
}
