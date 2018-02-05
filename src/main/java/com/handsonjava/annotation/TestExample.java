package com.handsonjava.annotation;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

@TesterInfo(
        priority = TesterInfo.Priority.HIGH,
        createdBy = "Aditya",
        tags = {"sales", "test"}
)
public class TestExample {

    @Test
    @TestInfo(testDetails = "Default")
    @TestCaseInfo(type = "TestCase",
            testCaseDetails =
                    {"DC-101: User should be able to click on Update Button",
                            "DC-102: User should be"})
    void testA() {
        if (false)
            throw new RuntimeException("This test always failed");
    }

    @Test(enabled = false)
    void testB() {
        if (false)
            throw new RuntimeException("This test always passed");
    }

    @Test(enabled = true)
    void testC() {
        if (10 > 1) {
            // do nothing, this test always passed.
        }
    }

    @BeforeMethod
    public void printName(Method method) {
        System.out.println("method name:" + method.getName());
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {

        System.out.println("method name:" + result.getMethod().getMethodName());
    }

}
