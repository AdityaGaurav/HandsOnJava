package com.handsonjava.annotation;

public class UniteTest {

    @TestCaseId(testCaseId = "QA-1234")
    @Priority(priority = "High")
    public static void testYourCode(){
        System.out.println("Test your code");
    }
    public static void main(String[] args){
        testYourCode();
    }

}
