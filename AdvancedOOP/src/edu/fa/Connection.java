package edu.fa;

public class Connection {
//	public final String EMAIL = "Fresher.Academ@gmail.com";
	public final String EMAIL;
	
	public Connection() {
		EMAIL = "Fresher.Academ@gmail.com";
	}
	
	public void sendEmail() {
		System.out.println("Sending email to " + EMAIL);
	}
}
