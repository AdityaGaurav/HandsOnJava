package com.handsonjava.collectionpool.comparator;

public class Employee {
    private int id;
    private String  firstName;

    public String getLastName() {
        return lastName;
    }

    private String  lastName;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }



    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String firstName,String lastName, int age, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }


    @Override
    //this is required to print the user friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", First name=" + this.firstName + ", Last name=" + this.lastName + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }
}
