package com.handsonjava.collectionpool.setpool;

import java.util.*;

/**
 * Created by adityag on 2/26/17.
 */
public class SetClasses {

    //    HashSet
    public static void addElement() {
        Set<String> store = new HashSet<String>();
        store.add("Aditya");
        store.add("101");
        store.add(null);
        store.add("QA");
        store.add("Pramati");
        store.add(null);

        System.out.println(store.size());
//Using for each loop
        for (String e : store) {
            System.out.println(e);
        }

//        Using Iterator

//        Iterator<String> itr = store.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
    }

    //Maintains the order of insertion
    public static void addElementLinkedHashSet() {
        LinkedHashSet<String> store = new LinkedHashSet<String>();
        store.add("Aditya");
        store.add("101");
        store.add("QA");
        store.add("Pramati");
        store.add(null);

        for (String e : store) {
            System.out.println(e);
        }

        System.out.println(store.size());
        System.out.println(store.contains("101"));
        System.out.println(store.remove(null));
        System.out.println(store.size());
        Iterator<String> itr = store.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    //Doesn't accept null value
//    Store object in sorted order
    public static void addElementTreeSet() {
        TreeSet<String> store = new TreeSet<String>();
        store.add("Aditya");
        store.add("101");
        store.add("QA");
        store.add("Pramati");
//        store.add(null); //java.lang.NullPointerException

        System.out.println(store.size());
//Using for each loop
        for (String e : store) {
            System.out.println(e);
        }
    }

    public static void allAdd() {
        HashSet<String> fruitsStore = new HashSet<String>();
        LinkedHashSet<String> fruitMarket = new LinkedHashSet<String>();
        TreeSet<String> fruitBuzz = new TreeSet<String>();


        for (String fruit : Arrays.asList("mango", "apple", "banana")) {
            fruitsStore.add(fruit);
            fruitMarket.add(fruit);
            fruitBuzz.add(fruit);
        }

        //no ordering in HashSet – elements stored in random order
        System.out.println("Ordering in HashSet :" + fruitsStore);

        //insertion order or elements – LinkedHashSet storeds elements as insertion
        System.err.println("Order of element in LinkedHashSet :" + fruitMarket);

        //should be sorted order – TreeSet stores element in sorted order
        System.out.println("Order of objects in TreeSet :" + fruitBuzz);


    }

    public static void main(String[] args) {
        addElement();
    }
}
