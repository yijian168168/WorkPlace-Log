package com.log.log4j2;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4j2Test {

    private static Logger log = LogManager.getLogger(Log4j2Test.class);

    public static void test(){
        log.info("................Log4j2Test..............SUCCESS................");
    }
}
