package com.handsonjava.practice.lambda;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        String firstName  = o1.getFirstName();
        String firstName2  = o2.getFirstName();
        return firstName.compareTo(firstName2);
    }
}
