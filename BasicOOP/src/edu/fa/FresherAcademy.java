package edu.fa;

import edu.fa.model.Employee;
import edu.fa.model.Manager;

public class FresherAcademy {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager  = new Manager("hoang mata");
        System.out.println(manager);
    }
}
