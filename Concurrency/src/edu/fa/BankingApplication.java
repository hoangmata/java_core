package edu.fa;

public class BankingApplication {

	public static void main(String[] args) {
		Account account = new Account(80000);
		
		Customer customer1 = new Customer("Hoang", account);
		Customer customer2 = new Customer("Mata", account);
		
		Thread thread1 = new Thread(customer1);
		Thread thread2 = new Thread(customer2);
		
		thread1.start();
		thread2.start();
	}

}
