package edu.fa;

import java.util.Comparator;

import edu.fa.model.Student;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
//		return s1.getName().compareTo(s2.getName());
        return Integer.valueOf(s1.getGrade()).compareTo(Integer.valueOf(s2.getGrade()));
    }
}
