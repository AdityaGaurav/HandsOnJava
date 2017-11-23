package com.handsonjava.collectionpool.collectionprac;

public class Employee implements Comparable<Employee> {
    String firstName;
    String lastName;
    int id;

    Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Employee o) {
//        String anotherFirstName = ((Employee) o).getFirstName();
//        return this.firstName.compareTo(anotherFirstName);
        int anotherId = ((Employee) o).getId();
        return this.id - anotherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (this.getId() != employee.getId()) return false;
        if (this.getFirstName() != null ? !this.getFirstName().equals(employee.getFirstName()) : employee.getFirstName() != null)
            return false;
        return this.getLastName() != null ? this.getLastName().equals(employee.getLastName()) : employee.getLastName() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + getId();
        return result;
    }
}
