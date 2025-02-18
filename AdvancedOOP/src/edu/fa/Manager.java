package edu.fa;

public class Manager {
	
	public static int numberOfProjects = 10;
	
	public static void addProject() {
		numberOfProjects++;
		System.out.println("New number of project: " + numberOfProjects);
	}
	
	public static void main(String[] args) {
		System.out.println(Manager.numberOfProjects);
		Manager.addProject();
		
		Manager projectManager = new Manager();
		System.out.println(projectManager.numberOfProjects);
		projectManager.addProject();
		
		Manager accountManager = new Manager();
		System.out.println(accountManager.numberOfProjects);
		accountManager.addProject();
	}
}
