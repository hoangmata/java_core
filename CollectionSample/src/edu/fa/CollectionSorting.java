package edu.fa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fa.model.Student;

public class CollectionSorting {

    public static void main(String[] args) {
        List<Integer> yearList = new ArrayList<>();
        yearList.add(2025);
        yearList.add(2055);
        yearList.add(2040);

        for (Integer i : yearList) {
            System.out.println(i);
        }

        System.out.println("==================");

        Collections.sort(yearList);
        for (Integer i : yearList) {
            System.out.println(i);
        }

        List<String> nameList = new ArrayList<>();
        nameList.add("Fresher ");
        nameList.add("Academy");
        nameList.add("Hoang mata");
        Collections.sort(nameList);

        System.out.println("==================");

        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println("==================");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Hoang", 13));
        studentList.add(new Student("Mata", 6));
        studentList.add(new Student("Deft", 21));
//		Collections.sort(studentList);
        Collections.sort(studentList, new ReverseStudentComparator());
        System.out.println(studentList);

        System.out.println("==================");
    }

}
