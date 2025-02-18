package edu.fa;

public class Student extends Person{
	
	public Student() {
		System.out.println("Creating a new student");
	}
	
	public Student(String name) {
		System.out.println("Creating a new student with me  " + name);
	}
	
	public void study() {
		System.out.println("I am studying");
	}
	
	@SuppressWarnings("deprecation")
	public void study(String subject) {
		Enrollment erollment = new Enrollment();
		erollment.enroll();
		System.out.println("I am studying " + subject);
	}
	public void study(boolean active) {
		if(active) {
		System.out.println("I am studying");
		} else {
			System.out.println("I am not studying");
		}
	}
	@Override
	public void move() {
		System.out.println("Move method from Person");
	}
	
	public void move(String location) {
		System.out.println("I am moving to " + location);
	}
}
