package com.handsonjava.collectionpool.mappool;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by adityag on 2/8/17.
 */
public class MapInterFace {

    public static void useMap() {
        Map<Integer, String> empDetails = new HashMap<Integer, String>();

        String value = empDetails.put(1, "Aditya");
        empDetails.put(2, "Gaurav");
        empDetails.put(3, "Anand");
        empDetails.put(9, "Upadhyay");
        empDetails.put(5, "Dipika");
        empDetails.put(6, null);
        empDetails.put(7, "Kartik");
        String value2 = empDetails.put(7, "Sid");
        empDetails.put(null, null);

        Set<Map.Entry<Integer, String>> st = empDetails.entrySet();
        for (Map.Entry<Integer, String> itr : st) {
            System.out.print(itr.getKey() + " ");
            System.out.print(itr.getValue() + "\n");
        }

        Set<Map.Entry<Integer, String>> set = empDetails.entrySet();
        Iterator<Map.Entry<Integer, String>> setItr = set.iterator();
        while (setItr.hasNext()) {
            Map.Entry<Integer, String> entry = setItr.next();
            System.out.print(entry.getKey() + " ");
            System.out.print(entry.getValue() + "\n");
        }

        System.out.println("====================");
        Set<Integer> st1 = empDetails.keySet();
        Iterator<Integer> itr = st1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("====================");
        for (Integer key : empDetails.keySet()) {
            System.out.print(key + " ");
            System.out.print(empDetails.get(key) + "\n");

        }
        System.out.println("Collection view is: "+ empDetails.values());

        System.out.println(empDetails.size());
        System.out.println(empDetails);


    }
    public void mapPrac(){
        Map<Integer, String> empDetails =new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }


    public static void main(String[] args) {
        useMap();
    }

}
