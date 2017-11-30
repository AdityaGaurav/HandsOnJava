package com.handsonjava.collectionpool.setpool;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    public static void addElement() {
        Set<String> store = new LinkedHashSet<>();
        store.add("Aditya");
        store.add(null);
        store.add("101");
        store.add("QA");
        store.add("Aditya");
        store.add("Pramati");
        store.add(null);

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
