package com.handsonjava.collectionpool.comparableandcomparator;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person, Person anotherPerson) {
        String lastName1 = ((Person) person).getLastName().toUpperCase();
        String firstName1 = ((Person) person).getFirstName().toUpperCase();
        String lastName2 = ((Person) anotherPerson).getLastName().toUpperCase();
        String firstName2 = ((Person) anotherPerson).getFirstName().toUpperCase();

        if (!(lastName1.equals(lastName2)))
            return lastName1.compareTo(lastName2);
        else
            return firstName1.compareTo(firstName2);
    }
}

