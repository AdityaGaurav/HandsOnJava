package com.handsonjava.collectionpool.comparableandcomparator;

import java.util.Comparator;

public class PersonIntegrationComparatorInComparable implements Comparable<PersonIntegrationComparatorInComparable> {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(PersonIntegrationComparatorInComparable anotherPerson) {
        if (!(anotherPerson instanceof PersonIntegrationComparatorInComparable))
            throw new ClassCastException("A Person object expected.");
        int anotherPersonAge = ((PersonIntegrationComparatorInComparable) anotherPerson).getAge();
        return this.age - anotherPersonAge;
    }
    public static Comparator LastNameComparator = new Comparator() {
        public int compare(Object person, Object anotherPerson) {
            String lastName1 = ((PersonIntegrationComparatorInComparable) person).getLastName().toUpperCase();
            String firstName1 = ((PersonIntegrationComparatorInComparable) person).getFirstName().toUpperCase();
            String lastName2 = ((PersonIntegrationComparatorInComparable) anotherPerson).getLastName().toUpperCase();
            String firstName2 = ((PersonIntegrationComparatorInComparable) anotherPerson).getFirstName().toUpperCase();

            if (!(lastName1.equals(lastName2)))
                return lastName1.compareTo(lastName2);
            else
                return firstName1.compareTo(firstName2);
        }
    };

    public static Comparator FirstNameComparator = new Comparator() {
        public int compare(Object person, Object anotherPerson) {
            String lastName1 = ((PersonIntegrationComparatorInComparable) person).getLastName().toUpperCase();
            String firstName1 = ((PersonIntegrationComparatorInComparable) person).getFirstName().toUpperCase();
            String lastName2 = ((PersonIntegrationComparatorInComparable) anotherPerson).getLastName().toUpperCase();
            String firstName2 = ((PersonIntegrationComparatorInComparable) anotherPerson).getFirstName().toUpperCase();

            if (!(firstName1.equals(firstName2)))
                return firstName1.compareTo(firstName2);
            else
                return lastName1.compareTo(lastName2);
        }
    };
}
