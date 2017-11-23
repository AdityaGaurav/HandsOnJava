package com.handsonjava.collectionpool.mappool;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private int uniqueIdNumber;

    Employee(int employeeId, String firstName, String lastName, int uniqueIdNumber) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniqueIdNumber = uniqueIdNumber;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public int getUniqueIdNumber() {
        return uniqueIdNumber;
    }

    public void setUniqueIdNumber(int uniqueIdNumber) {
        this.uniqueIdNumber = uniqueIdNumber;
    }

    public String toString() {
        return "First Name: " + firstName + "Last Name" + lastName + "employeeId: " + employeeId + " and uniqueIdNumber: " + uniqueIdNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getEmployeeId() != employee.getEmployeeId()) return false;
        if (getUniqueIdNumber() != employee.getUniqueIdNumber()) return false;
        if (getFirstName() != null ? !getFirstName().equals(employee.getFirstName()) : employee.getFirstName() != null)
            return false;
        return getLastName() != null ? getLastName().equals(employee.getLastName()) : employee.getLastName() == null;
    }

    @Override
    public int hashCode() {
        int result = getEmployeeId();
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + getUniqueIdNumber();
        return result;
    }
}
