package com.handsonjava.collectionpool.comaprable;

import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);
//        Arrays.sort(empArr);
//        for (Employee employee : empArr) {
//            System.out.println(employee);
//        }

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10, "Mikey", 25, 10000));
        employees.add(new Employee(20, "Arun", 29, 20000));
        employees.add(new Employee(5, "Lisa", 35, 5000));
        employees.add(new Employee(1, "Pankaj", 32, 50000));
        employees.add(new Employee(5, "Lisa", 35, 5000));

//        Collections.sort(employees);
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }

        Set<Employee> employees1 = new HashSet<>();
        employees1.add(new Employee(10, "Mikey", 25, 10000));
        employees1.add(new Employee(20, "Arun", 29, 20000));
        employees1.add(new Employee(5, "Lisa", 35, 5000));
        employees1.add(new Employee(1, "Pankaj", 32, 50000));
        employees1.add(new Employee(5, "Lisa", 35, 5000));
//        for(Employee employee: employees1){
//            System.out.println(employee);
//        }

        Employee employee = new Employee(10, "Mikey", 25, 10000);
        System.out.println(employee.equals(empArr[0]));
    }
}
