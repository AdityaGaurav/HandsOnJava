package com.handsonjava.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJsonMapper {
    public static void main(String[] args) throws JsonProcessingException {
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setFName("Aditya");
        employeeInfo.setLName("Gaurav");
        employeeInfo.setId(12103);

        ObjectMapper objectMapper = new ObjectMapper();
        String empInfo = objectMapper.writeValueAsString(employeeInfo);
        System.out.println(empInfo);
        System.out.println(empInfo.contains("Aditya"));
    }
}
