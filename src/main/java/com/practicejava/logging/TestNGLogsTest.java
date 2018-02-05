package com.practicejava.logging;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGLogsTest {

    @Test
    public void test1() {
        try {
            Reporter.log("Main Method");
        } catch (Exception e) {
            Reporter.log("Main Method");
            Assert.fail(Thread.currentThread().getStackTrace()[1].getMethodName() + " FAILED, Line No: "
                    + e.getStackTrace()[0].getLineNumber() + " And Exception is", e);
        }
    }

    @Test
    public void test2() {
        Reporter.log("Main Method");
    }

    @Test
    public void test3() {
        Reporter.log("Main Method");
    }

    @Test
    public void test4() {
        Reporter.log("Main Method");
    }
}
