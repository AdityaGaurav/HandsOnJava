package com.handsonjava.collectionpool.collectionprac;

import java.util.*;

public class HashSetPrac {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        strings.add("A");
        strings.add("B");
        strings.add("Z");
        strings.add("O");
        strings.add("A");
        try {
            strings.add(null);
            strings.add(null);
        } catch (NullPointerException e) {
            System.out.println("Found null value");
        }
        System.out.println(strings.size());
        for (String s : strings) {
            try {
                System.out.println(s);
            } catch (NullPointerException e) {
                System.out.println("Found null value");
            }
        }
        Set<String> strings2 = new HashSet<>();
        strings2.add("A");
        strings2.add("B");
        strings2.add("Z");
        strings2.add("O");
        strings2.add("A");

        strings2.add(null);
        strings2.add(null);

        System.out.println(strings2.size());
        for (String s : strings2) {
            try {
                System.out.println(s);
            } catch (NullPointerException e) {
                System.out.println("Found null value");
            }
        }
//        Iterator<String> stringIterator = strings.iterator();
//        while (stringIterator.hasNext()){
//            System.out.println(stringIterator.next());
//            stringIterator.remove();
//        }
        System.out.println(strings.size());
//        while (stringIterator.hasNext()){
//            System.out.println(stringIterator.next());
//
//        }
        Employee e4 = new Employee("Adit", "dg", 1);
        Set<Employee> employee = new LinkedHashSet<>();
        employee.add(new Employee("Adit", "dg", 1));
        employee.add(new Employee("Adsit", "vg", 95));
        employee.add(new Employee("Adict", "ng", 16));
        employee.add(new Employee("Acdit", "ig", 91));
        employee.add(new Employee("Adit", "dg", 1));
        employee.add(e4);

        System.out.println(employee.size());
        for (Employee e : employee) {
            System.out.print(e.getFirstName() + " ");
            System.out.print(e.getLastName() + " ");
            System.out.println(e.getId());
        }
        Set<Employee> employee2 = new HashSet<>();
        employee2.add(new Employee("Adit", "dg", 1));
        employee2.add(new Employee("Adsit", "vg", 95));
        employee2.add(new Employee("Adict", "ng", 16));
        employee2.add(new Employee("Acdit", "ig", 91));
        employee2.add(new Employee("Adit", "dg", 1));
        employee2.add(null);
        System.out.println(employee2.size());
        for (Employee e : employee2) {
            System.out.print(e.getFirstName() + " ");
            System.out.print(e.getLastName() + " ");
            System.out.println(e.getId());
        }


//        Set<Employee> employees = new LinkedHashSet<>(employee);
//        for (Employee e : employee) {
//            System.out.print(e.getFirstName()+" ");
//            System.out.print(e.getLastName()+" ");
//            System.out.println(e.getId());
//        }
    }
}
