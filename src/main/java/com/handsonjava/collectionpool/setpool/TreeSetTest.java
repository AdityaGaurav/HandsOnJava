package com.handsonjava.collectionpool.setpool;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void addElement() {
        Set<String> store = new TreeSet<>();
        store.add("Aditya");
//        store.add(null);
        store.add("101");
        store.add("QA");
        store.add("Aditya");
        store.add("Pramati");
//        store.add(null);

        System.out.println(store.size());
//Using for each loop
        for (String e : store) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        addElement();
    }
}
