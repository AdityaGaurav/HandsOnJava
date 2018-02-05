package com.handsonjava.objectmapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonToObjectMapper {

    static String jsonString = "[\n" +
            "  {\n" +
            "    \"beneficiaryName\": \"TEST BENIFICIARY\",\n" +
            "    \"dateOfBirth\": \"1970-01-01\",\n" +
            "    \"name\": \"Father\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"beneficiaryName\": \"TEST BENIFICIARY\",\n" +
            "    \"dateOfBirth\": \"1970-01-01\",\n" +
            "    \"name\": \"Mother\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"beneficiaryName\": \"TEST BENIFICIARY\",\n" +
            "    \"dateOfBirth\": \"1970-01-01\",\n" +
            "    \"name\": \"Spouse\"\n" +
            "  }\n" +
            "]";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        EmployeePolicyNomineeInfo[] employeeAccidentalPolicyInfo = mapper.readValue(jsonString, EmployeePolicyNomineeInfo[].class);
        for(EmployeePolicyNomineeInfo employeeAccidentalPolicyInfo1 : employeeAccidentalPolicyInfo){
            System.out.println(employeeAccidentalPolicyInfo1);
        }
    }
}
