package com.handsonjava.collectionpool.mappool;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeTest {
    public static void main(String[] args) {
        Map<Employee, Department> employeeDepartmentMap = new HashMap<>();
        employeeDepartmentMap.put(new Employee(101, "Aditya", "Gaurav", 1211111), new Department("Computer Science"));
        employeeDepartmentMap.put(new Employee(109, "ZAditya", "KGaurav", 1131111), new Department("EComputer Science"));
        employeeDepartmentMap.put(new Employee(210, "MAditya", "SGaurav", 1111411), new Department("MComputer Science"));
        employeeDepartmentMap.put(new Employee(999, "OAditya", "PGaurav", 1111119), new Department("IComputer Science"));
        employeeDepartmentMap.put(new Employee(376, "XAditya", "HGaurav", 1911111), new Department("VComputer Science"));
        employeeDepartmentMap.put(new Employee(110, "CAditya", "BGaurav", 1114111), new Department("QComputer Science"));
        employeeDepartmentMap.put(new Employee(101, "Aditya", "Gaurav", 1211111), new Department("Computer Science2"));
        System.out.println(employeeDepartmentMap.size());
        for(Employee e : employeeDepartmentMap.keySet()){
            System.out.println(e.getEmployeeId());
            System.out.println(e.getFirstName());
            System.out.println(e.getLastName());
            System.out.println(e.getUniqueIdNumber());
            System.out.println(employeeDepartmentMap.get(e).getDepartmentName());
            System.out.println("========================================");
        }
        for(Map.Entry<Employee,Department> employeeDepartmentEntry: employeeDepartmentMap.entrySet()){

            System.out.println(employeeDepartmentEntry.getKey().getEmployeeId()+" "+employeeDepartmentEntry.getValue().getDepartmentName().equalsIgnoreCase("A"));
        }

        System.out.println(employeeDepartmentMap.get(new Employee(110, "CAditya", "BGaurav", 1114111)));
    }
}
