package com.practicejava.comparstorandcomparable;

public class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private String middleName;
    private int employeeId;


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

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getEmployeeId() != employee.getEmployeeId()) return false;
        if (!getFirstName().equals(employee.getFirstName())) return false;
        if (!getLastName().equals(employee.getLastName())) return false;
        return getMiddleName() != null ? getMiddleName().equals(employee.getMiddleName()) : employee.getMiddleName() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + (getMiddleName() != null ? getMiddleName().hashCode() : 0);
        result = 31 * result + getEmployeeId();
        return result;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }
}
