package edu.fa;

public class VariableInitialization {
	private String databaseConnnection;
	private final String IP_ADDRESS = "127.0.0.1";
	
	public void checkVariables() {
		System.out.println(databaseConnnection);
		System.out.println(IP_ADDRESS);
	}
}
 