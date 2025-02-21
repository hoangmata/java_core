package edu.fa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BatchJob {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		

		for (int i = 0; i < 10; i++) {
			es.execute(new Worker(Integer.valueOf(i).toString()));
		}
		es.shutdown();
		System.out.println("Finished");
		es.execute(new Worker("new"));
	}
}
