package edu.fa;

public class Employee extends Person{
	public void move() {
		System.out.println("Move from Person");
	}
	public void work(String location) {
		System.out.println("Working at " + location);
	}
}
