package edu.fa;

import java.util.Comparator;

import edu.fa.model.Student;

public class ReverseStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
//		return s2.getName().compareTo(s1.getName());
        return Integer.valueOf(s2.getGrade()).compareTo(Integer.valueOf(s1.getGrade()));
    }
}
