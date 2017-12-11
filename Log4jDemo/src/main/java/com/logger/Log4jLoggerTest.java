package com.logger;

import org.apache.log4j.Logger;

/**
 * Created by QR on 2016/9/6.
 */
public class Log4jLoggerTest {

    private static Logger log = Logger.getLogger(Log4jLoggerTest.class);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            log.info("++++++++++++++++++++++++++++++++i am test, +++++++++++++++++++++++++++++++++++++++++" + i);
        }
    }
}
