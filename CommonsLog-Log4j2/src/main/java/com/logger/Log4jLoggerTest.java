package com.logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by QR on 2016/9/6.
 */
public class Log4jLoggerTest {

    private static Log log = LogFactory.getLog(Log4jLoggerTest.class);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            log.info("++++++++++++++++++++++++++++++++i am test, +++++++++++++++++++++++++++++++++++++++++" + i);
        }
    }
}
