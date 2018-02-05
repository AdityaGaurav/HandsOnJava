package com.practicejava.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingTest2 {
    static final Logger logger = LogManager.getLogger();

    //static final Logger logger = LogManager.getLogger(LoggingTest2.class.getName());
    //static final Logger logger = LogManager.getLogger("AdityaGaurav");
    public void doIt() {
        Logger logger1 = LogManager.getRootLogger();
        System.out.println(logger1);
        System.out.println(logger);
        logger.fatal("Fatal" + LoggingTest2.class.getName());
        logger.error("error" + LoggingTest2.class.getName());
        logger.warn("warn again" + LoggingTest2.class.getName());
        logger.info("info" + LoggingTest2.class.getName());
        logger.debug("Debug Again" + LoggingTest2.class.getName());
        logger.trace("trace" + LoggingTest2.class.getName());
    }
}
