package edu.fa.model;


public class Employee extends Person implements Member, Colleague{
    public String name;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Moving of Employee");
    }

    @Override
    public void showName(){
        System.out.println("Show Employee name");
    }

    @Override
    public void work() {
        
    }
}
