package com.handsonjava.sortingobjects;

import java.util.*;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee emp) {
        //let's sort the employee based on id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return (this.id - emp.id);
    }

    @Override
    //this is required to print the user friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }

    public static void main(String[] args) {
        //sorting object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);

//sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n" + Arrays.toString(empArr));
        List<Employee> employees = Arrays.asList(
                new Employee(10, "Mikey", 25, 10000),
                new Employee(20, "Arun", 29, 20000),
                new Employee(5, "Lisa", 35, 5000),
                new Employee(1, "Pankaj", 32, 50000)
        );
        Collections.sort(employees);
        System.out.println("Default Sorting of Employees list:\n" +employees );
//        Map <Employee ,Integer> employeeIntegerMap = new TreeMap<>(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if(o1.id == o2.id)
//                    return 0;
//                else if(o1.id < o2.id)
//                    return 1;
//                return -1;
//            }
//        });
        Map<Employee, Integer> employeeIntegerMap = new TreeMap<>(
                (o1,o2)-> o1.id == o2.id? 0 :o1.id< o2.id? 1: -1);

        employeeIntegerMap.put(new Employee(10, "Mikey", 25, 10000),1);
        employeeIntegerMap.put(new Employee(20, "Arun", 29, 20000),2);
        employeeIntegerMap.put(new Employee(5, "Lisa", 35, 5000),3);
        employeeIntegerMap.put(new Employee(1, "Pankaj", 32, 50000),4);
        for(Map.Entry<Employee,Integer> itr : employeeIntegerMap.entrySet()){
            System.out.println(itr.getKey().id+" : " +itr.getKey().age);
        }
    }

}
