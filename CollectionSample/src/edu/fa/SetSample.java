package edu.fa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import edu.fa.model.Student;

public class SetSample {

    public static void main(String[] args) {
//		three solution sorting in HashSet
        Set<Integer> set_1 = new HashSet<>();
        set_1.add(2018);
        set_1.add(2040);
        set_1.add(2030);
        set_1.add(2025);
        System.out.println(set_1.size());
        System.out.println("==================");

        Iterator<Integer> iterator = set_1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==================");

//		solution one: using the Collections.sort() method
//		converting HashSet to ArrayList
        System.out.println("Solution one: using Collections.sort() method");
        ArrayList<Integer> arrayList = new ArrayList<>(set_1);
//		sorting the list
        Collections.sort(arrayList);
//		print array list
        System.out.println(arrayList);
        System.out.println("==================");

        Set<Integer> set_2 = new HashSet<>();
        set_2.add(2018);
        set_2.add(2040);
        set_2.add(2030);
        set_2.add(2025);
//		solution two: using a TreeSet
        System.out.println("Solution two: using a TreeSet");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(set_2);
        Iterator<Integer> iterator_2 = treeSet.iterator();
        while (iterator_2.hasNext()) {
            System.out.println(iterator_2.next());
        }
        System.out.println("==================");

        Set<Integer> set_3 = new HashSet<>();
        set_3.add(201843);
        set_3.add(2342);
        set_3.add(234);
        set_3.add(20243225);
//		solution three: using the stream().sorted() method
        System.out.println("Solution three: using the stream().sorted() method");
        HashSet<Integer> sortedHashSet = set_3.stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Iterator<Integer> iterator_3 = sortedHashSet.iterator();
        while (iterator_3.hasNext()) {
            System.out.println(iterator_3.next());
        }
        System.out.println("==================");

        Set<Student> setStudent = new HashSet<>();
        setStudent.add(new Student("Hoang", 3));
        setStudent.add(new Student("Huy", 2));
        setStudent.add(new Student("Thao", 13));
        setStudent.add(new Student("Thang", 23));

//		print set 
        List<Student> list = new ArrayList<>(setStudent);
        for (Iterator<Student> iterator2 = list.iterator(); iterator2.hasNext();) {
            Student student = (Student) iterator2.next();
            System.out.println(student);
        }
//		sort hash set
//		using comparable
        Collections.sort(list);
//		using comparator
//		Collections.sort(list, new StudentComparator());
        System.out.println("==================");

        System.out.println(list);
    }

}
