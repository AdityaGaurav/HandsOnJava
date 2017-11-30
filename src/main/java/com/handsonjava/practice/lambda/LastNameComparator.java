package com.handsonjava.practice.lambda;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        String lastName = o1.getLastName();
        String lastName2 = o2.getLastName();
        return lastName.compareTo(lastName2);
    }
}
