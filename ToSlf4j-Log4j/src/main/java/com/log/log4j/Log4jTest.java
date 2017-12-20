package com.log.log4j;

import org.apache.log4j.Logger;

public class Log4jTest {

    private static Logger log = Logger.getLogger(Log4jTest.class);

    public static void test(){
        log.info("................Log4jTest..............SUCCESS................");
    }
}
