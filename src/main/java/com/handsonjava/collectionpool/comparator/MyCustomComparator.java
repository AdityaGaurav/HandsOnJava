package com.handsonjava.collectionpool.comparator;

import java.util.Comparator;

public class MyCustomComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {
        Employee p1 = (Employee) obj1;
        Employee p2 = (Employee) obj2;
        String p1Name = p1.getFirstName() + " " + p1.getLastName();
        String p2Name = p2.getFirstName() + " " + p2.getLastName();
        return p1Name.compareTo(p2Name);
    }
}

