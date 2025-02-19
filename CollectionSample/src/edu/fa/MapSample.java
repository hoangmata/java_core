package edu.fa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapSample {

    public static void main(String[] args) {
        Map<Integer, String> resultMap = new HashMap<>();
        resultMap.put(2034, "Good");
        resultMap.put(2020, "Excellent");
        resultMap.put(2012, "Good");

        System.out.println(resultMap.size());
        String result = resultMap.get(2018);
        System.out.println(result);

        Set<Integer> keySet = resultMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        Integer key = 0;
        while (iterator.hasNext()) {
            key = iterator.next();

            System.out.println(key + " " + resultMap.get(key));
        }
        System.out.println("==================");

//		the solution sorting in map
//		using a tree map
        System.out.println("Solution one: Using a tree map");
        TreeMap<Integer, String> sorted = new TreeMap<>(resultMap);
        Set<Integer> keySet2 = sorted.keySet();
        Iterator<Integer> iterator2 = keySet2.iterator();
        Integer key1 = 0;
        while (iterator2.hasNext()) {
            key1 = iterator2.next();
            System.out.println(key1 + " " + resultMap.get(key1));
        }
        System.out.println("==================");

//		using a sort by key
        System.out.println("Solution two: Using a sort by key");
        List<Integer> key2 = new ArrayList<>(resultMap.keySet());
        Collections.sort(key2);
        Set<Integer> key3 = sorted.keySet();
        Iterator<Integer> iterator3 = key3.iterator();
        Integer key4 = 0;
        while (iterator3.hasNext()) {
            key4 = iterator3.next();
            System.out.println(key4 + " " + resultMap.get(key1));
        }
    }
}
