package com.practicejava.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LoggingTest {
    static Logger logger  = LogManager.getLogger(LoggingTest.class);

    public static Logger getLogger() {
        return logger;
    }

    @Test
    public static void main(String[] args) {
        Logger logger1 = LogManager.getRootLogger();
        System.out.println(logger1);
        System.out.println(logger);
        logger.fatal("Fatal");
        logger.error("error");
        LoggingTest2 loggingTest2 = new LoggingTest2();
        loggingTest2.doIt();
        logger.warn("warn again");
        logger.info("info");
        logger.debug("Debug Again");
        logger.trace("trace");
    }
}
