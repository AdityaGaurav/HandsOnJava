package com.handsonjava.collectionpool.mappool;

import java.util.*;

/**
 * Created by adityag on 2/9/17.
 */
public class TreeMapBits {

    public static void createTreeMap() {
        TreeMap<String, String> details = new TreeMap<String, String>();
        details.put("D-101", "Aditya");
        details.put("D-102", "Gaurav");
        details.put("D-103", null);
        details.put("C-104", "Dipika");
        details.put("D-105", "Anand");
        //details.put(null, "Anand");
        String value = details.put("D-101", "Nagu");
        Set<Map.Entry<String, String>> st = details.entrySet();
        for (Map.Entry<String, String> itr : st) {
            System.out.print(itr.getKey() + " ");
            System.out.println(itr.getValue());
        }
        System.out.println(value);
        details.lastKey();

    }
    public static void main(String[] args) {
        createTreeMap();
    }
}
