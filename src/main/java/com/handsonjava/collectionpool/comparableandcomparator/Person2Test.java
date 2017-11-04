package com.handsonjava.collectionpool.comparableandcomparator;

import java.util.Arrays;

public class Person2Test {
    public static void main(String[] args) {
        PersonIntegrationComparatorInComparable[] persons = new PersonIntegrationComparatorInComparable[4];
        persons[0] = new PersonIntegrationComparatorInComparable();
        persons[0].setFirstName("Elvis");
        persons[0].setLastName("Goodyear");
        persons[0].setAge(56);

        persons[1] = new PersonIntegrationComparatorInComparable();
        persons[1].setFirstName("Stanley");
        persons[1].setLastName("Clark");
        persons[1].setAge(8);

        persons[2] = new PersonIntegrationComparatorInComparable();
        persons[2].setFirstName("Jane");
        persons[2].setLastName("Graff");
        persons[2].setAge(16);

        persons[3] = new PersonIntegrationComparatorInComparable();
        persons[3].setFirstName("Nancy");
        persons[3].setLastName("Goodyear");
        persons[3].setAge(69);

        System.out.println("Natural Order");

        for (int i=0; i<4; i++) {
            PersonIntegrationComparatorInComparable person = persons[i];
            String lastName = person.getLastName();
            String firstName = person.getFirstName();
            int age = person.getAge();
            System.out.println(lastName + ", " + firstName + ". Age:" + age);
        }

        Arrays.sort(persons, PersonIntegrationComparatorInComparable.LastNameComparator);
        System.out.println();
        System.out.println("Sorted by last name");

        for (int i=0; i<4; i++) {
            PersonIntegrationComparatorInComparable person = persons[i];
            String lastName = person.getLastName();
            String firstName = person.getFirstName();
            int age = person.getAge();
            System.out.println(lastName + ", " + firstName + ". Age:" + age);
        }

        Arrays.sort(persons, PersonIntegrationComparatorInComparable.FirstNameComparator);
        System.out.println();
        System.out.println("Sorted by first name");

        for (int i=0; i<4; i++) {
            PersonIntegrationComparatorInComparable person = persons[i];
            String lastName = person.getLastName();
            String firstName = person.getFirstName();
            int age = person.getAge();
            System.out.println(lastName + ", " + firstName + ". Age:" + age);
        }

        Arrays.sort(persons);
        System.out.println();
        System.out.println("Sorted by age");

        for (int i=0; i<4; i++) {
            PersonIntegrationComparatorInComparable person = persons[i];
            String lastName = person.getLastName();
            String firstName = person.getFirstName();
            int age = person.getAge();
            System.out.println(lastName + ", " + firstName + ". Age:" + age);
        }
    }
}
