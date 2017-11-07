package com.handsonjava.collectionpool.comparator;

import java.util.*;

public class ComparatoTest {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", "Zxscd", 25, 10000);
        empArr[1] = new Employee(20, "Arun", "Zxscd", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", "Zxscd", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", "Zxscd", 32, 50000);
        Arrays.sort(empArr,new MyCustomComparator());
//        for (Employee employee : empArr) {
//            System.out.println(employee);
//        }

//        List<Employee> employees = new ArrayList<>();
//        employees.add(empArr[0]);
//        employees.add(empArr[1]);
//        employees.add(empArr[2]);
//        employees.add(empArr[3]);
        List<Employee> employees = Arrays.asList(
                new Employee(10, "Mikey", "Zxscd", 25, 10000),
                new Employee(20, "Arun", "Zxscd", 29, 20000),
                new Employee(5, "Lisa", "Zxscd", 35, 5000),
                new Employee(1, "Pankaj", "Zxscd", 32, 50000)
        );
        Collections.sort(employees, new MyCustomComparator());
//        System.out.println(employees);
//        for(Employee employee: employees){
//            System.out.println(employee);
//        }

        Set<Employee> employees1 = new HashSet<>();
        employees1.add(new Employee(10, "Mikey", "Zxscd", 25, 10000));
        employees1.add(new Employee(20, "Arun", "Zxscd", 29, 20000));
        employees1.add(new Employee(5, "Lisa", "Zxscd", 35, 5000));
        employees1.add(new Employee(1, "Pankaj", "Zxscd", 32, 50000));
        employees1.add(new Employee(1, "Pankaj", "Zxscd", 32, 50000));
        for(Employee employee: employees1){
            System.out.println(employee);
        }
//        Collections.sort(employees1, new MyCustomComparator());
    }
}
