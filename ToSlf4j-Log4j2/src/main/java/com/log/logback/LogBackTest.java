package com.log.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackTest {

    private static Logger log = LoggerFactory.getLogger(LogBackTest.class);

    public static void test(){
        log.info("................LogBackTest..............SUCCESS................");
    }
}
