package edu.fa;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ListSample {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(2025);
        list.add("Fresher Academy");
        list.add(new Date());

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(2));

        System.out.println("==================");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("==================");

        Object object = list.get(0);
        Integer number = (Integer) object;
        System.out.println(number);
        System.out.println("==================");
        List<Integer> numberList = new LinkedList<>();
        numberList.add(1232);
        numberList.add(32134);
        numberList.add(1431);
        numberList.add(246435);
        numberList.add(135640);
        numberList.add(353640);
        numberList.add(532543);
        numberList.add(80523543);

        TreeSet<Integer> treeSet = new TreeSet<>(numberList);
        System.out.println(treeSet);
    }
}
