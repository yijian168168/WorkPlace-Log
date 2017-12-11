package com.logger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by QR on 2016/9/6.
 */
public class Log4jLoggerTest {

    private static Logger log = LogManager.getLogger(Log4jLoggerTest.class);

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            log.info("++++++++++++++++++++++++++++++++i am test, +++++++++++++++++++++++++++++++++++++++++" + i);
        }
    }
}
