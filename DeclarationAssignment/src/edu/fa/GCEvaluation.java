package edu.fa;

public class GCEvaluation {

	@Override
	public void finalize() throws Throwable{
		super.finalize();
		System.out.println("It is finalized...");
	}
	
	public static void main(String[] args) {
//		GCEvaluation gce1 = new GCEvaluation();
//		GCEvaluation gce2 = new GCEvaluation();
//		gce1 = gce2;
//		gce1 = null;
//		gce2 = null;
		new GCEvaluation();
//		System.gc();
		Runtime.getRuntime().gc();
		int count = 0;
		while(count++ < 5) {
			try {
				Thread.sleep(1000);
				System.out.println("Waiting...");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
