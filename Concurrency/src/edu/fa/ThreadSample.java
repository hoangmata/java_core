package edu.fa;

public class ThreadSample {

	public static void main(String[] args) {
		CustomerThread customerThreadA = new CustomerThread();
		customerThreadA.setName("A");
		CustomerThread customerThreadB = new CustomerThread();
		customerThreadB.setName("B");
		customerThreadA.start();
		customerThreadB.start();
		System.out.println(customerThreadA.isAlive());
	}

}

class CustomerThread extends Thread{

	@Override
	public void run() {
		int count =0;
		while(count++ < 5) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		System.out.format("Customer thread %s is runing\n", Thread.currentThread().getName());
			System.out.format("Customer thread %s is runing %d\n", this.getName(), count);
		}
	}
	
}
