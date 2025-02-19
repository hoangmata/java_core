package edu.fa;

import java.util.ArrayList;
import java.util.List;

public class GenericCollection {

    public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		diamond operator
        List<Integer> yearList = new ArrayList<>();
        yearList.add(2025);
        yearList.add(2030);
        yearList.add(2040);

        Object number = yearList.get(0);
        System.out.println(number);
        System.out.println("==================");
        for (int i = 0; i < yearList.size(); i++) {
            System.out.println(yearList.get(i));
        }
        System.out.println("==================");
        for (Integer i : yearList) {
            System.out.println(i);
        }
        System.out.println("==================");
    }

}
