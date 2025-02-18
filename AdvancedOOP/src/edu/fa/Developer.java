package edu.fa;

public class Developer extends Employee	{
	
	public void move() {
		System.out.println("Move from Employee");
	}
	
	@Override
	public void work(String location) {
		System.out.println("Working of Developer");
	}

	@Override
	public String toString() {
	
		return super.toString();
	}
}
