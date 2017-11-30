package com.handsonjava.practice.lambda;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private String middleName;

    Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        }
//        Person person = null;
//        if (obj instanceof Person) {
//            person = (Person) obj;
//        }
//        if (!this.getFirstName().equals(person.getFirstName())) {
//            return false;
//        }
//        if (!this.getMiddleName().equals(person.getMiddleName())) {
//            return false;
//        }
//        return this.getLastName().equals(person.getLastName());
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (!getFirstName().equals(person.getFirstName())) return false;
        if (!getLastName().equals(person.getLastName())) return false;
        return getMiddleName().equals(person.getMiddleName());
    }

    @Override

    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getMiddleName().hashCode();
        return result;
    }

    @Override
    public int compareTo(Person o) {
        return this.firstName.compareTo(o.firstName);
    }
}
