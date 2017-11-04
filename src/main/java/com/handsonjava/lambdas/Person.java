package com.handsonjava.lambdas;

import com.sun.istack.internal.NotNull;

import java.util.Comparator;

public class Person {
    @NotNull private String firstName;
    @NotNull private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    Comparator comparator = new Comparator() {
//        @Override
//        public int compare(Object o1, Object o2) {
//            Person p1 = null, p2 = null;
//            if (o1 instanceof Person)
//                p1 = (Person) o1;
//            if (o2 instanceof Person)
//                p2 = (Person) o2;
//            if (p1.getLastName().equalsIgnoreCase(p2.getLastName())) {
//                return p1.getLastName().compareTo(p2.getLastName());
//            }
//            return p1.getLastName().compareTo(p2.getLastName());
//
//        }
//    };
//    Comparator comparatorLambda = (o1, o2) -> {
//        Person p1 = null, p2 = null;
//        if (o1 instanceof Person)
//            p1 = (Person) o1;
//        if (o2 instanceof Person)
//            p2 = (Person) o2;
//        if (p1.getLastName().equalsIgnoreCase(p2.getLastName())) {
//            return p1.getLastName().compareTo(p2.getLastName());
//        }
//        return p1.getLastName().compareTo(p2.getLastName());
//    };

    @Override
    public String toString() {
        return "Person [First Name: " + firstName + " Last Name: " + lastName + " Age: " + age + " ]";
    }
}
