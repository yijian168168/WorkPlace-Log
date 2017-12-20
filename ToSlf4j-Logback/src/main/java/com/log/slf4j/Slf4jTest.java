package com.log.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {

    private static Logger log = LoggerFactory.getLogger(Slf4jTest.class);

    public static void test() {
        log.info("................Slf4jTest..............SUCCESS................");
    }
}
