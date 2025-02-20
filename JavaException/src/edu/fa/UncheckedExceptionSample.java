package edu.fa;

public class UncheckedExceptionSample {
	public static void main(String[] args) {
		int a = 6;
		int b = 0;
		if(b != 0) {
			System.out.println(a/b);
		}
		
//		Object obj = "Fresher Academy";
//		Integer number = (Integer)obj;
		UncheckedExceptionSample ues = new UncheckedExceptionSample();
//		ues.test("Fresher Academy");
		ues.test(null);
	}
	
//	public void test(String name) {
//		if(name != null) {
//		System.out.println(name.toUpperCase());
//		}
//	}
	public void test(String name) {
		try {
		System.out.println(name.toUpperCase());
		}catch (NullPointerException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}
