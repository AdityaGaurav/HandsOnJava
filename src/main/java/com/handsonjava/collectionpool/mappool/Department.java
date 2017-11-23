package com.handsonjava.collectionpool.mappool;

public class Department {
    private String departmentName;

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department: "+ departmentName;
    }
}
