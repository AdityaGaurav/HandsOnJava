package com.handsonjava.collectionpool.comparableandcomparator;

public class Person implements Comparable<Person> {
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
    public int compareTo(Person anotherPerson) {
        if (!(anotherPerson instanceof Person))
            throw new ClassCastException("A Person object expected.");
        int anotherPersonAge = ((Person) anotherPerson).getAge();
        return this.age - anotherPersonAge;
    }
}
