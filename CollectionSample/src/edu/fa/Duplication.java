package edu.fa;

import java.util.HashSet;
import java.util.Set;

import edu.fa.model.Student;

public class Duplication {

	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(new Student("Hoang", 13));
        studentSet.add(new Student("Mata", 6));
        studentSet.add(new Student("Deft", 21));
        System.out.println(studentSet);
        studentSet.add(new Student("Mata", 12));
        System.out.println(studentSet);
	}

}
