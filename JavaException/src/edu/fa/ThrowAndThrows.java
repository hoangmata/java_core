package edu.fa;

public class ThrowAndThrows {
	public static void main(String[] args) {
		ThrowAndThrows tat = new ThrowAndThrows();
		try {
			tat.checkStatus();
			tat.connectDatabase();
		}catch(EducationException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void connectDatabase(){
		throw new NullPointerException();
	}
	
	public void checkStatus() throws EducationException{
		 throw new EducationException("Out of slot");
	}
}
