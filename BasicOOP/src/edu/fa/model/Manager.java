package edu.fa.model;

public class Manager {
    private String name;
    
    public Manager(){
        System.out.println("Created a manager object without name");
    }

    public Manager(String name){
        System.out.println("Created a manager object with name: " + name);
    }   

    public void report(Employee employee) throws Exception{
        System.out.println(employee.getName());
    }

    public void report(Developer developer){
        developer.work();
    }
}