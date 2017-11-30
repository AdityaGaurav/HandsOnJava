package com.handsonjava.collectionpool.mappool;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {
    public static void useMap() {
        Map<Integer, String> empDetails = new LinkedHashMap<>();
        String value = empDetails.put(1, "Aditya");
        empDetails.put(2, "Gaurav");
        empDetails.put(3, "Anand");
        empDetails.put(9, "Upadhyay");
        empDetails.put(5, "Dipika");
        empDetails.put(null, null);
        empDetails.put(7, "Kartik");
        String value2 = empDetails.put(7, "Sid");
        empDetails.put(null, null);

        Set<Map.Entry<Integer, String>> st = empDetails.entrySet();
        for (Map.Entry<Integer, String> itr : st) {
            System.out.print(itr.getKey() + " ");
            System.out.print(itr.getValue() + "\n");
        }
    }
    public static void main(String[] args) {
        useMap();
    }
}
