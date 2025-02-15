package edu.fa;

//import java.util.List;

public class FresherAcademy {
	private String name = "Fresher Academy";
	private int numberOfStudent;
	public void checkVariables() {
		System.out.println("Name: " + name);
		System.out.println("Number of student: " + numberOfStudent);
	}

//	public void train() {
//		
//	}
	public int getNumberOfStudent() {
		int numberOfStudent = 0;
		Student student= new Student();
		System.out.println(this.numberOfStudent);
//		Bussiness code to get Number of Student
		System.out.println(student);
		System.out.println(name);
		return numberOfStudent;
	}
//	public void close() {
//		
//	}
	
	public static void main(String[]args) {
		FresherAcademy fa = new FresherAcademy();
//		fa.checkVariables();
//		int number = fa.getNumberOfStudent();
//		System.out.println(number);
	}
}
